import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());


        Map<Integer, Boolean> setA = new HashMap<>();
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st1.nextToken());
            setA.put(num, null);
        }

        Map<Integer, Boolean> setB = new HashMap<>();
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st2.nextToken());
            setB.put(num, null);
        }
        for (int num : setB.keySet()) {
            if(setA.containsKey(num)) {
                setA.remove(num);
            } else {
                setA.put(num, null);
            }
        }
        
        bw.write(setA.size() + " ");
        bw.flush();
        bw.close();
    }
}
