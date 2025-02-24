import java.io.*;
import java.util.*;

public class Main {

    static boolean [] isPrime;
    static ArrayList<Integer> list;

    public static void isPrime_fun(int n) {
        isPrime = new boolean [n + 1];

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

        while(true) {

            int n = Integer.parseInt(br.readLine());
            if(n == 0) break;

            isPrime_fun(2 * n);
            list = new ArrayList<>();

            for (int i = n + 1; i <= 2 * n; i++) {
                if (isPrime[i]) {
                    list.add(i);
                }
            }

            bw.write(list.size() + "\n");
        }

        bw.flush();
        bw.close();
    }
}
