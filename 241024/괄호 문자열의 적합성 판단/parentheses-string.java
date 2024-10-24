import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < str.length(); i++){
          char ch = str.charAt(i);

          if(ch == '('){
            stack.push(ch);
          }
          else{
            if(stack.isEmpty()){
              System.out.println("No");
              return;
            }
            stack.pop();
          }
        }
        if(!stack.isEmpty()){
          System.out.println("No");
          return;
        }
        System.out.println("Yes");
        return;

    }
}


// function solution(str)
//   set s = empty stack
//   for i = 0 ... i < str.size  // Traverse the given string.
//     if str[i] == '('          // For an opening bracket,
//       s.push('(')             // push the opening bracket into the stack.
//     else
//       if s.empty() == true    // If a closing bracket appears and the stack is empty,
//         return false          // it's not a valid parenthesis string.
//       s.pop()                 // Remove the top value.

//   if s.empty() == false       // If the stack isn't empty even after a full traverse,
//     return false              // it's not a valid parenthesis string.
//   return true                 // If all conditions are passed, it's a valid parenthesis string.