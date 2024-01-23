import java.util.Scanner;

class Inf{
    String code;
    char color;
    int second;
    
    public Inf(String code, char color, int second){
        this.code = code;
        this.color = color;
        this.second = second;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String code = sc.next();
        char color = sc.next().charAt(0);
        int second = sc.nextInt();

        Inf inf = new Inf(code, color, second);
        System.out.println("code : "+inf.code);
        System.out.println("color : "+inf.color);
        System.out.println("second : "+inf.second);
    }
}