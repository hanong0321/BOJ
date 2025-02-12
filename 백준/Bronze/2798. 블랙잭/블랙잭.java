import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int range = Integer.parseInt(st.nextToken());
        int [] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            int a = arr[i];
            for (int j = i + 1; j < N; j++) {
                int b = arr[j];
                for (int k = j + 1; k < N; k++) {
                    int c = arr[k];
                    if( a + b + c <= range ) {
                        max = Math.max(max, a + b + c);
                    }
                }
            }
        }
        System.out.println(max);
    }
}
