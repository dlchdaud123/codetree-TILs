import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int cnt = 1;
        int max = 1;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 1; i < n; i++){
            if(arr[i] <= arr[i-1]){
                cnt = 1;
            }
            else{
                cnt++;
                if(max < cnt){
                    max = cnt;
                }
            }
        }
        System.out.print(max);
        
    }
}