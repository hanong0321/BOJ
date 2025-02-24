import java.io.*;
import java.util.*;

public class Main {

    public static long minPrimeNum(long a) {
        if (a <= 2) return 2;

        long num = (a % 2 == 0) ? a + 1 : a; // 홀수부터 검사!

        while (true) {
            boolean primeChk = true;
            for (long i = 2; i * i <= num; i++) {
                if (num % i == 0) { // 나누어지면 소수 아님
                    primeChk = false;
                    break;
                }
            }
            if (primeChk) return num;
            num += 2; // 짝수는 소수 x 홀수만 검사
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            long num = Long.parseLong(br.readLine());
            bw.write(minPrimeNum(num) + "\n");

        }

        bw.close();
    }
}
