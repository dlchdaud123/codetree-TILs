import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arrA = new int[1000000];
        int[] arrB = new int[1000000];
        int totalTime = 0;
        int cnt = 0;
        // A의 이동
        for(int i = 0; i < n; i++){
            int v = sc.nextInt();
            int t = sc.nextInt();
            for(int j = 0; j < t; j++){
                cnt += v;
                arrA[totalTime++] = cnt;
            }
        }

        totalTime = 0;
        cnt = 0;

        // B의 이동
        for(int i = 0; i < m; i++){
            int v = sc.nextInt();
            int t = sc.nextInt();
            for(int j = 0; j < t; j++){
                cnt += v;
                arrB[totalTime++] = cnt;
            }
            
        }

        // for(int i = 0; i < totalTime; i++){
        //     System.out.println(arrA[i] + " " + arrB[i]);
        // }

        int change = 0;
        int curr = 0;
        Integer[] diff = new Integer[totalTime];
        for(int i = 0; i < totalTime; i++){
            diff[i] = (arrA[i] - arrB[i]);
            // System.out.println(diff[i]);
            if(diff[i] * curr < 0){
                change++;
            }
            if(diff[i] != 0){
                curr = diff[i];
            }
        }
        System.out.println(change);
    }
}