import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, r = 6, f = 1, cnt = 1;
        N = sc.nextInt();
        while(true) {
            if(N <= f) {
                System.out.println(cnt);
                return;
            } 
            cnt++;
            f += r;
            r += 6;
        }
    }
}
