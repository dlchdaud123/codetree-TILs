import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arrA = new int[1000000];
        int[] arrB = new int[1000000];
        int timeA = 0;
        int timeB = 0;
        int totalLen = 0;

        for(int i = 0; i < n; i++){
            int v = sc.nextInt();
            int t = sc.nextInt();
            for(int j = 0; j < t; j++){
                totalLen += v;
                arrA[timeA++] += totalLen;
            }
        }
        totalLen = 0;
        for(int i = 0; i < m; i++){
            int v = sc.nextInt();
            int t = sc.nextInt();
            for(int j = 0; j < t; j++){
                totalLen += v;
                arrB[timeB++] += totalLen;
            }
        }
        
        //명예의 전당
        // 1 A
        // 2 B
        // 3 A B
        int eachCase = 0;
        int pastCase = 0;
        int[] winRec = new int[timeA];
        for(int i = 0; i < timeA; i++){
            if(arrA[i] > arrB[i]){ // A 우세
                winRec[i] = 1;
            }
            else if(arrA[i] < arrB[i]){ // B 우세
                winRec[i] = 2;
            }
            else if(arrA[i] == arrB[i]){ // A B 동일
                winRec[i] = 3;
            }
        }
        // for(int i = 0; i < timeA; i++){
        //     System.out.println(arrA[i]+" "+arrB[i]);
        // }
        int cnt = 1;
        for(int i = 1; i < timeA; i++){
            if(winRec[i] != winRec[i-1]){
                cnt++;
            }
            // System.out.println(winRec[i]);
        }
        System.out.print(cnt);

    }
}