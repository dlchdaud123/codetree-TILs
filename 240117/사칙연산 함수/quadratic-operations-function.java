import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();

        if(o == '+'){
            System.out.print(a+" + "+c+" = "+add(a, c));
        }
        else if(o == '-'){
            System.out.print(a+" - "+c+" = "+sub(a, c));
        }
        else if(o == '/'){
            System.out.print(a+" / "+c+" = "+div(a, c));
        }
        else if(o == '*'){
            System.out.print(a+" * "+c+" = "+mul(a, c));
        }
        else{
            System.out.print("False");
        }
    }

    public static int add(int n, int m){
        return n + m;
    }
    public static int sub(int n, int m){
        return n - m;
    }
    public static int div(int n, int m){
        return n / m;
    }
    public static int mul(int n, int m){
        return n * m;
    }
}