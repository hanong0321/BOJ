import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num = 666;
        while(true) {
            String str = String.valueOf(num);
            if(str.contains("666")) N--;
            if(N == 0) {
                System.out.println(num);
                return;
            }
            num++;
        }
    }
}
