import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 10; i++){
            String str = sc.next();
            if(str.equals("END")){
                break;
            }
            char arr[] = str.toCharArray();
            for(int j = str.length()-1; j >= 0; j--){
                System.out.print(arr[j]);
            }
            System.out.println();
        }
    }
}