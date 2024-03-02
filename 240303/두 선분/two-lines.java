import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[100];
        int[] arr2 = new int[100];

        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();
        int x4 = sc.nextInt();

        for(int i = x1; i <= x2; i++){
            arr1[i] = 1;
        }
        
        for(int i = x3; i <= x4; i++){
            if(arr1[i] == 1){
                System.out.print("intersecting");
                return;
            }
            arr2[i] = 1;
        }
        System.out.print("nonintersecting");
    }
}