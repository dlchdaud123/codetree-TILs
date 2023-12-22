import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 0; i < 2*n+1; i++){
            for(int j = 0; j < 2*n+1; j++){
                if(i % 2 == 1 && j % 2 == 1){
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        
    }
}


// 1,1

// 1,1 1,3

// 3,1 3,3