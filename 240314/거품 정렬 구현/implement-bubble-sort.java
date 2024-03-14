import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int j = 0; j < n-1; j++){
            for(int i = 0; i < n-1; i++){
                int tmp = 0;
                if(arr[i] > arr[i+1]){
                    tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                }
            }
        }

        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}

// function bubble_sort(arr[])
//   set len = arr.size
  
//   for i = 0 ... i < len - 1
//     for j = 0 ... j < len - 1 - i
//       if arr[j] > arr[j + 1]
//         set tmp = arr[j]
//         arr[j] = arr[j + 1]
//         arr[j + 1] = tmp
  
//   return arr