import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // 처음 '(' 을 찾고 그다음 ')'의 갯수를 찾기
        // 그 다음 '(' 을 찾고 그다음 ')'의 갯수를 찾기
        char[] arr = str.toCharArray();
        int cnt = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == '(' ){
                for(int j = i + 1; j < arr.length; j++){
                    if(arr[j] == ')'){
                        cnt++;
                    }
                }                
            }
        }
        System.out.println(cnt);
        
    }
}