import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        int num = 16;

        for(int j = 0; j < n; j++){
            if(j % 2 == 0){
                for(int i = n-1; i >= 0; i--){
                    arr[i][j] = num;
                    num -= 1;
                }
            }
            else{
                for(int i = 0; i < n; i++){
                    arr[i][j] = num;
                    num -= 1;
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