import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        for(int i = 0; i < n; i++){
            if(i % 2 == 0){// i even
                for(int j = 0; j < n; j++){
                    cnt++; // cnt 증가
                    System.out.print(cnt+" "); // 출력
                }
                cnt = cnt + n+1;
            }
            else{           // i odd
                for(int j = 0; j < n; j++){
                    cnt--;
                    System.out.print(cnt+" ");
                }
                cnt = cnt + n-1;
            }
            System.out.println();
        }
        
    }
}