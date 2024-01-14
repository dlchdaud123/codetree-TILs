import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += sc.nextInt();
        }
        String str = Integer.toString(sum);
        char arr[] = str.toCharArray();
        
        for(int i = 1; i < str.length(); i++){
            System.out.print(arr[i]);
        }
        System.out.print(arr[0]);

        
    }
}