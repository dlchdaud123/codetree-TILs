import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> dq = new ArrayDeque<>();
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            String command = sc.next();
            if(command.equals("push_back")){
                int j = sc.nextInt();
                dq.addLast(j);
            }
            else if(command.equals("push_front")){
                int j = sc.nextInt();
                dq.addFirst(j);
            }
            else if(command.equals("pop_front")){
                System.out.println(dq.pollFirst());
            }
            else if(command.equals("pop_back")){
                System.out.println(dq.pollLast());
            }
            else if(command.equals("size")){
                System.out.println(dq.size());
            }
            else if(command.equals("empty")){
                if(dq.isEmpty()){
                    System.out.println(1);
                }
                else{
                    System.out.println(0);
                }
            }
            else if(command.equals("front")){
                System.out.println(dq.peekFirst());
            }
            else if(command.equals("back")){
                System.out.println(dq.peekLast());
            }

        }
    }
}