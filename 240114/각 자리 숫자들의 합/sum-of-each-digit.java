import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String str = Integer.toString(n);
        char arr[] = str.toCharArray();

        int sum = 0;

        for(int i = 0; i < str.length(); i++){
            sum += (arr[i] - 48);
            // System.out.print(arr[i]);
        }
        System.out.print(sum);

    }
}