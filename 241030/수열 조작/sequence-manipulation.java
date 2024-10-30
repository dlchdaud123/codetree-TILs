import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            dq.addFirst(i);
        }

        while(dq.size() == 1){
            dq.pollFirst();
            dq.addFirst(dq.peekLast());
            dq.pollLast();
        }
        System.out.println(dq.pollFirst());
    }
}