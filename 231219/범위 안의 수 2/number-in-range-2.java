import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int sum = 0, cnt = 0;


        for(int i = 1; i <= 10; i++){
            int n = sc.nextInt();
            if(0 <= n && n <= 200){
                sum += n;
                cnt++;
            }
        }
        System.out.printf("%d %.1f", sum, (double)sum/cnt);
    }
}