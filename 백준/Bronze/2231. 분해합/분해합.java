import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int min = Integer.MAX_VALUE;
        boolean exists = false;
        for (int i = 1; i <= N; i++) {
            int sum = i;
            int temp = i;
            while(temp > 0) {
                int m = temp % 10;
                sum += m;
                temp /= 10;
            }
            if(sum == N) {
                exists = true;
                min = Math.min(min, i);
            }
        }
        if(exists) System.out.println(min);
        else System.out.println(0);
    }
}
