import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] month = new int[] {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] week = new String[] {"Mon", "Sun", "Sat", "Fri", "Thu", "Wed", "Tue"};
        String[] weekRev = new String[] {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int m1Days = 0;
        int m2Days = 0;


        // m1월 d1일 까지의 일 수 구하고 m2월 d1일 까지의 일 수를 구해서 빼기
        
        // m1월 d1일 까지의 일 수
        for(int i = 1; i < m1; i++) {
            m1Days = m1Days + month[i];
        }
        m1Days = m1Days + d1;

        // m2월 d2일 까지의 일 수
        for(int i = 1; i < m2; i++) {
            m2Days = m2Days + month[i];
        }
        m2Days = m2Days + d2;

        int diff = m1Days - m2Days;

        // System.out.println(m1Days);
        // System.out.println(m2Days);
        // System.out.println(diff);

        // diff를 가지고 요일 출력
        // 일단 m2가 더 과거라고 전제
        if(diff >= 0)
        System.out.println(week[diff % 7]);
        else
        System.out.println(weekRev[diff*-1 % 7]);
    }
}