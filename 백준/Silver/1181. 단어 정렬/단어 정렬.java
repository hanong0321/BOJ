import java.io.*;
import java.nio.Buffer;
import java.util.*;

public class Main {

    public static void swap(String [] arr, int idx1, int idx2) {
        String temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String [] list = new String[N];
        for (int i = 0; i < N; i++) {
            list[i] = br.readLine();
        }
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1 - i; j++) {
                if(list[j].length() > list[j + 1].length()) {
                    swap(list, j, j + 1);
                }
            }
        }
        list = Arrays.stream(list).distinct().toArray(String[]::new);
        N = list.length;

        int i = 0;
        while (i < N - 1) {
            int idx = i;
            while (idx + 1 < N && list[idx].length() == list[idx + 1].length()) {
                idx++;
            }
            Arrays.sort(list, i, idx + 1); // idx+1까지 정렬
            i = idx + 1;
        }

        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s).append("\n");
        }
        System.out.print(sb);
    }
}
