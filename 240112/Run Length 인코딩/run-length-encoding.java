import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr = sc.nextLine();
        String encoded = "";
        int cnt = 1;

        for(int i = 1; i < arr.length(); i++){
            // System.out.println(arr.charAt(i));
            char curr = arr.charAt(0);
            if(arr.charAt(i) == arr.charAt(i-1)){ //i-1 == i이면 cnt++
                cnt++;
            }
            else{
                encoded += arr.charAt(i-1);
                encoded += Integer.toString(cnt);
                // System.out.print(arr.charAt(i-1)+""+cnt); //다르면 cnt = 1
                cnt = 1;
            }
        }
        encoded += arr.charAt(arr.length()-1);
        encoded += Integer.toString(cnt);

        System.out.println(encoded.length());
        System.out.println(encoded);
        // System.out.print(arr.charAt(arr.length()-1)+""+cnt);
    }
}