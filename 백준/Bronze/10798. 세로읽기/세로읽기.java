import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char [][] matrix = new char[5][15];
        String str;

        for (int i = 0; i < 5; i++) {
            str = sc.nextLine();
            for (int j = 0; j < str.length(); j++) {
                matrix[i][j] = str.charAt(j);
            }
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if(matrix[j][i] != '\0'){
                    System.out.print(matrix[j][i]);
                }
            }
        }
    }
}
