import java.util.Scanner;
public class Main {
    public static int func(int n, int cnt) {
        if(n == 1) {
            return cnt;
        }
        if(n % 2 == 0) {
            n /= 2;
        }
        else{
            n = n * 3 + 1;
        }
        cnt++;
        return func(n, cnt);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        System.out.print(func(n, cnt));
    }
}