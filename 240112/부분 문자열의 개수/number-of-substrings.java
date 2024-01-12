import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String sub = sc.next();
        int cnt = 0;

        for(int i = 0; i < str.length()-1; i++){
            if(str.charAt(i) == sub.charAt(0) && str.charAt(i+1) == sub.charAt(1)){
                cnt++;
            }
        }
        System.out.print(cnt);

    }
}