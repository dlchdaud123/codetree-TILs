import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aHour = sc.nextInt();
        int aMin = sc.nextInt();
        int bHour = sc.nextInt();
        int bMin = sc.nextInt();
        int elapsedTime = 0;

        while(true) {
            if(aHour == bHour && aMin == bMin)
                break;
            
            elapsedTime++;
            aMin++;

            if(aMin == 60) {
                aHour++;
                aMin = 0;
            }
        }

        System.out.print(elapsedTime);
    }
}