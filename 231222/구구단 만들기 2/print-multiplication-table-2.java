import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = 1; i <= 4; i++){
            for(int j = b; j >= a; j--){
                System.out.print(j+" * "+2*i+" = "+(j*2*(i)));
                if(j != a){
                    System.out.print(" / ");
                }
            }
            System.out.println();
        }
    }
}