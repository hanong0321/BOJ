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
        //Arrays.stream => 배열을 스트림 (Stream<String>)으로 변환
        // .distinct() 스트림에서 중복된 요소 제거 (Set 처럼 동작한다)
        // .toArray(String[]::new) 스트림의 요소들을 Stirng[]타입의 배열로 변환하여 반환
        N = list.length;

        int i = 0;
        while (i < N - 1) { // N = 13 // i < 12 까지니까 i == 11번 인덱스까지
            int idx = i;
            while (idx + 1 < N && list[idx].length() == list[idx + 1].length()) {
                idx++;
            }
            Arrays.sort(list, i, idx + 1); // i ~ idx 까지 정렬
            i = idx + 1;
        }

        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s).append("\n");
        }
        System.out.print(sb);
    }
}
