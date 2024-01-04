import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int max = 0;
        int min = 1000;

        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < 10; i++){
            if(arr[i] < 500){ // 500 보다 작으면 최대값
                if(max < arr[i]){
                    max = arr[i];
                }
            }
            else{ // 500 보다 크면 최솟값
                if(min > arr[i]){
                    min = arr[i];
                }
            }
        }
        System.out.print(max+" "+min);
    }
}