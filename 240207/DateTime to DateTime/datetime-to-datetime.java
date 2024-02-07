import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = 11;
        int hour = 11;
        int min = 11;

        int dayA = sc.nextInt();
        int hourB = sc.nextInt();
        int minC = sc.nextInt();
        int elapsedMin = 0;

        while(true) {
            if(day == dayA && hour == hourB && min == minC)
                break;
            elapsedMin++;
            min++;

            if(min > 59){
                hour++;
                min = 0;
            }
            if(hour > 23){
                day++;
                hour = 0;
            }
        }
        System.out.print(elapsedMin);
    }
}