import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        Arrays.fill(arr, 1000000);
        for(int i = 0; i < n; i++){
            // System.out.print(arr[i]+" ");
        }
        // System.out.println();
        int cnt = 0;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt(); // 배열 할당

            if(i % 2 == 0) { // i가 짝수 일때
                Arrays.sort(arr);
                System.out.print(arr[cnt]+" ");
                cnt++;
            }
        }
    }
}

/* i          idx
   0 일때 중앙값 0
   2 일때 중앙값 1
   4 일때 중앙값 2
   6 일때 중앙값 3 */