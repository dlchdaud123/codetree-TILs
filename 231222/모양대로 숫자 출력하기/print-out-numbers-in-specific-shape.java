import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 5;

        for(int i = 1; i <= n; i++){
            cnt = 5;
            for(int j = 1; j <= n; j++){
                if(j >= i){ // j가 i 보다 크면
                    System.out.print(cnt+" ");
                    cnt--;
                }
                else{
                    System.out.print("  ");
                    cnt--;
                }
                
            }
            System.out.println();
        }
    }
}
// 11 12 13 14 15
//    22 23 24 25
//       33 34 35
//          44 45
//             55