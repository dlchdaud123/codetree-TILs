import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[2*n];
        int max = 0;

        for(int i = 0; i < 2*n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        if(n % 2 == 0){ // n이 짝수
            for(int i = 0; i < n; i++) {
                if(arr[i] + arr[2*n-1-i] > max){
                    max = arr[i] + arr[2*n-1-i];
                }
            }
        }
        else{ // n이 홀수
            for(int i = 0; i < n; i++) {
                if(arr[i] + arr[2*n-1-i] > max){
                    max = arr[i] + arr[2*n-1-i];
                }
            }
        }
        
        System.out.print(max);
    }
}