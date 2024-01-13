import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char arr[] = str.toCharArray();
        int len = str.length();

        for(int i = 0; i < len; i++){
            if('a' <= arr[i] && arr[i] <= 'z'){ // 소문자일 때
                System.out.print(arr[i]);
            }
            else if('A' <= arr[i] && arr[i] <= 'Z'){ // 대문자일 때
                System.out.print((char)(arr[i]+32));
            }
            else if('0' <= arr[i] && arr[i] <= '9'){
                System.out.print(arr[i]);
            }
        }

    }
}