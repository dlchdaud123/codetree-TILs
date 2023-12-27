import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[100];
        int score_arr[] = new int[11];

        for(int i = 0; i < 100; i++){
            arr[i] = sc.nextInt();
            score_arr[arr[i]/10]++;
            if(arr[i] == 0){
                break;
            }
        }
        for(int i = 10; i > 0; i--){
            System.out.println(i*10+" - "+score_arr[i]);
        }
    }
}