import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(); // 수열 A의 갯수
        int n2 = sc.nextInt(); // 수열 B의 갯수
        int cnt = 0; 
        int ser = -1;
        int arr_n1[] = new int[n1+1];
        int arr_n2[] = new int[n2+1];

        for(int i = 0; i < n1; i++){
            arr_n1[i] = sc.nextInt(); // A에 n1개의 수열
        }
        for(int i = 0; i < n2; i++){
            arr_n2[i] = sc.nextInt(); // B에 n2개의 수열
        }
        for(int i = 0; i < n1; i++){ // A 수열 1번째 부터 n1번째 까지
            // System.out.println("i= "+i+" ");
            for(int j = 0; j < n2; j++){ // B 수열 1번째 부터 n1번째 까지
                // System.out.println("j= "+j+" ");
                if(arr_n1[i] == arr_n2[j]){ // A와 B의 성분이 같으면
                    for(int k = 0; k < n2; k++){ // 하나씩 각자 수열의 순서를 1씩 증가해가며 비교
                        // System.out.println("k = "+k);
                        // System.out.println(arr_n1[i+k]+" "+arr_n2[j+k]);
                        // System.out.println("cnt= "+cnt);
                        if(arr_n1[i+k] == arr_n2[j+k]){
                            cnt++; // 카운트 +1
                            if(cnt == n2){
                                ser = 1;
                                // System.out.println("연속함수 입니다");
                            }
                        }
                        else{
                            cnt = 0;
                            // System.out.println("arr_n1[i+k] 와 arr_n2[j+k]이 다릅니다. / cnt = "+cnt);
                            break; // k 포문 끝내기
                        }
                    }
                    break; // j for 문 끝내기
                }
                else{ // 같지 않다면 카운트는 0으로 초기화 j 포문 종료
                    cnt = 0;
                    // System.out.println("arr_n1[i] arr_n2[j]이 다릅니다. / cnt= "+cnt);
                    break;
                }
            }
        }
        if(ser == 1){ // 연속함수를 나타내는 변수가 1
            System.out.println("Yes");
        }
        else{
            System.out.println("No"); 
        }
    }
}