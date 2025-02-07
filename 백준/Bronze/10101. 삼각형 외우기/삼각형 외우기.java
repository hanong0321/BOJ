import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        int z = Integer.parseInt(br.readLine());

        if(x + y + z == 180)  {
            if(x == 60 && y == 60 && z == 60) System.out.println("Equilateral");
            else {
                if (x == y || y == z || x == z) System.out.println("Isosceles");
                else  System.out.println("Scalene");
            }
        } else System.out.println("Error");
    }
}
