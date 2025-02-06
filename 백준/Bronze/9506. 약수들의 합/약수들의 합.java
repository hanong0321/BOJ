import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int N = sc.nextInt();
            if(N == -1) break;

            int s = 0;
            int [] arr = new int[N];


            for(int i = 1; i <= N - 1; i++) {
                if(N % i == 0) {
                    arr[s++] = i;
                }
            }

            int sum = 0;
            for(int i = 0; i < s; i++) {
                sum += arr[i];
            }
            if(sum == N) {
                System.out.print(N + " = ");
                for(int j = 0; j < s - 1; j++) {
                    System.out.print(arr[j] + " + ");
                }
                System.out.println(arr[s - 1]);
            }
            else {
                System.out.println(N + " is NOT perfect.");
            }
        }
    }
}
