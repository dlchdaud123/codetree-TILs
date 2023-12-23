import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int sum_odd = 0;
        int sum_even = 0;

        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
            if(i % 2 == 0){// 홀수 번째 입력 
                sum_odd += arr[i];
            }
            else { //짝수
                sum_even += arr[i];
            }
        }
        if(sum_even > sum_odd){
            System.out.print(sum_even - sum_odd);
        }
        else{
            System.out.print(sum_odd - sum_even);
        }
    }
}