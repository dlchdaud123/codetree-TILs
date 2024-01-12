import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if(str.length() % 2 == 0){ // 짝수 라면 맨 마지막 부터 -2
            for(int i = str.length()-1; i > 0; i -= 2){
                System.out.print(str.charAt(i));
            }
        }
        else{
            for(int i = str.length()-2; i > 0; i -= 2){
                System.out.print(str.charAt(i));
            }
        }
        

    }
}