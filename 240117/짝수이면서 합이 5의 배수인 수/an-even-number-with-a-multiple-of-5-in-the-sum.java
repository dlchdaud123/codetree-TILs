import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isMagicNumber(n)){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
        
    }
    public static boolean isMagicNumber(int n) {
        String str = Integer.toString(n);
        char arr[] = str.toCharArray();
        int eachSum = 0;
        for(int i = 0; i < str.length(); i++){
            // System.out.println(arr[i]);
            eachSum += (arr[i]-48);
        }
        // System.out.println(str.length());
        // System.out.println(eachSum);
        // System.out.println((int)'0');

        return n % 2 == 0 && eachSum % 5 == 0;
    }
}