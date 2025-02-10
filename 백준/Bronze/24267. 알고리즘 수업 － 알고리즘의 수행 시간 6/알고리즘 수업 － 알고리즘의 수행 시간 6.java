import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        System.out.println((n-2) * (n-1) * (n) / 6);
        System.out.println(3);
    }
}

// 시그마 1부터 n-2까지의 삼각수의 합
// 1부터 m까지의 삼각수의 합 = m * (m+1) * (m+2) / 6