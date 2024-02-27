import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        str1 = "";
        str2 = "";

        for(int i = 0; i < arr1.length; i++){
            if('0' <= arr1[i] && arr1[i] <= '9'){
                str1 += arr1[i];
            }
        }
        for(int i = 0; i < arr2.length; i++){
            if('0' <= arr2[i] && arr2[i] <= '9'){
                str2 += arr2[i];
            }
        }
        System.out.print(Integer.parseInt(str1) + Integer.parseInt(str2));
    }
}