import java.io.*;
import java.util.StringTokenizer;


public class Main {

    static int N, K;
    static int[] WList, VList;
    static int[][] dp;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st1.nextToken());
        K = Integer.parseInt(st1.nextToken());

        WList = new int[N]; // 무게
        VList = new int[N]; // 가치

        for (int i = 0; i < N; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            WList[i] = Integer.parseInt(st2.nextToken());
            VList[i] = Integer.parseInt(st2.nextToken());
        }

        // dp[i][j] = i개 까지 갔을 떄 , 최대 배낭 용량이 j 일때의 가치
        dp = new int[N + 1][K + 1];


        for (int i = 1; i <= N; i++) {
            for (int k = 0; k <= K; k++) {
                // 현재 물건의 가치가 최대 배낭 무게보다 크다면 그 전꺼 적용
                if(WList[i - 1] > k)
                    dp[i][k] = dp[i - 1][k];
                else { // 현재 물건 가치가 최대 배낭 무게보다 작거나 같으면
                    dp[i][k] = Math.max( // 미포함 vs 포함
                            dp[i-1][k],
                            VList[i - 1] + dp[i - 1][k - WList[i - 1]]
                    );
                }
            }
        }

        bw.write(dp[N][K] + "\n");
        bw.close();
    }
}
