import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int sum = 0;
        int sum_2 = 0;
        int cnt = 0;

        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
            if(i % 2 == 1){ // 짝수번쨰로 입력된 값
                sum += arr[i];
            }
            if((i+1)%3 == 0){
                sum_2 += arr[i];
                cnt++;
            }
        }
        System.out.printf("%d %.1f", sum, (double)sum_2/cnt);
        

    }
}

// 2 34 5 67 8