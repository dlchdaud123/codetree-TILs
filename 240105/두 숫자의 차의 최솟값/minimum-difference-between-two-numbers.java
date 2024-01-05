import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int diff_min = 100;
        int diff = 0;

        for(int i = 0; i < n; i++){ // 배열 할당
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i] > arr[j] && diff_min > (arr[i] - arr[j])){  //i 배열이 클때 
                    // System.out.println("arr[i], arr[j] = "+arr[i]+" "+arr[j]);
                    diff_min = arr[i] - arr[j];
                }
                else if(arr[i] < arr[j] && diff_min > (arr[j] - arr[i])){ //j 배열이 클때
                    // System.out.println("arr[i], arr[j] = "+arr[i]+" "+arr[j]);
                    diff_min = arr[j] - arr[i];
                }
            }
        }
        System.out.println(diff_min);
    }
}