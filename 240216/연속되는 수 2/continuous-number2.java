import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int cnt = 1;
        int max = 0;

        // n번의 숫자를 배열에 할당
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        // 만약 i == 0 || arr[i] != arr[i-1] 이라면 cnt++
        for(int i = 1; i < n; i++){
            if(arr[i] != arr[i-1]){
                cnt = 0;
            }
            else{
                cnt++;
                if(max < cnt){
                    max = cnt;
                }
            }
        }
        System.out.println(max+1);
    }
}