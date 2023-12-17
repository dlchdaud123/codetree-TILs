import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            if(i <= 10){ // n이 한 자리의 수
                if(i % 3 == 0){
                System.out.print(0+" ");
                }
                else
                System.out.print(i+" ");

            }
            if(i % 10 == 0){
                System.out.print(i+" ");
            }
            else if(i > 10){ // n이 두자리 수
                if(i % 3 == 0 || (i / 10) % 3 == 0 || (i % 10) % 3 == 0){
                System.out.print(0+" ");
                }
                else
                System.out.print(i+" ");
            }

            // 최대는 99 십의 자리 몫이 3의 배수거나 
            // (i / 10) % 3 == 0
            // 일의 자리 몫이 3의 배수
            // (i % 10) % 3 == 0
        }

    }
}