import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y = 0;

        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, -1, 0, 1};

        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            char direction = sc.next().charAt(0);
            int length = sc.nextInt();
            if(direction == 'N'){ // 북 쪽으로 이동
                y = y + length;
            }
            else if(direction == 'W'){ // 서 쪽으로 이동
                x = x - length;
            }
            else if(direction == 'S'){ // 남 쪽으로 이동
                y = y - length;
            }
            else{ // 동 쪽으로 이동
                x = x + length;
            }
        }
        System.out.println(x+" "+y);
    }
}