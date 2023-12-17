import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int max = a;
        int min = b;
        if(b > a){
            max = b;
            min = a;
        }
        for(int i = max; i >= min; i--){
            System.out.print(i+" ");
        }
    }
}