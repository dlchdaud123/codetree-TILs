import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        String str[] = new String[200];
        
        for(int i = 0; i < 200; i++){
            str[i] = sc.next();
            if(str[i].equals("0")){
                break;
            }
            cnt++;
        }
        System.out.println(cnt);
        for(int i = 0; i < cnt; i += 2){
            System.out.println(str[i]);
        }
    }
}