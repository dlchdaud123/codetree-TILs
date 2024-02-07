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
            if(11 == dayA && 11 > hourB && 11 > minC){
                elapsedMin--;
                break;
            }
            if(11 == dayA && 11 > hourB){
                elapsedMin--;
                break;
            }
            if(day == dayA && hour == hourB && min == minC){
                // elapsedMin++;
                break;
            }
                
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
        if(elapsedMin == -1){
            System.out.print(-1);
        }
        else{
            System.out.print(elapsedMin);
        }
        
    }
}