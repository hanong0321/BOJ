import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String className, grade; //과목등급
        Double credit, gradeNum = 0.0, gradeSum = 0.0, creditSum = 0.0, average = 0.0; // 학점

        for(int i = 0; i < 20; i++) {
            String line = sc.nextLine();

            className = line.split(" ")[0];
            credit = Double.parseDouble(line.split(" ")[1]); // 학점
            grade = line.split(" ")[2]; // 과목등급
            if(grade.equals("A+")) gradeNum = 4.5;
            else if(grade.equals("A0")) gradeNum = 4.0;
            else if(grade.equals("B+")) gradeNum = 3.5;
            else if(grade.equals("B0")) gradeNum = 3.0;
            else if(grade.equals("C+")) gradeNum = 2.5;
            else if(grade.equals("C0")) gradeNum = 2.0;
            else if(grade.equals("D+")) gradeNum = 1.5;
            else if(grade.equals("D0")) gradeNum = 1.0;
            else if(grade.equals("F"))  gradeNum = 0.0;
            else if(grade.equals("P")) continue;
            creditSum += (gradeNum * credit);
            gradeSum += credit;

        }
        average = creditSum/gradeSum;
        System.out.println(average);
    }
}
