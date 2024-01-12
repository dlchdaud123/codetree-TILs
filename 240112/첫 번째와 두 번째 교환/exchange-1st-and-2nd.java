import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char arr[] = str.toCharArray();

        char tem_char1 = arr[0]; // c
        char tem_char2 = arr[1]; // o

        for(int i = 0; i < arr.length; i++){
            if(tem_char1 == arr[i]){
                arr[i] = tem_char2;
            }
            else if(tem_char2 == arr[i]){
                arr[i] = tem_char1;
            }
            System.out.print(arr[i]);
        }

    }
}