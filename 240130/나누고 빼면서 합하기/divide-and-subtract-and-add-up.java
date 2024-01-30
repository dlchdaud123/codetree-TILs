import java.util.*;
public class Main {
    
    public static int arr[] = new int[100];


    public static int sumFunc(int m) {
        int sum = 0;
        while(m >= 1) {
            // System.out.println(m);
            sum += arr[m];
            if(m % 2 == 1){
                m -= 1;
            }
            else {
                m /= 2;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(sumFunc(m));

    }
}