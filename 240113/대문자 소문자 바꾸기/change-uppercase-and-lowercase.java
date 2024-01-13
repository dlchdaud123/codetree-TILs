import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        char arr[] = str.toCharArray();

        for(int i = 0; i < len; i++){
            if('a' <= arr[i] && arr[i] <= 'z'){ // 소문자 -> 대문자
                System.out.print((char)(int)(arr[i] - 32));
            }
            else if('A' <= arr[i] && arr[i] <= 'Z'){ // 대문자 -> 소문자
                System.out.print((char)(int)(arr[i] + 32));
            }
        }
    }
}