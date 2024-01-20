import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Y = sc.nextInt();
        int M = sc.nextInt();
        int D = sc.nextInt();

            if(lastday(M, D, Y)){ // 올바른 일수라면 계절 리턴
                // System.out.println("올바른 말일 입니다");
                System.out.println(Season(M));
            }
            else{
                // System.out.println("올바르지 않은 말일 입니다");
                System.out.print("-1");
            }
    }
    public static boolean oddYear(int Y) { // 윤년인지 판단
        boolean right = false;
        if(Y % 4 != 0){ // 4의 배수가 아니면 윤년이 아님
            return right = false;
        }
        else if(Y % 100 != 0){ // 4의 배수이지만 100의 배수가 아니면 윤년이 아님
            return right = false;
        }
        else if(Y % 400 != 0){ //4의 배수고 100의 배수이지만 400의 배수가 아니면 윤년이 아님
            return right = false;
        }
        else{ //4 배수 100 배수 400 배수 -> 윤년
            return right = true;
        }
    }

    public static boolean lastday(int M, int D, int Y) { // 마지막 일수 판단
        boolean lastday_right = false;
        if(M == 2){
            if(oddYear(Y)){ // 윤년이면
                if(D <= 29){
                    return lastday_right = true; // 말일이 맞음
                }
                else{
                    return lastday_right = false; // 말일이 틀림
                }
            }
            else{ // 윤년이 아니면
                if(D <= 28){
                    return lastday_right = true; // 말일이 맞음
                }
                else{
                    return lastday_right = false; // 말일이 틀림
                }
            }
        }
        else if(M == 4 || M == 6 || M == 9 || M == 11){
            if(D <= 30){ // 30일보다 작거나 같으면 
                return lastday_right = true;
            }
            else{
                return lastday_right = false;
            }
        }
        else{ // 1, 3, 5, 7, 8, 10, 12 월
            if(D <= 31){ // 31일보다 작거나 같으면 
                return lastday_right = true;
            }
            else{
                return lastday_right = false;
            }
        }
    }

    public static String Season(int M) { //계절 할당
        String str = "";
        if(3 <= M && M <= 5){
            str = "Spring";
            return str;
        }
        else if(6 <= M && M <= 8){
            str = "Summer";
            return str;
        }
        else if(9 <= M && M <= 11){
            str = "Fall";
            return str;
        }
        else{
            str = "Winter";
            return str;
        }
    }
}