import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        String AB = A + B;
        String BA = B + A;

        int aInt = Integer.parseInt(AB);
        int bInt = Integer.parseInt(BA);

        System.out.print(aInt+bInt);
    }
}