import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int arr_max[] = new int[n];
        int max = Integer.MIN_VALUE;
        int cnt = 0;

        for(int i = 0; i < n; i++){ // 일단 배열 설정
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){ // 중복 검사
            for(int j = i+1; j < n; j++){ // 모든 값이랑 중복 비교
                if(arr[j] == arr[i]){ // 만약 중복된다면
                    break; // 검사 종료
                }
                else if(j == n-1 && max < arr[i]){ // j 가 끝까지 돌았고 배열요소가 맥스보다 크면 
                    max = arr[i]; // 맥스는 배열요소로 변경
                }
            }
        }
        if(max == Integer.MIN_VALUE){ // max가 원래 설정 값인 제일 작은 음수 정수면 
            System.out.print(-1); 
        }
        else{ // 
            System.out.print(max);
        }
    }

}