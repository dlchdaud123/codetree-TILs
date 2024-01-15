import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        p(n1, n2);
    }
    public static void p(int n, int m) {
        int cur = 0;
        for(int i = 1; i < 100; i++){
            if(n % i == 0 && m % i == 0){
                cur = i;
            }
        }
        System.out.print(cur);
    }
}