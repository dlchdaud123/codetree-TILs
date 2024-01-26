import java.util.*;

public class Main {
    public static String modify(String s) {
        String reverse = "";
        for(int i = (s.length() - 1); i >= 0; i--){
            reverse = reverse + s.charAt(i);
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String temp = str;
        str = modify(str);
        if(temp == str){
            System.out.print("Yes");
        }
        else
        System.out.print("No");
    }
}