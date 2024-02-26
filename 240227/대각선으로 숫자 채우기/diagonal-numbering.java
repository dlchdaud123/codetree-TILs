import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        int cnt = 1;
        // 시작점은 i = 0 그리고 j++ j가 m 이 되면
        // j = m 그리고 i++ 
        // i = n 이 되면 끝
        // 숫자채우는 건 배열에 채우자
        for(int k=0;k<=n+m-2;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(k==i+j){
                        arr[i][j]=cnt;
                        cnt++;
                    }
                }
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}