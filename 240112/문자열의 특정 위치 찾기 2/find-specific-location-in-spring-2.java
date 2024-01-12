import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[] { "apple", "banana", "grape", "blueberry", "orange" };
        char alp = sc.next().charAt(0);
        int cnt = 0;

        for(int i = 0; i < 5; i++){
            for(int j = 2; j < 4; j++){
                if(arr[i].charAt(j) == alp){
                    System.out.println(arr[i]);
                    cnt++;
                }
            }
        }
        System.out.print(cnt);
    }

    
}