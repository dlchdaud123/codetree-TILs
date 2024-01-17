import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        if(isOddYear(y)){
            System.out.print("true");
        }
        else{
            System.out.print("false");
        }
    }
    public static boolean isOddYear(int n) {
        if(n % 4 == 0){
            if(n % 100 == 0){
                if(n % 400 == 0){
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }
}