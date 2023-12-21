import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        while(true){
            int len = sc.nextInt();
            int hei = sc.nextInt();
            char name = sc.next().charAt(0);
            System.out.println(len*hei);

            if(name == 'C'){
                break;
            }
        }
    }
}