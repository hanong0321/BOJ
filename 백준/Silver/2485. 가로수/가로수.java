import java.io.*;
import java.util.*;

public class Main {

    public static int divide(int a, int b) {
        if(a % b == 0) return b;
        else return divide(b, a%b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int [] arr = new int[N];

        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(br.readLine());

        int [] gcdArr = new int[N - 1];
        for (int i = 0; i < N - 1; i++)
            gcdArr[i] = arr[i+1] - arr[i]; 

        int gcd = gcdArr[0];

        for (int i = 1; i < N - 1; i++) {
            gcd = divide(gcd, gcdArr[i]);
        }

        int cnt = 0;
        for(int i = 0; i < N - 1; i++) {
            cnt += (gcdArr[i] / gcd) - 1;
        }
        bw.write(cnt+ " ");
        bw.flush();
        bw.close();
    }
}
