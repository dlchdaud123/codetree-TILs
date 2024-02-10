import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[20];
        int arr2[] = new int[20];
        int cnt = 0;
        int num = 0;
        int num2 = 0;

        // a 진수로 표현된 n을 10진수로 변경
        while(true) {
            if(n < 10){
                arr[cnt++] = n;
                break;
            }
            arr[cnt++] = n % 10;
            n = n / 10;
        }
        for(int i = cnt - 1; i >= 0; i--){
            num = num * a + arr[i];
        }
        cnt = 0;
        // n 을 b 진수로 변경
        while(true) {
            if(num < b){
                arr2[cnt++] = num;
                break;
            }
            arr2[cnt++] = num % b;
            num = num / b;
        }
        for(int i = cnt - 1; i >= 0; i--){
            System.out.print(arr2[i]);
        }
        
    }
}