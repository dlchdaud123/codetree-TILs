import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        double arr[] = new double[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextDouble();
            //System.out.print("arr[i] = "+arr[i]+" ");
            sum += arr[i];
        }
        System.out.printf("%.1f\n", sum/n);
        if(sum/n >= 4.0){
            System.out.print("Perfect");
        }
        else if(sum/n >= 3.0){
            System.out.print("Good");
        }
        else{
            System.out.print("Poor");
        }
    }
}