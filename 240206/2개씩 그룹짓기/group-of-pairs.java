import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[2*n];
        for(int i = 0; i < 2*n; i++){
            arr[i] = sc.nextInt();
        }
        int[] arrSmall = new int[n];

        // 오름 차순
        Arrays.sort(arrSmall);
        for(int i = 0; i < n; i++){
            arrSmall[i] = arr[i];
        }
        // 내림 차순
        Integer[] arrBig = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(arrBig, Collections.reverseOrder());
        for(int i = n; i < 2*n; i++){
            arrBig[i] = arr[i];
        }
        System.out.print(arrSmall[0]+arrBig[0]);
    }
}