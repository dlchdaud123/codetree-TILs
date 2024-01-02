import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(); // 수열 A의 갯수
        int n2 = sc.nextInt(); // 수열 B의 갯수
        int cnt = 0; 

        int arr_n1[] = new int[n1+1];
        int arr_n2[] = new int[n2+1];

        for(int i = 0; i < n1; i++){
            arr_n1[i] = sc.nextInt(); // A에 n1개의 수열
        }
        for(int i = 0; i < n2; i++){
            arr_n2[i] = sc.nextInt(); // B에 n2개의 수열
        }

        do{
        for(int i = 0; i < n1; i++){ // A 수열 1번째 부터 n1번째 까지
            System.out.println("i= "+i+" ");
            for(int j = 0; j < n2; j++){ // B 수열 1번째 부터 n1번째 까지
                System.out.println("j= "+j+" ");
                if(arr_n1[i] == arr_n2[j]){ // A와 B의 성분이 같으면
                            cnt++; // 같으면 카운트 +1
                            System.out.println(arr_n1[i]+" "+arr_n2[j]);
                            System.out.println("cnt="+cnt);
                }
                else{ // 같지 않다면 카운트는 0으로 초기화
                    cnt = 0;
                    System.out.println("cnt="+cnt);
                }
            }
        }
        }while(cnt == n2);

        if(cnt != n2){
            System.out.println("No");
        }
        if(cnt == n2){ // 만약 카운터 값이 n2 값이랑 같다면 
            System.out.println("Yes"); // 연속함수
        }

    }
}