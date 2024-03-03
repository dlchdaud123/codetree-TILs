import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int[] arr = new int[101];
        int cnt = 0;

        for(int i = a; i < b; i++){
            arr[i] = 1;
        }

        for(int i = c; i < d; i++){
            arr[i] = 1;
        }

        for(int i = 0; i <= 100; i++){
            if(arr[i] == 1){
                cnt++;
            }
        }
        
        System.out.print(cnt);
    }
}