import java.io.*;
import java.nio.Buffer;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashSet<String> wordList = new HashSet<>();
        int cnt = 0;

        for (int i = 0; i < N; i++)
            wordList.add(br.readLine());

        for (int i = 0; i < M; i++) {
            String str = br.readLine();
            if(wordList.contains(str))
                cnt++;
        }
        bw.write(cnt + " ");
        bw.flush();
        bw.close();
    }
}