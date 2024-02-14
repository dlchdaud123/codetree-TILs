import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2000][2000];
        int cnt = 0;

        // A, B 의 x1, y1, x2, y2를 구하자
        for(int i = 0; i < 2; i++){
            int x1 = sc.nextInt() + 1000;
            int y1 = sc.nextInt() + 1000;
            int x2 = sc.nextInt() + 1000;
            int y2 = sc.nextInt() + 1000;

            // A, B 의 직사각형은 1로 채우자
            for(int j = x1; j < x2; j++){
                for(int k = y1; k < y2; k++){
                    arr[j][k] = 1;
                }
            }
        }
        // M의 x1, y1, x2, y2를 구하자 / M 의 직사각형은 2로 채우자
        int x1 = sc.nextInt() + 1000;
        int y1 = sc.nextInt() + 1000;
        int x2 = sc.nextInt() + 1000;
        int y2 = sc.nextInt() + 1000;
        for(int j = x1; j < x2; j++){
                for(int k = y1; k < y2; k++){
                    arr[j][k] = 2;
                }
            }

        for(int i = 0; i < 2000; i++){
            for(int j = 0; j < 2000; j++){
                if(arr[i][j] == 1){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
        // 1의 갯수를 세고 출력
    }
}