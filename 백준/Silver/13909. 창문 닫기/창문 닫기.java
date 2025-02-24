import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        // 제곱수 = 1과 자기자신 + 제곱이 되는 수 => 홀수 개의 약수 => true
        // 나머지 수 = 짝수개의 약수 = false;
        // 1 ~ N 까지 제곱수의 갯수를 구하면됨
        for (int i = 1; i * i <= N; i++)
            cnt++;

        bw.write(cnt + " ");

        bw.close();
    }
}
