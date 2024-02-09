import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] month = new int[] {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] week = new String[] {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String A = sc.next();
        int idx = 0;
        int m1Days = 0;
        int m2Days = 0;
        int cntA = 0;

        for(int i = 1; i < m1; i++){
            m1Days = m1Days + month[i];
        }
        m1Days = m1Days + d1;

        for(int i = 1; i < m2; i++){
            m2Days = m2Days + month[i];
        }
        m2Days = m2Days + d2;

        int diff = m2Days - m1Days;

        for(int i = 0; i < 7; i++) {
            if(A.equals(week[i])){
                idx = i;
            }
        }
        // System.out.println(diff);
        // System.out.println(idx);


        cntA = cntA + ((diff) / 7);

        // n주(7*n일)은 아니지만 A가 n번 나오는 경우
        if(diff % 7 >= idx){
            cntA++;
        }
        System.out.println(cntA);
    }
}