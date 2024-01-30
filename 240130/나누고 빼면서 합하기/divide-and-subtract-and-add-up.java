import java.util.*;
public class Main {
    
    public static final int MAX_N = 100;
    public static int arr[] = new int[MAX_N + 1];
    public static int cnt;

    public static int sumFunc() {
        int sum = 0;
        while(cnt >= 1) {
            // System.out.println(cnt);
            sum += arr[cnt];
            if(cnt % 2 == 1){
                cnt -= 1;
            }
            else {
                cnt /= 2;
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
        cnt = m;
        System.out.print(sumFunc());

    }
}