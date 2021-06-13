import java.util.Stack;

public class JavaStack {
    public static void main(String[] args) {
        // use java.util.Stack;

        Stack<String> friends = new Stack<>();

        // 1. push(element) ::- to insert the element on the top of a stack
        friends.push("billiii");
        friends.push("white");
        friends.push("lily");
        friends.push("sbh");
        friends.push("8717");

        System.out.println("Complete stack ::- " +friends);

        // 2. peek() ::- to get the value of the top element of the stack
        System.out.println("top element ::- "+friends.peek());

        // 3. pop() ::- to delete the top element form the stack
        
        /* 
         friends.pop();
         System.out.println("new top elemente ::- " + friends.peek());
         */
        System.out.println("element is deleted and printed too ::- "+friends.pop());

    }
}
