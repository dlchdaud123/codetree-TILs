import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char a_yn = sc.next().charAt(0);
        int a_tp = sc.nextInt();
        char b_yn = sc.next().charAt(0);
        int b_tp = sc.nextInt();
        char c_yn = sc.next().charAt(0);
        int c_tp = sc.nextInt();

        

        if(a_yn == 'Y'){
            if(a_tp >= 37){
                System.out.println('A');
            }
            else{
                System.out.println('C');
            }
        }
        else{
            if(a_tp >= 37){
                System.out.println('B');
            }
            else{
                System.out.println('D');
            }
        }

        if(b_yn == 'Y'){
            if(b_tp >= 37){
                System.out.println('A');
            }
            else{
                System.out.println('C');
            }
        }
        else{
            if(b_tp >= 37){
                System.out.println('B');
            }
            else{
                System.out.println('D');
            }
        }

        if(c_yn == 'Y'){
            if(c_tp >= 37){
                System.out.println('A');
            }
            else{
                System.out.println('C');
            }
        }
        else{
            if(c_tp >= 37){
                System.out.println('B');
            }
            else{
                System.out.println('D');
            }
        }
    }
}