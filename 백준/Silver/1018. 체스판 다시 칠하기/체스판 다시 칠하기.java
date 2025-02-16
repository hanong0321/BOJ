import java.util.Scanner;

public class Main {

    public static int chk(char [][] board, int x, int y) {
        int cnt1 = 0;
        int cnt2 = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                char patternBW = ((i + j) % 2 == 0) ? 'B' : 'W'; // B시작
                char patternWB = ((i + j) % 2 == 0) ? 'W' : 'B'; // W시작

                if (board[x + i][y + j] != patternBW) cnt1++;
                if (board[x + i][y + j] != patternWB) cnt2++;
            }
        }
        return Math.min(cnt1, cnt2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        char [][] board = new char[N][M];

        for (int i = 0; i < N; i++) {
            String row = sc.next();
            // sc.next()는 공백을 기준으로 문자열을 하나씩 읽음
            for (int j = 0; j < M; j++) {
                board[i][j] = row.charAt(j);
            }
        }
        int minCnt = Integer.MAX_VALUE;
        for (int i = 0; i < N - 7; i++) {
            for (int j = 0; j < M - 7; j++) {
                minCnt = Math.min(minCnt, chk(board, i, j));
            }
        }
        System.out.println(minCnt);
    }
}