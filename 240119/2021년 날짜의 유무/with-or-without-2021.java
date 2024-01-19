import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int D = sc.nextInt();

        if(month_right(M)){ // M이 13 보다 작을때
            if(day_right(M, D)){
                System.out.print("Yes");
            }
        }
        else{ // M이 13 보다 크거나 같을때 
            System.out.print("No");
        }

    }

    public static boolean month_right(int M) {
        boolean right = false;
        if(M < 13){
            return right = true;
        }
        else{
            return right = false;
        }
    }

    public static boolean day_right(int M, int D) {
        boolean right = false;
        if(M == 2){ // 2월 이면 일수가 28일보다 작으면 트루
            if(D <= 28){
                return right = true;
            }
        }
        else if(M <= 7){ // 7월 보다 작거나 같은 달이면 홀수 일때 31일
            if(D % 2 == 0){ // 짝수 일때
                if(D <= 30){ // 30일 보다 작거나 같아야함
                    return right = true;
                }
                else{
                    return right = false;
                }
            }
            else{ // 홀수 일때
                if(D <= 31){ // 31일 보다 작거나 같아야함
                    return right = true;
                }
                else{
                    return right = false;
                }
            }
        }
        else{ // 8월 보다 크거나 같은 달이면 짝수일때 31일
            if(D % 2 == 1){ // 짝수 일때
                if(D <= 30){ // 30일 보다 작거나 같아야함
                    return right = true;
                }
                else{
                    return right = false;
                }
            }
            else{ // 홀수 일때
                if(D <= 31){ // 31일 보다 작거나 같아야함
                    return right = true;
                }
                else{
                    return right = false;
                }
            }
        }
        return right;
    }
}