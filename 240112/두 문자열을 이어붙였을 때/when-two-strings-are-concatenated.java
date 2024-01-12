import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = str1+str2;
        String str4 = str2+str1;

        

        System.out.println(str3.equals(str4));
    }
}