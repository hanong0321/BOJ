import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int B = sc.nextInt();
        int sum = 0;

        for(char c : N.toCharArray()) {
            int num;
            if('0' <= c && c <= '9') {
                num = c - '0'; // '0' -> 0, '9' -> 9
            } else {
                num = c - 'A' + 10; // 'A' -> 10, 'B' -> 11 ... 'Z' -> 35
            }
            sum = sum * B + num; // ..
        }
        System.out.println(sum);
    }
}
