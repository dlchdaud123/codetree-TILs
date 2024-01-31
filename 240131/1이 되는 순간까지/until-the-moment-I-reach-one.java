import java.util.Scanner;
public class Main {
    public static int cnt = 0;
    public static int count(int n) {
        if(n == 1){
            return cnt;
        }
        if(n % 2 == 0){
            cnt++;
            return count(n /= 2);
        }
        else{
            cnt++;
            return count(n /= 3);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(count(n));
    }
}