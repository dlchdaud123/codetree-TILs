import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        

        int mid = 0; 
        if((b > a && a > c) || (c > a && a > b)){
            mid = a;
        }
        else if((a > b && b > c )|| (c > b && b > a)) {
            mid = b; // 5 3 1 
        }
        else{
            mid = c; // 1 5 3
        }
        System.out.print(mid);
    }
}