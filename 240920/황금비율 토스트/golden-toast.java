import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Character> l = new LinkedList<>(); // 문자를 관리할 list를 선언합니다. => 빈 이중 연결 리스트
        int n = sc.nextInt(); // 식빵 갯수
        int m = sc.nextInt(); // 명령어 갯수

        for(int i = 0; i < n; i++){
            l.add(sc.next());
        }

        // iterator를 list의 맨 앞에 위치시킵니다.
        ListIterator<Character> it;

        // iterator를 list의 맨 앞에 위치시킵니다.
        it = l.listIterator();
        System.out.println(it.next());      // 원소 값을 출력하며 한 칸 뒤로 이동합니다.  ('a')
        System.out.println(it.next());      // 원소 값을 출력하며 한 칸 뒤로 이동합니다.  ('b')
        System.out.println(it.previous());  // 원소 값을 출력하며 한 칸 앞으로 이동합니다. ('b')
        System.out.println(it.previous());  // 원소 값을 출력하며 한 칸 앞으로 이동합니다. ('a')

        it.next();                          // remove 전에는 next가 필요합니다.
        it.remove();                        // 원소 'a'를 제거합니다.
        it.add('d');                        // 원소 'd'를 추가합니다.
        
        // list에 들어있는 원소 값을 순서대로 출력합니다.
        it = l.listIterator();
        while(it.hasNext()) {               // 'd' 'b' 'c'
            System.out.print(it.next());    // 원소 값을 출력하며 한 칸 뒤로 이동합니다.
        } 
    }
}