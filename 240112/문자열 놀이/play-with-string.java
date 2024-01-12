import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        char arr[] = str.toCharArray(); // 배열로 변경

        for(int i = 0; i < n; i++){
            int r = sc.nextInt(); // 질문 타입
            if(r == 1){ // 교환
                int c = sc.nextInt();
                int k = sc.nextInt();
                char tem = arr[c-1];
                arr[c-1] = arr[k-1];
                arr[k-1] = tem;
                for(int j = 0; j < arr.length; j++){
                    System.out.print(arr[j]);
                }
            }
            else{ // 변경
                char o = sc.next().charAt(0);
                char p = sc.next().charAt(0);
                for(int j = 0; j < arr.length; j++){
                    if(arr[j] == o){
                        arr[j] = p;
                    }
                }
                for(int j = 0; j < arr.length; j++){
                    System.out.print(arr[j]);
                }
            }
            System.out.println();
        }
    }
}