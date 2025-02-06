import java.util.Scanner;

public class Main {

    public static boolean chk(int num) {
        if (num < 2) return false; //

        int n = (int)Math.sqrt(num); //
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
        int cnt = 0;
        
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if(chk(num)) {
                cnt++;
            }
        }
        System.out.println(cnt);
        sc.close(); //
    }
}
