import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        p(a, b);
    }
    public static void p(int n, int m) {

        for(int i = 1; i <= n*m; i++){
            // System.out.println(i);
            if(i % n == 0 && i % m == 0){
                System.out.println(i);
                break;
            }
        }

    }
}