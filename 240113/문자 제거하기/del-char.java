import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for(int i = 0; i < 20; i++){
            int n = sc.nextInt();
            if(str.length() < n){
                break;
            }
            str = str.substring(0, n) + str.substring(n+1);
            System.out.println(str);
        }
        System.out.println(str.charAt(0));
    }
}