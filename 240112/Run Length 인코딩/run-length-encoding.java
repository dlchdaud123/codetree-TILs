import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr = sc.nextLine();
        int cnt = 1;

        for(int i = 1; i < arr.length(); i++){
            // System.out.println(arr.charAt(i));
            if(arr.charAt(i) == arr.charAt(i-1)){ //i-1 == i이면 cnt++
                cnt++;
            }
            else{
                System.out.println(arr.charAt(i-1)+""+cnt); //다르면 cnt = 1
                cnt = 1;
            }
        }
        System.out.println(arr.charAt(arr.length()-1)+""+cnt);
    }
}