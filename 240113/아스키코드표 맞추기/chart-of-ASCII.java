import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < 5; i++){
            int a = sc.nextInt();
            System.out.print((char)a+" ");
        }
    }
}