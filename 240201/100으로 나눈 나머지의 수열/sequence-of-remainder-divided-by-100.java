import java.util.Scanner;
public class Main {
    public static int facto(int n) {
        if(n == 1) {
            return 2;
        }
        if(n == 2) {
            return 4;
        }

        return facto(n-1) * facto(n-2) % 100;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(facto(n));
    }
}