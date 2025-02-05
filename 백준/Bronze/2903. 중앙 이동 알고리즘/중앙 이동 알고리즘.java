import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int pntSum = 0;
        int rowpnt = 2;
        for (int i = 0; i < N; i++) {
            rowpnt += (rowpnt -1);
        }
        System.out.println(rowpnt * rowpnt);
    }
}
