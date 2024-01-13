import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        char arr[] = str.toCharArray();

        for(int i = 0; i < len; i++){
            //문자 배열이 소문자이면 대문자로 바꿔줌
            if('a' <= arr[i] && arr[i] <= 'z'){
                System.out.print((char)(arr[i]-32));
            }
            //문자 배열이 대문자이면 그대로 프린트
            else if('A' <= arr[i] && arr[i] <= 'Z'){
                System.out.print(arr[i]);
            }
            //숫자나 다른거면 공백으로 바꿈
            else{
                
            }
        }
        
    }
}