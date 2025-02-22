import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Map<Integer, String> pokList = new HashMap<>();
        Map<String, Integer> nameToKey = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            pokList.put(i, name);
            nameToKey.put(name, i);
        }
        for (int i = 0; i < M; i++) {
            String str = br.readLine();
            boolean result = true;

            for(char c : str.toCharArray()) {
                if(!Character.isDigit(c)) {
                    result = false;
                    break;
                }
            }

            if(result) { // 숫자 - key
                int key = Integer.parseInt(str);
                bw.write(pokList.get(key) + "\n");
            }
            else { // 문자열 - value
                bw.write(nameToKey.get(str) + "\n");
            }
        }

        bw.flush();
        bw.close();
    }
}
