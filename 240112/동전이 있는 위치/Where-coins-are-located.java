import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int placed[][] = new int [n][n];

        for(int i = 0; i < m; i++){
            int r = sc.nextInt();
            int c = sc.nextInt();
            placed[r-1][c-1] = 1;
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(placed[i][j]+" ");
            }
            System.out.println();
        }

    }
}