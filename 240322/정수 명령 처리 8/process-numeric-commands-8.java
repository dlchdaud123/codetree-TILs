import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> l = new LinkedList<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            String inst = sc.next();

        if(inst.equals("push_front")){
            int a = sc.nextInt();
            l.addFirst(a);
        }
        else if(inst.equals("push_back")){
            int a = sc.nextInt();
            l.addLast(a);
        }
        else if(inst.equals("pop_front")){
            System.out.println(l.pollFirst());
        }
        else if(inst.equals("pop_back")){
            System.out.println(l.pollLast());
        }
        else if(inst.equals("size")){
            System.out.println(l.size());
        }
        else if(inst.equals("empty")){
            if(l.isEmpty()){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
        else if(inst.equals("front")){
            System.out.println(l.peekFirst());
        } 
        else{ // back
            System.out.println(l.peekLast());
        }

        }
    }
}