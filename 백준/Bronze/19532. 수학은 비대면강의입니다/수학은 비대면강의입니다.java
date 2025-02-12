import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d, e, f;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();
        f = sc.nextInt();

        for(int x = -999; x <= 999; x++) {
            for(int y = -999; y <= 999; y++) {
                if(a*x + b*y == c && d*x + e*y == f) {
                    System.out.println(x + " " + y);
                    return;
                }
            }
        }
    }
}
