import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[200][200];
        int cnt = 0;

        // n개의 직사각형 받기
        for(int i = 0; i < n; i++){
            int x1 = sc.nextInt()+100;
            int y1 = sc.nextInt()+100;
            int x2 = sc.nextInt()+100;
            int y2 = sc.nextInt()+100;

            // 빨간색
            if(i % 2 == 0){
                for(int j = x1; j < x2; j++){
                    for(int k = y1; k < y2; k++){
                        arr[j][k] = 0;
                    }
                }
            }
            // 파란색
            else{
                for(int j = x1; j < x2; j++){
                    for(int k = y1; k < y2; k++){
                        arr[j][k] = 1;
                    }
                }
            }
        }
        for(int i = 0; i < 200; i++){
            for(int j = 0; j < 200; j++){
                if(arr[i][j] == 1)
                cnt++;
            }
        }
        System.out.print(cnt);

        // i 가 짝수이면 0으로 바꾸기
        // i 가 홀수이면 1으로 바꾸기
        // 1의 넓이를 카운트
    }
}