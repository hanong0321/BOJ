import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int K = Integer.parseInt(br.readLine());

        for (int i = 0; i < K; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num != 0) list.add(num);
            else {
                list.remove(list.size() - 1);
            }
        }
        int sum = 0;
        for (int num : list)
            sum += num;

        bw.write(sum + " ");
        bw.close();
    }
}