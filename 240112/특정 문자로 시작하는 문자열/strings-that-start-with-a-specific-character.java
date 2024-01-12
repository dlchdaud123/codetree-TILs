import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];
        int str_cnt = 0;
        int str_len = 0;

        for(int i = 0; i < n; i++){// 배열할당
            arr[i] = sc.next();
        }
        char alp = sc.next().charAt(0);

        for(int i = 0; i < n; i++){
            if(arr[i].charAt(0) == alp){
                str_cnt++;
                str_len += arr[i].length();
            }
        }

        System.out.printf("%d %.2f", str_cnt, (double)str_len/str_cnt);
    }
}