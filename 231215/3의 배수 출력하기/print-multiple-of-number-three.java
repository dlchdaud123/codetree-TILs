import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 3;
        while(i < n+1){
            System.out.print(i+" ");
            i += 3;
        }
    }
}