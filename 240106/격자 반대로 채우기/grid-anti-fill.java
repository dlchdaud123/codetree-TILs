import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        int num = 1;
        int o_e = n % 2; // 홀수면 1 짝수면 0

        for(int j = n-1; j >= 0; j--){
            
            if(j % 2 != o_e){ // 밑에서 위로
                for(int i = n-1; i >= 0; i--){
                    arr[i][j] = num;
                    num += 1;
                }
            }
            else{
                for(int i = 0; i < n; i++){
                    arr[i][j] = num;
                    num += 1;
                }
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        

    }
}