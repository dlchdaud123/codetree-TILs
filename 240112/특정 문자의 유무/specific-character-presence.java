import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.print(str.contains("ee") ? "Yes" : "No");
        System.out.print(" ");
        System.out.print(str.contains("ab") ? "Yes" : "No");
    }
}