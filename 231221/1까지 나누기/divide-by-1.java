import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for(int i = 1; i <= 5000; i++){
            //System.out.println("i = "+i);
            //System.out.println("n = "+n);
            n /= i;
            //System.out.println("n/i = "+n/i);
            cnt++;
            //System.out.println("cnt = "+cnt);

            if(n/i <= 1){
                //System.out.println("n/i <= 1");
                cnt++;
                //System.out.println("cnt = "+cnt);
                System.out.println(+cnt);
                break;
            }
        }
        
    }
}