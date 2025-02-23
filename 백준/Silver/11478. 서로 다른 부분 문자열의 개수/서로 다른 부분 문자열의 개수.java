import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        HashSet<String> list = new HashSet<>();
        int idx = 0;
        for (int i = 0; i < str.length(); i++) {
            idx++;
            int start = 0;
            int end = idx;
            while(end <= str.length()) {
                list.add(str.substring(start, end));
                start++;
                end++;
            }
        }

        bw.write(list.size() + " ");
        bw.flush();
        bw.close();
    }
}