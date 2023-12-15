import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int gen = sc.nextInt();
        int age = sc.nextInt();

        if(age >= 19){
            if(gen == 0){
                System.out.print("MAN");
            }
            else{
                System.out.print("WOMAN");
            }
        }
        else{
            if(gen == 0){
                System.out.print("BOY");
            }
            else{
                System.out.print("GIRL");
            }
        }
    }
}