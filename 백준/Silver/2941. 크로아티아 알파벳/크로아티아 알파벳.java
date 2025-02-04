import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static String str;
    public static int cnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'c'){
                if(i < str.length()-1){
                    if(str.charAt(i+1) == '=' || str.charAt(i+1) == '-'){
                        i++;
                    }
                }
            }
            else if(str.charAt(i) == 'd'){
                if(i < str.length()-1){
                    if(str.charAt(i+1) == 'z'){
                        if(i < str.length()-2){
                            if(str.charAt(i+2) == '='){
                                i += 2;
                            }
                        }
                    }
                    else if(str.charAt(i+1) == '-'){
                        i++;
                    }
                }
            }
            else if(str.charAt(i) == 'l'){
                if(i < str.length()-1){
                    if(str.charAt(i+1) == 'j'){
                        i++;
                    }
                }
            }
            else if(str.charAt(i) == 'n'){
                if(i < str.length()-1){
                    if(str.charAt(i+1) == 'j'){
                        i++;
                    }
                }
            }
            else if(str.charAt(i) == 's'){
                if(i < str.length()-1){
                    if(str.charAt(i+1) == '='){
                        i++;
                    }
                }
            }
            else if(str.charAt(i) == 'z'){
                if(i < str.length()-1){
                    if(str.charAt(i+1) == '='){
                        i++;
                    }
                }
            }
            cnt++;
        }

        System.out.println(cnt);
    }
}
