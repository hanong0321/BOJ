import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static boolean chkGroupString(String str) {
        boolean[] visited = new boolean[26];
        char prev = ' ';

        for(char c : str.toCharArray()) {
            if(prev != c) {
                if(visited[c - 'a']) {
                    return false;
                }
                visited[c - 'a'] = true;
            }
            prev = c;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        sc.nextLine(); // 개행 문자 제거
        for (int i = 0; i < N; i++) {
            String str = sc.nextLine();
            if(chkGroupString(str)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
