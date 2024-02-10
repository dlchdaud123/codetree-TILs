import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        int a = 0;
        int b = 0;
        int max = 0;


        // k 번씩 a ~ b 번째 블록 받기
        for(int i = 0; i < k; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            for(int j = a - 1; j < b; j++){
                arr[j] += 1;
            }
        }
        for(int i = 0; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.print(max+" ");
    }
}