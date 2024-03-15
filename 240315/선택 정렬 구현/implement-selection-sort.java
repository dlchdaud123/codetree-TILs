import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int tmp = 0;
        for(int i = 0; i < n-1; i++){
            int minimum = i;
            for(int k = i+1; k < n; k++){
                if(arr[k] < arr[minimum]){
                    tmp = arr[k];
                    arr[k] = arr[minimum];
                    arr[minimum] = tmp;
                }
            }
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }

    }
}