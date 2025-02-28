import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int K = Integer.parseInt(br.readLine());

        for (int i = 0; i < K; i++) {
            String str = br.readLine();
            Stack<Character> stack = new Stack<>();
            boolean isValid = true;

            for (char c : str.toCharArray()) {
                if (c == '(') {
                    stack.push(c);
                }
                else if(stack.isEmpty()) {
                    bw.write("NO\n");
                    isValid = false;
                    break;
                }
                else {
                    stack.pop();
                }
            }
            // 검사가 끝난후 비어있으면
            if(isValid) {
                bw.write(stack.isEmpty() ? "YES\n" : "NO\n");
            }

        }
        bw.close();
    }
}
