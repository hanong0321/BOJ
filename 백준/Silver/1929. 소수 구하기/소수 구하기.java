import java.io.*;
import java.util.*;

public class Main {

    public static boolean chkPrimeNum(int a) {

        if(a < 2) return false;
        
        for (long i = 2; i * i <= a; i++) {
            if (a % i == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int i = N; i <= M; i++)
            if(chkPrimeNum(i)) bw.write(i + "\n");

        bw.close();
    }
}
