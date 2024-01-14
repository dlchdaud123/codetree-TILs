import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int str1_len = str1.length();
        int str2_len = str2.length();
        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();
        int cnt1 = 0;
        int cnt2 = 0;

        for(int i = 0; i < str1_len; i++){ // 어디까지 숫자인지 탐색
            if('0' <= arr1[i] && arr1[i] <= '9'){
                cnt1++;
            }
            else{
                break;
            }
        }

        str1 = str1.substring(0, cnt1);

        for(int i = 0; i < str2_len; i++){ // 어디까지 숫자인지 탐색
            if('0' <= arr2[i] && arr2[i] <= '9'){
                cnt2++;
            }
            else{
                break;
            }
        }

        str2 = str2.substring(0, cnt2);

        int str1_Int = Integer.parseInt(str1);
        int str2_Int = Integer.parseInt(str2);

        System.out.print(str1_Int+str2_Int);
    }
}