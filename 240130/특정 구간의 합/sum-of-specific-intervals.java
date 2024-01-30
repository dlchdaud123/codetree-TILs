import java.util.*;
public class Main {
    public static final int MAX = 100;
    public static int arr[] = new int[MAX+1];

    public static int idxSum(int a1, int a2) {
        int sum = 0;
        for(int i = a1 - 1; i <= a2 - 1; i++) {
            sum += arr[i];
        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < m; i++){
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();

            System.out.println(idxSum(a1, a2));
        }
    }
}