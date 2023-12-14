import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();

        if(price >= 3000){
            System.out.print("book");
        }
        else if(price >= 1000){
            System.out.print("mask");
        }
        else if(price >= 500){
            System.out.print("pen");

        }
        else{
            System.out.print("no");

        }
    }
}