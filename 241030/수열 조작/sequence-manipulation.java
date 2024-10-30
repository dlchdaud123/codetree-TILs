import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            dq.addLast(i);
        }

        while(dq.size() != 1){
            dq.pollFirst();
            dq.addLast(dq.peekFirst());
            dq.pollFirst();
        }
        System.out.println(dq.peekLast());
    }
}

// deque를 이용할 때 자주 사용되는 것은 다음 8가지 입니다.

// addFirst(E)
// 맨 앞에 데이터 E를 추가합니다.

// addLast(E)
// 맨 뒤에 데이터 E를 추가합니다.

// pollFirst()
// 맨 앞에 있는 데이터를 반환합니다. 동시에 그 데이터를 deque에서 뺍니다.

// pollLast()
// 맨 뒤에 있는 데이터를 반환합니다. 동시에 그 데이터를 deque에서 뺍니다.

// size()
// 현재 deque에 들어있는 데이터의 수를 반환합니다.

// isEmpty()
// 현재 deque가 비어있다면 true, 아니라면 false를 반환합니다.

// peekFirst()
// deque의 맨 앞에 있는 데이터를 반환합니다.

// peekLast()
// deque의 맨 뒤에 있는 데이터를 반환합니다.

// 따라서 다음과 같이 코드를 작성해볼 수 있습니다.