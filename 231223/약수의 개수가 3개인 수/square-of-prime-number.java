import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int cnt = 0;

        for(int i = start; i <= end; i++){
            int yak_gat = 0; // 
            for(int j = 1; j <= i; j++){
                if(i % j == 0){ // 나눠 떨어지면 
                    yak_gat++;
                }
            }
            if(yak_gat == 3){
                //System.out.println("i="+i);
                cnt++;
            }
        }
        System.out.print(cnt);

    }
}