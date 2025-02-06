import java.util.Scanner;

public class Main {

    public static boolean chk(int num) {
        if (num < 2) return false; 

        int n = (int)Math.sqrt(num); 
        for(int i = 2; i <= n; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int sum = 0;
        int min = Integer.MAX_VALUE;

        for (int i = N; i <= M; i++) {
            if(chk(i)) {
                sum += i;
                min = Math.min(min, i);
            }
        }
        if(sum > 0) {
            System.out.println(sum);
            System.out.println(min);
        }
        else
            System.out.println(-1);
        sc.close(); 
    }
}
