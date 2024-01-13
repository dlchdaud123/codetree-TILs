import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next(); // 문자열
        String new_str = "";
        int q = sc.nextInt(); // 요청의 개수
        int len = str.length();

        for(int i = 0; i < q; i++){
            int q_num = sc.nextInt();
            if(q_num == 1){ // 1 문자열 당기고 맨 앞에걸 뒤로
                str = str.substring(1) + str.substring(0, 1);
                System.out.println(str);
            }
            else if(q_num == 2){ // 2
                str = str.substring(len-1, len) + str.substring(0, len-1);
                System.out.println(str);
            }
            else{ // 3
                for(int j = 0; j < len/2; j++){
                    new_str += str.substring(len-(j+1), len-j);
                }
                for(int j = 0; j < len/2; j++){
                    new_str += str.substring(len/2 - (j+1), len/2 - j);
                }

                System.out.println(new_str);
                str = new_str;
                new_str = "";
            }
        }
    }
}