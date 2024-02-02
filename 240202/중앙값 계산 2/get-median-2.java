import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int cnt = 0;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if(i % 2 == 0){ // 홀수 일때
                Arrays.sort(arr); // 정렬하고
                for(int j = 0; j < i; j++){
                    System.out.print(arr[j]+" ");
                }
                // System.out.print(arr[cnt]+" "); // 중앙값 출력
                // cnt++;
            }
        }
    }
}