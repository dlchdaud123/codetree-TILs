import java.util.Scanner;

public class Main {
    public static final int Max_N = 50;

    public static int n;
    public static int[] arr = new int[Max_N];

    public static void modify(int arr[]){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0)
                arr[i] = -arr[i];
        }
        return;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        modify(arr);

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}