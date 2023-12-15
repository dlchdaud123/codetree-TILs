import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();

        if(y % 4 == 0){
            if(y % 100 == 0){
                if(y % 400 ==0){
                    System.out.print("true");
                }
                else{
                    System.out.print("false");
                }
            }
            else{
                System.out.print("true");

            }

        }
        else{
            System.out.print("false");

        }


        /**if(((y % 4 == 0) || (y % 4 == 0 && y % 100 && y % 400))){
            if(y)
        }**/
    }
}