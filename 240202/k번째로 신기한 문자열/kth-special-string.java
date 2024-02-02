import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String findingStr = sc.next();
        String arr[] = new String[n]; 
        int idx_arr[] = new int[n];
        int cnt = 0;

        for(int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        Arrays.sort(arr);
        for(int i = 0; i< n; i++){

            if(arr[i].indexOf(findingStr) == 0){ // 만약 배열을 찾았다면
                idx_arr[cnt] = i; // 인덱스를 저장하는 배열 cnt번째에 인덱스를 저장
                System.out.println(arr[i]); 
                System.out.println(idx_arr[cnt]); 인덱스를 출력
                cnt++;
            }
        }
        for(int i = 0; i < cnt; i++) {
            // System.out.println(idx_arr[i]);
        }
    }
}