import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2000][2000];
        int cnt = 0;

        // 첫번째 사각형은 1로 채워준다.
        int x1 = sc.nextInt()+1000;
        int y1 = sc.nextInt()+1000;
        int x2 = sc.nextInt()+1000;
        int y2 = sc.nextInt()+1000;
        for(int i = x1; i < x2; i++){
            for(int j = y1; j < y2; j++){
                arr[i][j] = 1;
            }
        }
        // 두번째 사각형은 0으로 채워준다.
        x1 = sc.nextInt()+1000;
        y1 = sc.nextInt()+1000;
        x2 = sc.nextInt()+1000;
        y2 = sc.nextInt()+1000;
        for(int i = x1; i < x2; i++){
            for(int j = y1; j < y2; j++){
                arr[i][j] = 0;
            }
        }
        // x,y값의 최소, 최대를 찾고 넓이를 구한다.
        int xMax = 0;
        int yMax = 0;
        int xMin = 2000;
        int yMin = 2000;

        for(int i = 0; i < 2000; i++){
            for(int j = 0; j < 2000; j++){
                if(arr[i][j] == 1 && xMax < i)
                    xMax = i;
                if(arr[i][j] == 1 && yMax < j)
                    yMax = j;
                if(arr[i][j] == 1 && xMin > i)
                    xMin = i;
                if(arr[i][j] == 1 && yMin > j)
                    yMin = j;
            }
        }

        // System.out.println(xMax+" "+yMax+" "+xMin+" "+yMin);

        for(int i = xMin; i <= xMax; i++){
            for(int j = yMin; j <= yMax; j++){
                cnt++;
            }
        }
        System.out.print(cnt);
        

    }
}