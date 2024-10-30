import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            dq.addLast(i);
        }

        while(dq.size() == 1){
            dq.pollFirst();
            dq.addLast(dq.peekFirst());
            dq.pollFirst();
        }
        System.out.println(dq.peekLast());
    }
}