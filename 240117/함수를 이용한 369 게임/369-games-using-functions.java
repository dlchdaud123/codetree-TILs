import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;

        for(int i = a; i <= b; i++){
            if(find369(i) || find3times(i)){
                cnt++;
            }
        }
        System.out.print(cnt);
    }
    public static boolean find369(int n){
        boolean f369 = false;
        String str = Integer.toString(n);
        char arr[] = str.toCharArray();
        for(int i = 0; i < str.length(); i++){
            if((arr[i] - 48) == 3 || (arr[i] - 48) == 6 || (arr[i] - 48) == 9){
                f369 = true;
            }
        }
        return f369;
    }

    public static boolean find3times(int n){
        // boolean 3times = false;
        return n % 3 == 0;
    }
}