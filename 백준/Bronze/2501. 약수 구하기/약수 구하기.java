import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, K;
        N = sc.nextInt();
        K = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            if(N % i == 0) 
                K--;
            if(K == 0) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}
