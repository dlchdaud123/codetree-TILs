import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char a = 'A';

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(j >= i){
                    System.out.print(a+" ");
                    a++;
                }
                else{
                    System.out.print("  ");
                }
                if(a > 'Z'){
                    a = 'A';
                }
            }
            System.out.println();
        }
    }
}