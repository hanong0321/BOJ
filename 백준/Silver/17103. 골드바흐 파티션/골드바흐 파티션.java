import java.io.*;

public class Main {

    static boolean [] PrimeArray = new boolean[1000001];

    public static void findPrime() {
        // 소수는 false, 짝수는 true
        PrimeArray[0] = PrimeArray[1] = true;

        for (int i = 2; i * i <= PrimeArray.length - 1; i++) {
            if(!PrimeArray[i]) { //소수라면
                for(int j = i * i; j <= PrimeArray.length - 1; j += i) {
                    PrimeArray[j] = true; // i의 배수는 소수 x
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        findPrime();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());

            int cnt = 0;
            for (int j = 2; j <= N / 2; j++) { // 반으로 나눠서 탐색하기
                if(!PrimeArray[j] && !PrimeArray[N - j])
                    cnt++;
            }
            bw.write(cnt + "\n");
        }
        bw.close();
    }
}
