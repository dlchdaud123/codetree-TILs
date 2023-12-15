import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        

        int mid = a;
        if(a > b) {
            if(c < b){
                mid = b;
            }
        }
        else {
            if(c > b){
                mid = c;
            }
        }
        System.out.print(mid);
    }
}