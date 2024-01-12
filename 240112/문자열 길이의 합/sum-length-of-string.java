import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// n 입력

        String[] arr = new String[10];
        int length_cnt = 0;
        int a_cnt = 0;

        for(int i = 0; i < n; i++){ // arr 할당
            arr[i] = sc.next();
            // System.out.println(arr[i]);
        }

        for(int i = 0; i < n; i++){
            if(arr[i].charAt(0) == 'a'){
                a_cnt++;
            }
            length_cnt = length_cnt + arr[i].length();
        }
        System.out.print(length_cnt+" "+a_cnt);
    }    
}