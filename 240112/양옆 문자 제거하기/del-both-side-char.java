import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        str = str.substring(0, 1) + str.substring(2);
        str = str.substring(0, len-3) + str.substring(len-2);
        System.out.print(str);
    }
}