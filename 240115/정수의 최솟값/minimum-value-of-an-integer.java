import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.print(min(a, b, c));
    }

    public static int min(int n, int m, int o){
        int min = 100;
        if(n < min){
            min = n;
        }
        if(m < min){
            min = m;
        }
        if(o < min){
            min = o;
        }
        return min;
    }
}