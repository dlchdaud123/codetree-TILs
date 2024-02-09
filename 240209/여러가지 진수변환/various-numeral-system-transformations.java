import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int B = sc.nextInt();
        int[] arr = new int[20];
        int cnt = 0;

        while(true){
            if(n < B){
                arr[cnt++] = n;
                break;
            }
            arr[cnt++] = n % B;
            n = n / B;
        }

        for(int i = cnt - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }

    }
}