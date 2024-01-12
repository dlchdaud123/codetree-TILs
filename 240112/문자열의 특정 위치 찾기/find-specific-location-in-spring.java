import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr = sc.next();
        char alp = sc.next().charAt(0);
        int idx = -1;
        idx = arr.indexOf(alp);

        System.out.print(idx);
    }
}