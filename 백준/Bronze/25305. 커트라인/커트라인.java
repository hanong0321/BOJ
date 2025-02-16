import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> List = new ArrayList<>();
        int N = sc.nextInt();
        int k = sc.nextInt();
        for(int i = 0; i < N; i++) {
            List.add(sc.nextInt());
        }
        // Collections.sort(List);
        Collections.sort(List, Collections.reverseOrder()); // 내림차순 정렬법
        
        System.out.println(List.get(k - 1));
    }
}
