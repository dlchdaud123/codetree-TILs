import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.print("* ");
        }
        System.out.println();

        for(int i = 1; i < n; i++){
            for(int j = 0; j < n; j++){
                if(j % 2 == 1){ // j는 홀수이고
                    if(i <= j){ // i 가 j 보다 작거나 같을 때
                        System.out.print("*"+" ");
                    }
                    else{
                    System.out.print(" "+" ");
                }
                }
                else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }
}
// 11 13 15
//    23 25
//    33 35
//       45
//       55