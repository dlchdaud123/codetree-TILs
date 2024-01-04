import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[1000];
        int arr_idx[] = new int[1000];
        int max = -1;
        int max2 = 0;
        int idx = n;
        int cnt = 0;

        for(int i = 1; i <= n; i++){ // 배열 받기
            arr[i-1] = sc.nextInt();
            // System.out.print(arr[i-1]);
        }
        // System.out.println();

            for(int i = 1; i <= n; i++){ // 최대값 찾기, idx 까지
                if(max < arr[i-1]){ // 현재의 최댓값보다 배열요소가 크면
                    // System.out.println("i = "+i);
                    max = arr[i-1]; // 현재의 최댓값은 배열요소
                    idx = i;
                    arr_idx[cnt] = idx;
                    cnt++;
                    // System.out.println("max = "+max+" idx = "+idx);
                    // System.out.println("arr_idx = "+arr_idx[i-1]);
                    
                }
            }
            for(int i = cnt; i > 0; i--){
                System.out.print(arr_idx[i-1]+" ");
            }
    }
}