import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr = sc.next();
        char alp = sc.next().charAt(0);

        System.out.print(arr.indexOf(alp));
    }
}