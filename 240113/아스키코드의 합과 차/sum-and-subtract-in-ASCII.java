import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);

        System.out.print((int)a+(int)b);
        if((int)a > (int)b){
            System.out.print(a - b+" ");
        }
        else{
            System.out.print(b - a);
        }
    }
}