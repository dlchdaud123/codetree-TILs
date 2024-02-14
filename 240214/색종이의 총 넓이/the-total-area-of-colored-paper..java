import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[200][200];
        int cnt = 0;

        //n장의 꼭지점을 받고 범위를 다 1로 바꿔줌
        for(int i = 0; i < n; i++){
            int x = sc.nextInt()+100;
            int y = sc.nextInt()+100;
            for(int j = x; j < x+8; j++){
                for(int k = y; k < y+8; k++){
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
        System.out.print(cnt);
    }
}