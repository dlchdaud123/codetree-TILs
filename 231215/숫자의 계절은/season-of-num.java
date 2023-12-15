import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(3 <= a && a <=5){
            System.out.println("Spring");
        }
        else if(6 <= a && a <= 8){
            System.out.println("Summer");
        }
        else if(9 <= a && a <= 11){
            System.out.println("Fall");
        }
        else{
            System.out.println("Winter");
        }
        

    }
}