import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 별의 개수 = 2n - 1
        // 공백 개수 = n

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j < (2*n) - (2*(i-1)); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}