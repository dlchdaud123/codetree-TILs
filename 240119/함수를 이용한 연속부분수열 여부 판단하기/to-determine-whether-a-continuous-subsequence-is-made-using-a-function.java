import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1_len = sc.nextInt();
        int n2_len = sc.nextInt();

        int arr_n1[] = new int[n1_len];
        int arr_n2[] = new int[n2_len];

        int cnt = 0;

        for(int i = 0; i < n1_len; i++){ // n1 배열 할당
            arr_n1[i] = sc.nextInt();
        }
        for(int i = 0; i < n2_len; i++){ // n2 배열 할당
            arr_n2[i] = sc.nextInt();
        }

        for(int i = 0; i < n1_len; i++){
            if(n1_len < n2_len){ //n2 배열이 더 길다면
                System.out.print("No");
                break;
            }
            if(arr_n1[i] == arr_n2[0]){ // n1 배열이 n2 배열의 첫요소와 같으면
                cnt = 0;
                // System.out.println("arr_n1[i] = "+arr_n1[i]);
                for(int j = i; j <= n2_len; j++){ // 같은 부분부터 n2의 길이 만큼 비교
                    if(arr_n1[j] == arr_n2[cnt]){
                        // System.out.println(arr_n1[j]+" "+arr_n2[cnt]);
                        cnt++;
                        if(cnt == n2_len){ // n1,n2 같은 개수가 n2 길이 만큼이면 - > 부분수열
                            System.out.println("Yes");
                            // System.out.println("cnt = "+cnt);
                            break;
                        }
                    }
                }
                
            }
            if(i == n1_len - 1 && cnt != n2_len){ //i 가 끝까지 돌았는데 cnt는 n2배열의 길이와 같이 않다면
                System.out.print("No");
            }
        }
    }
}