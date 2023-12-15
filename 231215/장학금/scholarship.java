import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int Mid_Score = sc.nextInt();
        int Fin_Score = sc.nextInt();

        if(90 <= Mid_Score && 95 <= Fin_Score){
            System.out.print(10);
        }
        else if(90 <= Mid_Score && 90 <= Fin_Score){
            System.out.print(5);
        }
        else{
            System.out.print(0);
        }
    }
}