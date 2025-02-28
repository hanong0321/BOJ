import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());

            if (command == 1) {
                int num = Integer.parseInt(st.nextToken());
                list.add(num);
            } else if (command == 2) {
                if (!list.isEmpty()) { // 비어있지 않다면
                    int num = list.get(list.size() - 1);
                    bw.write(num + "\n");
                    list.remove(list.size() - 1);
                } else {
                    bw.write("-1\n");
                }
            } else if (command == 3) {
                bw.write(list.size() + "\n");
            } else if (command == 4) {
                bw.write(list.isEmpty() ? "1\n" : "0\n");
            } else {
                if (!list.isEmpty()) {
                    int num = list.get(list.size() - 1);
                    bw.write(num + "\n");
                } else {
                    bw.write("-1\n");
                }
            }
        }
        bw.close();
    }
}
