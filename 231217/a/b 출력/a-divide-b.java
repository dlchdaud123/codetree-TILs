import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int tem = a;
        System.out.print((a/b)+".");
            tem = (tem - (b*(tem / b)));
        // ex) 7(a) / 8(b)
        for(int i = 0; i < 20; i++){
            tem *= 10;
            System.out.print(tem / b);
            tem = (tem - (b*(tem / b)));

        }
       
    }
    //a = 7, b = 8 
    //tem = 70 
    //70 = (70 - (8*(70 / 8))
}