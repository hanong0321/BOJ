import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        N = sc.nextInt();

        // 몇번째 대각선인지 찾기
        int k = 1;
        while(k * (k + 1) / 2 < N) {
            k++;
        }
        int prev = (k - 1) * k / 2; // 이전 대각선 마지막
        int index = N - prev;

        int x, y;

        if(k % 2 == 1) { // 홀수 왼쪽 아 <- 오른쪽 위
            x = k - index + 1; // 1부터 시작이므로
            y = index;
        }
        else { // 짝수 왼쪽 아래 -> 오른쪽 위
            x = index;
            y = k - index + 1;
        }
        System.out.println(x + "/" + y);
    }
}
