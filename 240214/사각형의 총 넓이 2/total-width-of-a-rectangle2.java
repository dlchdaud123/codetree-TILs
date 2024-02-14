import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[200][200];
        int n = sc.nextInt();
        int cnt = 0;
        
        for(int i = 0; i < n; i++){
            // 범위를 입력 받기
            int x1 = sc.nextInt()+100;
            int y1 = sc.nextInt()+100;
            int x2 = sc.nextInt()+100;
            int y2 = sc.nextInt()+100;

            // 
            for(int j = x1; j < x2; j++){
                for(int k = y1; k < y2; k++){
                    arr[j][k] = 1;
                }
            }
        }
        for(int i = 0; i < 200; i++){
            for(int j = 0; j < 200; j++){
                if(arr[i][j] == 1){
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
        

    }
}