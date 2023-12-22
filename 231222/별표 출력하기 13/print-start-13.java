import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // ex)n = 5
    for(int i = 0; i < 2*n; i++){
        if(i % 2 == 1){ // 짝수 

            for(int j = 0; j < ((i/2) + 1); j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        else{           // 홀수 

            for(int k = 0; k < (2*n-(i-1))/2; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }




    }
}