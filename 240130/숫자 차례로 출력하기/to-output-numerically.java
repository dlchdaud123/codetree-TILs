import java.util.*;
public class Main {
    public static void decl(int n){
        if(n == 0){
            return;
        }
        decl(n-1);
        System.out.print(n+" ");
    }
    public static void incl(int n){
        if(n == 0){
            return;
        }
        System.out.print(n+" ");
        incl(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        decl(n);
        System.out.println();
        incl(n);
    }
}