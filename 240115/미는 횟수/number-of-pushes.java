import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next(); // 밀어야하는 문자열
        String str2 = sc.next(); // 비교해야하는 문자열
        int n = 0; // 밀어야하는 최솟값

        for(int i = 0; i < str1.length(); i++){
            str1 = str1.substring(1) + str1.substring(0, 1);
            // System.out.println(str1);
            n++;
            if(str1.equals(str2)){
                System.out.print(n);
                break;
            }
            if(n == str1.length()-1){
                System.out.print(-1);
            }
        }
        
        

        
    }
}