import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int cnt_class = 0;
        int cnt_aisle = 0;
        int cnt_rest = 0;

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            
            if(i % 12 == 0){ // 교실, 복도, 화장실 겹침
                if(cnt_rest < cnt_aisle && cnt_rest < cnt_class){
                    cnt_rest++; // 화장실이 제일 긴 주기
                }
                else if(cnt_aisle < cnt_rest && cnt_aisle < cnt_class){
                    cnt_aisle++; // 복도가 제일 긴 주기
                }
                else{
                    cnt_class++; // 교실이 제일 긴 주기
                }
            }
            else if(i % 6 == 0){ // 교실, 복도 겹침
                if(cnt_aisle < cnt_class){
                    cnt_aisle++; // 복도가 제일 긴 주기
                }
                else{
                    cnt_class++; // 교실이 제일 긴 주기
                }
            }
            else if(i % 2 == 0){ // 교실
                cnt_class++;
            }
            else if(i % 3 == 0){ // 복도
                cnt_aisle++;
            }

        }
        System.out.print(cnt_class+" "+cnt_aisle+" "+cnt_rest);
    }
}