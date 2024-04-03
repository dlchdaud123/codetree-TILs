import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dirNum = 3;
        int x = 0, y = 0;
        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, -1, 0, 1};
        int nx = 0, ny = 0;

        String rotate = sc.next(); // 방향바꾸는 문자열
        char[] rotate_arr = rotate.toCharArray();
        for(int i = 0; i < rotate_arr.length; i++){
            char dir = rotate_arr[i];
            if(dir == 'L'){ // 왼쪽으로 방향전환
                dirNum = (dirNum - 1 + 4) % 4;
            }
            else if(dir == 'R'){ // 오른쪽으로 방향전환
                dirNum = (dirNum + 1) % 4;
            }
            else { // 바라보고 있는 칸으로 이동
                nx = x + dx[dirNum];
                ny = y + dy[dirNum];
            }
        }
        System.out.println(nx + " "+ ny);
    }
}