import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int ee_cnt = 0;
        int eb_cnt = 0;

        for(int i = 0; i < str.length()-1; i++){
            if(str.charAt(i) == 'e' && str.charAt(i+1) == 'e'){
                ee_cnt++;
            }
            if(str.charAt(i) == 'e' && str.charAt(i+1) == 'b'){
                eb_cnt++;
            }
        }
        System.out.print(ee_cnt+" ");
        System.out.print(eb_cnt);

        
    }
}