import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a+b;

        String str1 = Integer.toString(sum);

        int len = str1.length();
        int cnt = 0;

        for(int i = 0; i < len; i++){
            if(str1.charAt(i) == '1'){
                cnt++;
            }
        }
        System.out.print(cnt);


    }
}