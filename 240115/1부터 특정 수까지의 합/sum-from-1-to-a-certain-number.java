import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int answer = p(N);
        System.out.print(answer);
    }

    public static int p(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        return sum / 10;
    }
}