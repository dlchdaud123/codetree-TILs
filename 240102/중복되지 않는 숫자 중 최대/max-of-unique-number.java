import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if(arr[i] > max){ // 최댓값 보다 큰 값이 나오면
                for(int j = 0; j < i; j++){
                    if(arr[j] != arr[i]){
                        max = arr[i];
                    }
                }
            }
        }
        if(max < 0){
            System.out.print(-1);
        }
        else{
            System.out.print(max);
        }

    }
}