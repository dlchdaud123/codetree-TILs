import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int max_arr[] = new int[n];
        int max = 0;
        int max_sec = 0;
        int cnt = 0;
        int max_idx = 0;

        for(int i = 0; i < n; i++){ // 제일 큰 최대 값
            arr[i] = sc.nextInt(); // n까지 배열 받기
            if(arr[i] > max){ // 최대값 보다 배열의 수가 클 때
                max = arr[i]; // 최대값 = 배열 값
                max_idx = i;
            }
        }
        for(int i = 0; i < n; i++){ // 그 다음 최대 값(같을 수도 있음, idx만 다르면)
            if(i != max_idx && arr[i] > max_sec){ // 인덱스가 다르고/최대값 보다 배열의 수가 클 때
                max_sec = arr[i]; // 최대값 = 배열 값
            }
        }

            System.out.println(max+" "+max_sec);
        // System.out.print(max_arr[cnt-1]+" "+max_arr[cnt-2]);
    }
}