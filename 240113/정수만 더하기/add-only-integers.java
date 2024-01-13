import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        char arr[] = str.toCharArray();
        int sum = 0;

        for(int i = 0; i < len; i++){
            if('1' <= arr[i] && arr[i] <= '9'){
                sum += (int)(arr[i] - 48);
            }
        }
        System.out.print(sum);
    }
}