import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = 11;
        int hour = 11;
        int min = 11;

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        int diff = (A * 24 * 60 + B * 60 + C) - (11 * 24 * 60 + 11 * 60 + 11);

        if(diff < 0){
            System.out.print(-1);
        }
        else
            System.out.print(diff);
    }
}