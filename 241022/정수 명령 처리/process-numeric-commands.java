import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < n; i++){
            String s = sc.next();
            if(s.equals("push")){
                int j = sc.nextInt();
                stack.push(j);
            }
            else if(s.equals("pop")){
                System.out.println(stack.pop());
            }
            else if(s.equals("size")){
                System.out.println(stack.size());
            }
            else if(s.equals("empty")){
                if(stack.empty()){
                    System.out.println(1);
                }
                else{
                    System.out.println(0);
                }
            }
            else if(s.equals("top")){
                System.out.println(stack.peek());
            }
        }
    }
}