import java.io.*;
import java.util.*;

public class Main {

    public static long divide(long a, long b) {
        if (a % b == 0) return b; // 나눠지면 b가 최소공배수
        else return divide(b, a%b); // 안나눠지면 a mod b의 값을 다시 b mod c 하기
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long num1 = Long.parseLong(st.nextToken());
        long num2 = Long.parseLong(st.nextToken());

        if(num1 > num2) bw.write( (num1 * num2) / divide(num1, num2) + "\n");
        else bw.write( (num1 * num2) / divide(num2, num1) + "\n");


        bw.flush();
        bw.close();
    }
}