import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int cnt = 0;

        int arr_n1[] = new int[100];
        int arr_n2[] = new int[100];

        for(int i = 0; i < n1; i++){
            arr_n1[i] = sc.nextInt();
        }
        for(int i = 0; i < n2; i++){
            arr_n2[i] = sc.nextInt();
        }
        do{
        for(int i = 0; i < n1; i++){
            for(int j = 0; j < n2; j++){
                if(arr_n1[i] == arr_n2[j]){
                    for(int k = 0; k < j ; k++){
                        if(arr_n1[i+k] == arr_n2[j+k]){
                            cnt++;
                            // System.out.println(arr_n1[i+k]+" "+arr_n2[j+k]);
                            // System.out.println(cnt);
                            if(cnt == n2){
                                System.out.println("Yes");
                            }
                        }
                    }
                }
            }
        }
        }while(cnt == n2);

        if(cnt != n2){
            System.out.println("No");
        }

    }
}