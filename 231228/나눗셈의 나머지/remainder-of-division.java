import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int na[] = new int[b];
        int sum = 0;

        for(int i = 0; i < 1000; i++){
            na[a % b]++;
            a = a / b;
            if(a <= 1){
                break;
            }
        }
        for(int i = 0; i < b; i++){
            sum = sum + (na[i] * na[i]);
            System.out.println(sum);
        }
        System.out.print(sum);
    }
}