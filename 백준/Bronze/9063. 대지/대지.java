import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int num1, num2;
        int xmax = Integer.MIN_VALUE, xmin = Integer.MAX_VALUE;
        int ymax = Integer.MIN_VALUE, ymin = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            xmax = Math.max(num1, xmax);
            xmin = Math.min(num1, xmin);
            ymax = Math.max(num2, ymax);
            ymin = Math.min(num2, ymin);
        }
        System.out.println((xmax - xmin) * (ymax - ymin));
    }
}