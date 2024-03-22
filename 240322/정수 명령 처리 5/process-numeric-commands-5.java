import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList <Integer> v = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void push_back(){
        int data = sc.nextInt();
        v.add(data);
    }
    public static void pop_back(){
        v.remove(v.size()-1);
    }
    public static void size(){
        System.out.println(v.size());
    }
    public static void get(){
        int data = sc.nextInt();
        System.out.println(v.get(data - 1));
    }
    public static void main(String[] args) {
        
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            String a = sc.next();
            if(a.equals("push_back")){
                push_back();
            }
            if(a.equals("pop_back"))
                pop_back();
            if(a.equals("size"))
                size();
            if(a.equals("get"))
                get();
        }
        
    }
}

/* ArrayList를 이용할 때 자주 사용되는 것은 다음 4가지 입니다.

add(E)
맨 뒤에 데이터 E를 추가합니다.

remove(index)
index 위치에 있는 원소를 삭제합니다. 첫 번째 원소의 경우 remove(0), 맨 뒤에 있던 데이터를 삭제하기 위해서는 remove(name.size() - 1) 이 필요합니다.

size()
현재 ArrayList에 들어있는 데이터의 수를 반환합니다.

get(index)
index 위치에 있는 원소를 조회합니다.

따라서 다음과 같이 코드를 작성해볼 수 있습니다.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> v = new ArrayList<>();   // 정수를 관리할 ArrayList를 선언하고
        v.add(5);                                   // v : [5]
        System.out.println(v.size());               // 들어있는 데이터의 수 : 1개
        System.out.println(v.get(0));               // 0번지에 들어 있는 값 : 5

        v.add(2);                                   // v : [5, 2]
        v.add(9);                                   // v : [5, 2, 9]

        System.out.println(v.get(1));               // 1번지에 들어 있는 값 : 2
        System.out.println(v.get(2));               // 2번지에 들어 있는 값 : 9
        System.out.println(v.get(3));               // 3번지에 들어 있는 값 : 존재하지 않으므로 Error 발생
    
        // 현재 ArrayList 내에 있는 모든 데이터를 순회하기 위해서는
        // 데이터의 개수인 v.size()를 활용하여
        // 포문을 통해 순회가 가능합니다. 
        
        for(int i = 0; i < v.size(); i++)
            System.out.println(v.get(i));           // 출력 결과 : 순서대로 5 2 9

        v.remove(v.size() - 1);                     // 맨 뒤에 있는 원소를 제거합니다.

        System.out.println(v.size());               // 들어있는 데이터의 수 : 2개

        for(int i = 0; i < v.size(); i++)
            System.out.println(v.get(i));           // 출력 결과 : 순서대로 5 2
    }
}*/