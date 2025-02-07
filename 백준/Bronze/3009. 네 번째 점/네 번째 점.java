import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> xmap = new HashMap<>();
        HashMap<Integer, Integer> ymap = new HashMap<>();

        for(int i = 0; i < 3; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            // x 존재하면 x반환 없으면 디폴트 0 반환 후 + 1;
            xmap.put(x, xmap.getOrDefault(x, 0) + 1);
            ymap.put(y, ymap.getOrDefault(y, 0) + 1);
        }
        int x4 = 0, y4 = 0;
        for (int key : xmap.keySet()) { // Map의 전체 key를 꺼냄
            if (xmap.get(key) == 1) { // key에 해당하는 value 반환 / 해당 x null 반환
                x4 = key;
                break;
            }
        }

        for (int key : ymap.keySet()) {
            if (ymap.get(key) == 1) {
                y4 = key;
                break;
            }
        }
        System.out.println(x4 + " " + y4);
    }
}
