import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int countarr[] = new int[10];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            countarr[arr[i]]++;
        }
        for(int i = 1; i < 10; i++){
            System.out.println(countarr[i]);
        }
    }
}