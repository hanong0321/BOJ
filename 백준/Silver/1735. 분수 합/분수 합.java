import java.io.*;
import java.util.*;

public class Main {

    public static int divide(int a, int b) {
        if(a % b == 0) return b;
        else return divide(b, a%b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int num1Top = Integer.parseInt(st.nextToken());
        int num1Bottom = Integer.parseInt(st.nextToken());

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int num2Top = Integer.parseInt(st1.nextToken());
        int num2Bottom = Integer.parseInt(st1.nextToken());

        // 최소공배수 구해놓기
        int lcm = 0;
        if (num1Bottom > num2Bottom)
            lcm = (num1Bottom * num2Bottom) / divide(num1Bottom, num2Bottom);
        else
            lcm = (num1Bottom * num2Bottom) / divide(num2Bottom, num1Bottom);

        int num1Idx = lcm / num1Bottom;
        int num2Idx = lcm / num2Bottom;

        // 통분
        int sumTop = num1Top * num1Idx + num2Top * num2Idx;
        int sumBottom = lcm;


        // 합친 분자분모의 최대공약수 찾아서 1보다 크면 약분
        int gcd = 0;
        if (sumTop > sumBottom) gcd = divide(sumTop,  sumBottom);
        else gcd = divide(sumBottom, sumTop);

        if(gcd > 1)
            bw.write(sumTop / gcd + " " + sumBottom / gcd + " ");
        else
            bw.write(sumTop + " " + sumBottom);

        bw.flush();
        bw.close();
    }
}