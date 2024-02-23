import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] arr = new int[N];
    for(int i = 0; i < N; i++){
      arr[i] = sc.nextInt();
    }
    int M = sc.nextInt();
    int[] arr2 = new int[M];
    for(int i = 0; i < M; i++){
      arr2[i] = sc.nextInt();
    }
    boolean exist = false;
    for(int i = 0; i < M; i++){
      for(int j = 0; j < N; j++){
        if(arr2[i] == arr[j]){
          exist = true;
          continue;
        }
      }
      if(exist == true){
        System.out.println(1+" ");
      }
      else{
        System.out.println(0+" ");
      }
      exist = false;
    }
  }
}