import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int placed[][] = new int[n][n];
        int cnt = 1;

        for(int i = 0; i < m; i++){
            int r = sc.nextInt();
            int c = sc.nextInt();
            placed[r-1][c-1] = cnt;
            cnt++;
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(placed[i][j]+" ");
            }
            System.out.println();
        }
    }
}