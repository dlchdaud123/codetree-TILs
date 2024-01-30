import java.util.*;
public class Main {
    public static String str = "";
    public static String strPart = "";

    public static int part(String str, String strPart) {
        int cnt = 0; // 
        for(int i = 0; i <= str.length() - strPart.length(); i++){
            cnt = 0;
            // System.out.println(str.charAt(i));
                // System.out.println(str.charAt(i) + " " + strPart.charAt(0));
                for(int j = 0; j < strPart.length(); j++){
                    if(str.charAt(i+j) == strPart.charAt(j)){
                        // System.out.println(str.charAt(j) + " " + strPart.charAt(cnt));
                        cnt++;
                        // System.out.println("cnt ="+cnt);
                    }
                }
                if(cnt == strPart.length()){
                    return i;
                }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        str = sc.next();
        strPart = sc.next();
        int ans;
        ans = part(str, strPart);
        System.out.println(ans);
    }
}