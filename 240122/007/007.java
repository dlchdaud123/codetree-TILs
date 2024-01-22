import java.util.Scanner;

class Spy {
    String secretCode;
    char meetingPoint;
    int time;

    public Spy(String secretCode, char meetingPoint, int time){
        this.secretCode = secretCode;
        this.meetingPoint = meetingPoint;
        this.time = time;
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String sCode;
        char mPoint;
        int time;

        sCode = sc.next();
        mPoint = sc.next().charAt(0);
        time = sc.nextInt();

        Spy sp = new Spy(sCode, mPoint, time);

        System.out.println("secret code : " + sp.secretCode);
        System.out.println("meeting point : " + sp.meetingPoint);
        System.out.println("time : " + sp.time);
    }
}