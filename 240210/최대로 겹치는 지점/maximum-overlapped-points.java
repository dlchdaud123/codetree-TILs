import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[101];
        int a, b;
        int max = 0;

        for(int i = 0; i < n; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            for(int j = a; j <= b; j++){
                arr[j] += 1;
            }
        }
        for(int i = 0; i < 100; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.print(max);
    }
}