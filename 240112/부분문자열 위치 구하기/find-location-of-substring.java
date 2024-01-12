import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String sub = sc.next();

        int idx = -1;
        idx = str.indexOf(sub);

        System.out.print(idx);
    }
}