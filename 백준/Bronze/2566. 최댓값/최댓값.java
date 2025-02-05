import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] matrix = new int[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int max = Integer.MIN_VALUE;
        int idx1 = 0, idx2 = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(matrix[i][j] > max) {
                    max = matrix[i][j];
                    idx1 = i;
                    idx2 = j;
                }
            }

        }
        System.out.println(max);
        System.out.println((idx1+1) + " " + (idx2+1));
    }
}
