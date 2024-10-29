import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            String str = sc.next();
            if(str.equals("push")){
                int o = sc.nextInt();
                q.add(o);
            }
            else if(str.equals("pop")){
                System.out.println(q.poll());
            }
            else if(str.equals("size")){
                System.out.println(q.size());
            }
            else if(str.equals("empty")){
                if(q.isEmpty()){
                    System.out.println(1);
                }
                else{
                    System.out.println(0);
                }
            }
            else{ // front
                System.out.println(q.peek());
            }
            
        }
        
    }
}