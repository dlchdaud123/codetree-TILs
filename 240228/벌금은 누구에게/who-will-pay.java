import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        int cnt = 0;
        for(int i = 0; i < m; i++){
            int sin = sc.nextInt();
            arr[sin-1]++;
            if(arr[sin-1] >= k){
                System.out.println(sin);
                return;
            }
        }
        System.out.print(-1);
    }
}