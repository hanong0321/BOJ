import java.awt.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static String str;
    public static int s, t;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        s = 0; t = str.length() - 1;

        while(s <= t) {
            if(str.charAt(s) != str.charAt(t)) {
                System.out.println(0);
                return;
            }
            s++;
            t--;
        }
        System.out.println(1);
    }
}