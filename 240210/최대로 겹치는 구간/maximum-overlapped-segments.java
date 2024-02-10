import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[200];
        int a = 0;
        int b = 0;
        int max = 0;
        int cnt = 0;

        
        for(int i = 0; i < n; i++){
            a = sc.nextInt()+100;
            b = sc.nextInt()+100;
            for(int j = a; j < b; j++){
                arr[i] += 1;
            }
        }
        for(int i = 0; i < 200; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        for(int i = 0; i < 200; i++) {
            if(arr[i] == max) {
                cnt++;
            }
            System.out.print(arr[i]+" ");
        }
        System.out.print(cnt);
    }
}