import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print(a % 13 == 0 || a % 19 == 0 ? "True" : "False");
    }
}