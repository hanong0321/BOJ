import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import static java.lang.Math.max;

public class Main {

    static int N;
    static int[] score;
    static int []dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        score = new int[N];
        dp = new int[N];

        for (int i = 0; i < N; i++) {
            score[i] = Integer.parseInt(br.readLine());
        }

        if (N == 1) {
            bw.write(score[0] + "\n");
            bw.close();
            return;
        }

        // 초기값 설정
        // dp[i] = i번쨰 계단까지의 합
        dp[0] = score[0];
        dp[1] = score[0] + score[1];

        if (N >= 3) {
            // 1,3번째 계단 vs 2,3번째 계단
            dp[2] = max(score[0] + score[2], score[1] + score[2]);
        }


        //점화식찾기
        //1. 연속된 경우
        //n = n + n-1 + n-3
        //2. 연속되지 않은 경우
        //n = n + n-2

        for (int i = 3; i < N; i++) {
            dp[i] = max(
                    // i - 2번쨰 까지의 합 + i 계단 점수 -> i 전을 뛰어넘음
                    dp[i - 2] + score[i],
                    // i, i - 1 계단 점수 (여기서 연속), i - 2 번쨰는 뛰어넘음, i - 3번째까지의 합
                    score[i] + score[i - 1] + dp[i - 3]

            );
        }

        bw.write(dp[N - 1] + "\n");

        bw.close();
    }
}
