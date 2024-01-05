import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int minVal = 100;

        for(int i = 0; i < n; i++){ // 배열 할당
            arr[i] = sc.nextInt();
        }

        minVal = arr[1] - arr[0];

        for(int i = 2; i < n; i++){
            if(arr[i] - arr[i-1] < minVal){
                minVal = arr[i] - arr[i-1];
            }
        }
        System.out.print(minVal);
        
    }
}