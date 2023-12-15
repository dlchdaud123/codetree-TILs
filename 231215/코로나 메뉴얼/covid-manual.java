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

        char state_a;
        char state_b;
        char state_c;

        

        if(a_yn == 'Y'){
            if(a_tp >= 37){
                state_a = 'A';
            }
            else{
                state_a = 'C';
            }
        }
        else{
            if(a_tp >= 37){
                state_a = 'B';
            }
            else{
                state_a = 'D';
            }
        }

        if(b_yn == 'Y'){
            if(b_tp >= 37){
                state_b = 'A';
            }
            else{
                state_b = 'C';
            }
        }
        else{
            if(b_tp >= 37){
                state_b = 'B';
            }
            else{
                state_b = 'D';
            }
        }

        if(c_yn == 'Y'){
            if(c_tp >= 37){
                state_c = 'A';
            }
            else{
                state_c = 'C';
            }
        }
        else{
            if(c_tp >= 37){
                state_c = 'B';
            }
            else{
                state_c = 'D';
            }
        }

        if((state_a == 'A' && state_b == 'A' && state_c == 'A') 
        || (state_a == 'A' && state_b == 'A') 
        || (state_b == 'A' && state_c == 'A')
        || (state_a == 'A' && state_c == 'A')) {
            System.out.print('E');
        }
        else{
            System.out.print('N');


        }
    }
}