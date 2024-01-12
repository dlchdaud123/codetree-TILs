import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[]= new String[n];
        int cnt = 0;
        String tostr = "";

        for(int i = 0; i < n; i++){
            arr[i] = sc.next();
        }

        for(int i = 0; i < n; i++){
            tostr += arr[i];
        }
        for(int i = 0 ; i < tostr.length(); i++){
            System.out.print(tostr.charAt(i));
            cnt++;
            if(cnt == 5){
                System.out.println();
                cnt = 0;
            }
        }
        
        
    }
}