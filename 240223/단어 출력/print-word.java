import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int days = 0;
    // 월 차를 이용해서 일수 구하기
    // 일 차를 이용해서 일수 구하기
    // 일 수를 7로 나눈 나머지를 이용해서 요일 알아내기

    // x가 1월이면 일 차만 이용해서 일수 구하기
    if(x == 1){
      for(int i = 1; i < y; i++){
        days++;
      }
    }
    // x가 2월이상이면 월차, 일차 같이 구하기
    else
      for(int i = 1; i < x; i++){
        days += month[i];
      }
      days += y;
  }
  String[] week = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
  System.out.print(days % 7);
}