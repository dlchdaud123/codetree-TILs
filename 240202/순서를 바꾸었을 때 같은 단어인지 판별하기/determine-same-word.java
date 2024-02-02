import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        str1 = new String (arr1);
        str2 = new String (arr2);

        // System.out.println(str1);
        // System.out.println(str2);

        
        if(str1.equals(str2)){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}