import java.io.*;
import java.nio.Buffer;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> List = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            List.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(List);

        for (int num : List) {
            bw.write(num + "\n");
        }
        bw.flush();
        bw.close();
    }
}