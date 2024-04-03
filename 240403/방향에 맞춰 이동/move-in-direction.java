import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        int y = 0;

        for(int i = 0; i < n; i++){
            char dir = sc.next().charAt(0);
            int length = sc.nextInt();
            if(dir == 'N'){
                y = y + length;
            }
            else if(dir == 'E'){
                x = x + length;
            }
            else if(dir == 'S'){
                y = y - length;
            }
            else{
                x = x - length;
            }
        }
        System.out.println(x + " " + y);
    }
}