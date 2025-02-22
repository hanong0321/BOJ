import java.io.*;
import java.nio.Buffer;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        List<Integer> numList = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            numList.add(Integer.parseInt(st.nextToken()));
        }
        // List<Integer> tempNumList = numList; 새로운 리스트 X numList의 참조(주소)만 복사됨 => 정렬이 같이 됨
        List<Integer> tempNumList = new ArrayList<>(numList); // deep copy
        Collections.sort(tempNumList); // 오름차순 정렬 O(N log N)
        tempNumList = tempNumList.stream().distinct().collect(Collectors.toList()); // 중복제거 O(N)

        Map<Integer, Integer> indexMap = new HashMap<>(); // O(N)
        for (int i = 0; i < tempNumList.size(); i++) {
            indexMap.put(tempNumList.get(i), i);
        }
        for(int num : numList) { // 시간복잡도 O(N) -> O(1)
            bw.write(indexMap.get(num) + " "); // num을 넣으면 value인 인덱스 반환
        }
        bw.flush();
        bw.close();
    } 
}
// 시간복잡도 O(N^2)
//for(int i = 0; i < numList.size(); i++) {   // O(N)
//    for(int j = 0; j < tempNumList.size(); j++) {  // O(N)
//        if(Objects.equals(numList.get(i), tempNumList.get(j))) {  // O(1)
//            bw.write(j + " ");
//        }
//    }
//}