import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt(); // 1.
        int arr[] = new int[n];
        int idx = -1;

        for(int i = 0; i < n; i++){ // 2. n개의 원소가 공백
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < q; i++){ // 3. 질문 q개 받기
            int q_number = sc.nextInt(); // 질문 받기
            // System.out.print(q_number+"번째 질문.");

            if(q_number == 1){ // 1 질문
                int a = sc.nextInt();
                // System.out.print(a);
                System.out.print(arr[a-1]);
                System.out.println();
            }
            else if(q_number == 2){ // 2 질문
                int a = sc.nextInt();
                // System.out.print(a);
                for(int j = 0; j < n; j++){
                    // System.out.print(j);
                    if(arr[j] == a){ // 배열 안에 a 가 있다면
                        idx = j; // 인덱스를 j 로 바꾸기
                        // System.out.print(idx);
                    }

                    if(idx == j){ // 인덱스가 바뀌였다면
                        System.out.print((j+1)); // 출력하고
                        System.out.println();
                        break; // 끝내기
                    }
                    else if(j == n - 1 && idx == -1){ // for 문이 끝까지 돌았다면 0출력
                        System.out.print('0');
                        System.out.println();
                    }
                }
                a = 0;
                idx = -1;
            }
            else{ // 3 질문
                int a = sc.nextInt();
                int b = sc.nextInt();
                // System.out.print(a);
                // System.out.print(b);
                for(int j = a - 1; j < b; j++){
                    System.out.print(arr[j]+" ");
                }
                System.out.println();
            }
        }
    }
}