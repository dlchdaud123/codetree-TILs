import java.util.*;
public class Main {
    public static void func(int n) {
        if(n == 0){
            return;
        }
        System.out.print(n+" ");
        func(n-1);
        System.out.print(n+ " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        func(n);
    }
}