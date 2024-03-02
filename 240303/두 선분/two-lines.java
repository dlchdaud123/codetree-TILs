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
        
        if(x2 < x3){
            System.out.print("nonintersecting");
        }
        else if(x4 < x1){
            System.out.print("nonintersecting");
        }
        else{
            System.out.print("intersecting");
        }
        
        // System.out.print("intersecting");
        // System.out.print("nonintersecting");
    }
}