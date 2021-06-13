import java.util.LinkedList;
import java.util.Queue;

public class JavaQueue {
    public static void main(String[] args) {
        // use java.util.Queue
        // here we can not intensiate the queue object because Queue is a interface and we can intensiatae the stack because it is a class of the java.util package ;)
        Queue<String> que = new LinkedList<>();
        
        // 1. offer(element) ::- used to enter an element in the queue 
        //    add() :: offers the value to the queue but if it is full then add() will throw the exepection (not in use much use)
        que.offer("Billliiii");
        que.offer("white");
        que.offer("lily");
        que.offer("khagros");
        que.offer("sbh 8717");
        System.out.println(que);

        // 2. poll() ::- to remove the 1st element
        //    remove() ::- :: removes the value to the queue but if it is already empty then remove() will throw the exepection (not in use much use)
        que.poll();
        System.out.println("new queue ::- " + que);
        System.out.println("new removed element ::- " + que.poll());
        
        //3. peek() ::- next element to be polled
        //   element() ::- :: returns the 1st element of the queue but if it is empty then element() will throw the exepection (not in use much use)
        System.out.println("queue's current first elemet ::- " +que.peek());

    }
}
