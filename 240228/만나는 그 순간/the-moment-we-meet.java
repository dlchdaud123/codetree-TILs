import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arrA = new int[10000000];
        int[] arrB = new int[10000000];
        int totalTime = 0;
        int cnt = 0;

        for(int i = 0; i < n; i++){
            String dir = sc.next();
            int time = sc.nextInt();
            if(dir.equals("R")){
                for(int j = 0; j < time; j++){
                    arrA[totalTime++] = cnt++;
                }
            }
            else{
                for(int j = 0; j < time; j++){
                    arrA[totalTime++] = cnt--;
                }
            }
            
        }
        totalTime = 0;
        cnt = 0;
        for(int i = 0; i < m; i++){
            String dir = sc.next();
            int time = sc.nextInt();
            if(dir.equals("R")){
                for(int j = 0; j < time; j++){
                    arrB[totalTime++] = cnt++;
                }
            }
            else{
                for(int j = 0; j < time; j++){
                    arrB[totalTime++] = cnt--;
                }
            }
        }

        // for(int i = 0; i < 1000; i++){
        //     System.out.println(arrA[i]+" "+arrB[i]);
        // }
        
        for(int i = 1; i < totalTime; i++){
            if(arrA[i] == arrB[i]){
                System.out.print(i);
                return;
            }
        }
        System.out.print(-1);
    }
}