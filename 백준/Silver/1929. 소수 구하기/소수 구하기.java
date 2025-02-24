import java.io.*;
import java.util.*;

public class Main {

    static boolean [] isPrime;

    public static void isPrime_fun(int n) {
        isPrime = new boolean [n + 1];

//        for (int i = 0; i < isPrime.length; i++) {
//            isPrime[i] = true;
//        }
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if(isPrime[i]) { //소수라면
                for(int j = i * i; j <= n; j += i) {
                    isPrime[j] = false; // i의 배수는 소수 x
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

            isPrime_fun(M); // 최대범위인 M까지만 구함

        for(int i = N; i <= M; i++)
            if(isPrime[i])
                bw.write(i + "\n");

        bw.close();
    }
}
