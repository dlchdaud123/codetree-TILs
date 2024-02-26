import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = 0;
        // int min = 2100000000;
        int sum = 0;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        // 팔 수 있게 최솟값으로 사기
        for(int i = 0; i < n-1; i++){
            for(int j = i + 1; j < n; j++){
                sum = arr[j] - arr[i];
                if(sum > max){
                    max = sum;
                }
                sum = 0;
            }
        }
        System.out.print(max);
    }
}