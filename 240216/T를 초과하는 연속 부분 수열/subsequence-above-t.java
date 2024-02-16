import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        int cnt = 0;
        int max = 0;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        for(int i = 0; i < n; i++){
            if(arr[i] > t){
                cnt++;
                if(cnt > max){
                    max = cnt;
                }
            }
            else{
                cnt = 0;
            }
        }
        System.out.print(max);
    }
}