import java.util.*;

public class Main {
    public static boolean examine(String str) {
        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i-1) != str.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(examine(str)){
            System.out.print("No");
        }
        else{
            System.out.print("Yes");
        }
    }
}