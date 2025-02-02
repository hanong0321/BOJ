import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static final int INT_MIN = Integer.MIN_VALUE;
    public static int []arr = new int[26];
    public static String str;


    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    str = sc.nextLine();

    for (int i = 0; i < str.length(); i++) {
        if('A' <= str.charAt(i) && str.charAt(i) <= 'Z') { // 65~90 대문자범위`
            arr[str.charAt(i) - 'A']++;
        }
        else{
            arr[str.charAt(i) - 'a']++; // 97
        }
    }
    int max = INT_MIN;
    char c = '?';
    for (int i = 0; i < arr.length; i++) {
        if(arr[i] > max) {
            max = arr[i];
            c = (char)(i + 'A');
        }
        else if(arr[i] == max) {
            c = '?';
        }
    }
        System.out.println(c);
    }
}
