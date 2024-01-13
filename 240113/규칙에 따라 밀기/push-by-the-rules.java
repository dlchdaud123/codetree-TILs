import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next(); // 조작해야하는 문자열
        String stm = sc.next(); // 명령어
        int A_len = A.length();
        int stm_len = stm.length(); // 명령어 길이

        char arr_A[] = A.toCharArray(); // 문자열 하나하나
        char arr_stm[] = stm.toCharArray(); // 명령어 하나하나
        
        for(int i = 0; i < stm_len; i++){
            if(arr_stm[i] == 'L'){
                A = A.substring(1) + A.substring(0, 1);
            }
            else if(arr_stm[i] == 'R'){
                A = A.substring(A_len-1, A_len) + A.substring(0, A_len-1);
            }
        }
        System.out.print(A);

    }
}