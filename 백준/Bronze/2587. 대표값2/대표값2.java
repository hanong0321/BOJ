import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> List = new ArrayList<>();
        int sum = 0;
        for(int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            List.add(num);
            sum += num;
        }
        Collections.sort(List);
        int middleIdx = 5/2;
        System.out.println(sum/5);
        System.out.println(List.get(middleIdx));
    }
}
