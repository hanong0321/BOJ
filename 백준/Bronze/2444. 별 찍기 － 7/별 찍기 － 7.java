import java.util.Scanner;

public class Main {
    public static int N;
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       N = sc.nextInt();

       for(int i = 1; i <= N; i++) {
           for(int j = 0; j < N-i; j++)
               System.out.print(" ");
           for(int k = 0; k < i*2-1; k++)
               System.out.print("*");
           System.out.println();
       }
       for(int i = N - 1; i >= 1; i--) {
           for(int j = 0; j < N-i; j++)
               System.out.print(" ");
           for(int k = 0; k < i*2-1; k++)
               System.out.print("*");
           System.out.println();
       }
    }
}