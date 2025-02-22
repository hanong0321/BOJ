import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Boolean> notLeasonList = new HashMap<>();
        for (int i = 0; i < N; i++) {
            notLeasonList.put(br.readLine(), null);
        }
        int cnt = 0;
        ArrayList<String> newList = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String str = br.readLine();
            if(notLeasonList.containsKey(str)) {
                cnt++;
                newList.add(str);
            }
        }

        Collections.sort(newList);

        bw.write(cnt + " ");
        bw.newLine();
        for(String str : newList) {
            bw.write(str);
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
