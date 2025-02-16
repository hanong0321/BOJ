import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> List = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            List.add(sc.nextInt());
        }
        Collections.sort(List);
        // Arrays.parallelsort(arr) 배열

        for(int num : List) {
            System.out.println(num);
        }
    }
}
