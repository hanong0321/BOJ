import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Mincnt = Integer.MAX_VALUE;
        boolean exit = false;
        for(int x = 0; x <= N; x++) {
            for(int y = 0; y <= N; y++) {
                if(5 * x + 3 * y == N || 5 * x == N || 3 * y == N) {
                    exit = true;
                    Mincnt = Math.min(x + y, Mincnt);
                }
            }
        }
        if(exit) System.out.println(Mincnt);
        else System.out.println(-1);
    }
}
