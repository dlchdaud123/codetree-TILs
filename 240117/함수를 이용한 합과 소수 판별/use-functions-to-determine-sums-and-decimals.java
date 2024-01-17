import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;
        for(int i = a; i <= b; i++){
            if(isPrime(i) && allEven(i)){
                cnt++;
            }
        }
        System.out.print(cnt);
    }
    public static boolean isPrime(int n) {
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean allEven(int n){
        return (((n % 10) % 2) + ((n / 10) % 2)) % 2 == 0;
    }
}