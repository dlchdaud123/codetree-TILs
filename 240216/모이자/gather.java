import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        int min = Integer.MAX_VALUE;

        //각 지점에 살고 있는 사람 수
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                sum = sum + arr[j] * Math.abs(i-j);
            }
            if(min > sum){
                min = sum;
            }
            // System.out.println(sum+" "+min);
            sum = 0;
        }
        System.out.print(min);
    }
}