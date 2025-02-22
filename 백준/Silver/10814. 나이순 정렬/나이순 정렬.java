import java.io.*;
import java.nio.Buffer;
import java.security.KeyStore;
import java.util.*;

class Member {
    int age;
    String name;

    Member(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        ArrayList<Member> memberList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            memberList.add(new Member(age, name));
        }
        br.close();

        memberList.sort((m1, m2) -> (m1.age == m2.age) ? 0 : (m1.age > m2.age ? 1 : -1));
        // 1을 반환하면 m2를 앞에 두고, -1을 반환하면 m1을 앞에 둠
        // memberList.sort(Comparator.comparingInt(m -> m.age));
        for (Member m : memberList) {
            bw.write(m.age + " ");
            bw.write(m.name);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}