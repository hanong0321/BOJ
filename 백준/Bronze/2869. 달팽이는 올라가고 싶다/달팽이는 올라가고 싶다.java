import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, V;
        A = sc.nextInt();
        B = sc.nextInt();
        V = sc.nextInt();
        int day = (V - A) / (A - B);
        if ((V - A) % (A - B) != 0) day++;
        System.out.println(day + 1); // 마지막날 포함
    }
}
