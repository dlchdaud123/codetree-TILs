import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr[] = new String[10];
        int cnt = 0;

        for(int i = 0; i < 10; i++){
            arr[i] = sc.next();
            cnt = cnt + arr[i].length();
        }
        System.out.println(cnt);
    }
}