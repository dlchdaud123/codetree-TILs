import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(); // 지워져야 하는 배열
        String b = sc.next(); // 지우는 요소
        int len = b.length();

        while(true){
            if(a.indexOf(b) == -1){
                break;
            }
            a = a.substring(0, a.indexOf(b)) + a.substring(a.indexOf(b)+len);
        }

        System.out.print(a);
    }
}