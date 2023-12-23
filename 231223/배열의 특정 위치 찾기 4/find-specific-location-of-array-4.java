import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int sum = 0; // 2의 배수 합
        int cnt_2 = 0; // 2의 배수 갯수
        int cnt = 0; // 0을 제외한 수의 갯수

        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
            if(arr[i] == 0){ // 0이 나오면
                System.out.print(cnt_2+" "+sum); // 2의 배수 갯수와 합 출력
            }
            else if(arr[i] % 2 == 0){ // 2의 배수이면
                cnt_2++; // 2의 배수 갯수++
                cnt++; // 수의 갯수++
                sum += arr[i]; // 합에다가 더해줌
            }
            else{ // 2의 배수도 0도 아닌 수
                cnt++;
            }

            if(cnt == 10){ // 0을 제외한 수가 10이면 2의 배수 정보가 출력 안됐으므로 따로 출력
                    System.out.print(cnt_2+" "+sum); 
            }
        }
    }
}