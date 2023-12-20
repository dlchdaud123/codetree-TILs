import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        for(int i = 1; i <= n; i++){
            //System.out.println("current val = "+i);
            if(i % 2 == 0 || i % 3 == 0 || i % 5 ==0){
                //System.out.println("familiar = "+i);
                continue;
            }

            cnt++;
            //System.out.println("current cnt = "+cnt);

        }
        System.out.print(cnt);

    }
}