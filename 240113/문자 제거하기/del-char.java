import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();

        for(int i = 0; i < 20; i++){
            int n = sc.nextInt();
            if(str.length() <= n){
                str = str.substring(0, len-1);
                len--;
            }
            else{
                str = str.substring(0, n) + str.substring(n+1);
                len--;
            }
            System.out.println(str);
            if(len == 1){
                break;
            }
        }
        // System.out.println(str.charAt(0));
    }
}