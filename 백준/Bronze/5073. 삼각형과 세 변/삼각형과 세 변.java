import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[3];
            arr[0] = Integer.parseInt(st.nextToken());
            arr[1] = Integer.parseInt(st.nextToken());
            arr[2] = Integer.parseInt(st.nextToken());

            if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0) break;

            Arrays.sort(arr);

            int a = arr[0], b = arr[1], c = arr[2];

            if (a + b <= c) {
                System.out.println("Invalid");
                continue;
            }

            if (a == b && a == c)
                System.out.println("Equilateral");
            else if (a == b || a == c || b == c) {
                System.out.println("Isosceles");
            } else System.out.println("Scalene");
        }
    }
}
