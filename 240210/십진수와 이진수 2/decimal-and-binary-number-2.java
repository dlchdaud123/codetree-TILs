import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[20];
        int[] arr2 = new int[20];
        int cnt = 0;
        int num = 0;

        while(true){
            if(n < 10){
                arr[cnt++] = n;
                break;
            }
            arr[cnt++] = n % 10;
            n = n / 10;
        }

        for(int i = cnt - 1; i >= 0; i--){
            num = num * 2 + arr[i];
        }

        n = num*17;
        cnt = 0;
        // System.out.print(n);

        while(true){
            if(n < 2){
                arr2[cnt++] = n;
                break;
            }
            arr2[cnt++] = n % 2;
            n = n / 2;
        }

        for(int i = cnt - 1; i >= 0; i--){
            System.out.print(arr2[i]);
        }

        
    }
}