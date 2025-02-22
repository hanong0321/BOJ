import java.io.*;
import java.nio.Buffer;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        HashSet<String> memberList = new HashSet<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String record = st.nextToken();
            if(Objects.equals(record, "enter")) {
                memberList.add(name);
            }
            else if(Objects.equals(record, "leave")) {
                memberList.remove(name);
            }
        }
        //hashset은 직접 정렬 x => list로 변환 후 정렬해야함
        List<String> hList = new ArrayList<>(memberList);
        Collections.sort(hList, Collections.reverseOrder());

        for(String s : hList) {
            bw.write(s);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}