import java.io.*;
import java.nio.Buffer;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        Integer [] list = new Integer[s.length()];
        for (int i = 0; i < s.length(); i++) {
            list[i] = s.charAt(i) - '0';
        }
        Arrays.sort(list, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (int num : list)
            sb.append(num);
        System.out.println(sb);
    }
}