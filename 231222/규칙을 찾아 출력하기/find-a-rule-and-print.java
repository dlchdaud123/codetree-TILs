import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == 0 || j == 0 || i == (n-1) || j == (n-1)){// i or j 가 0 이거나 i or j 가 n-1이면 *
                    System.out.print("* ");
                }
                else if(i > j){
                    System.out.print("* ");
                }
                else if(i <= j){
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
// 00 01 02 03 04
// 10          14
// 20 21       24
// 30 31 32    34
// 40 41 42 44 45


// 11 12
//    21

// 11 12 13
//    22 23
//       33