import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[100];
        int[] tmp = new int[100];
        // 0 은 처음상태
        // 1 은 왼쪽
        // 2 는 오른쪽

        int cnt = 0;
        for(int i = 0; i < n; i++){
            int pigeonNum = sc.nextInt();
            int LR = sc.nextInt();
            tmp[pigeonNum] = LR + 1;

            if(arr[pigeonNum] != 0 && tmp[pigeonNum] != arr[pigeonNum]){
                cnt++;
            }
            arr[pigeonNum] = LR + 1;
        }

        System.out.print(cnt);
    }
}