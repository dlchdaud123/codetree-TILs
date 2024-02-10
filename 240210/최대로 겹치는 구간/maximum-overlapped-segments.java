import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[200];
        int a = 0;
        int b = 0;
        int max = 0;

        for(int i = 0; i < n; i++){
            a = sc.nextInt()+100;
            b = sc.nextInt()+100;
            for(int j = a; j < b; j++){
                arr[j] += 1;
            }
        }
        for(int i = 0; i < 200; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.print(max);

        // 구간 별로 1씩 증가
        // 몇개의 선분이 겹치는지 어떻게 구할까 -> 배열 max 값을 반환 하면 됨

    }
}