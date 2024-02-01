import java.util.Scanner;
public class Main {
    public static int sum = 0;
    public static int eachMul(int mul) {
        if(mul < 10) {
            return mul;
        }
        return eachMul(mul/10) + (mul % 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int mul = n1*n2*n3;
        System.out.print(eachMul(mul));
    }
}