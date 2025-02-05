import java.util.Scanner;

public class Main {
    public static int Quarter = 25, Dime = 10, Nickel = 5, Penny = 1;

    public static void divide(double change) {
        int Qcnt = 0, Dcnt = 0, Ncnt = 0, Pcnt = 0;
        while (change > 0) {
            if (change >= Quarter) {
                change -= Quarter;
                Qcnt++;
            } else if (change >= Dime) {
                change -= Dime;
                Dcnt++;
            } else if (change >= Nickel) {
                change -= Nickel;
                Ncnt++;
            } else if (change >= Penny) {
                change -= Penny;
                Pcnt++;
            }
        }
        System.out.println(Qcnt + " " + Dcnt + " " + Ncnt + " " + Pcnt + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            int change = sc.nextInt();
            divide(change);
        }
    }
}
