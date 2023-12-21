import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        while(true){
                n /= 2;
                //System.out.println("n /= 2 = "+ n);
                cnt++;
                //System.out.println("cnt = "+ cnt);
            
            if(n == 1){
                System.out.println(cnt);
                break;
            }
        }
        
    }
}