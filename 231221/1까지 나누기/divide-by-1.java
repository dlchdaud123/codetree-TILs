import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 1;
        
        for(int i = 1; i <= n; i++){
            //System.out.println("i = "+i);
            //System.out.println("n = "+n);
            n /= i;
            
            cnt++;
            //System.out.println("cnt = "+cnt);

            if(n <= 1){
                break;
            }
        }
        System.out.print(cnt);
    }
}