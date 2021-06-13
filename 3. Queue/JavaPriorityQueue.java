import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class JavaPriorityQueue {
    public static void main(String[] args) {
        // use java.util.PriorityQueue
        // used to set the priority to the queue element.
        
        // for MIN HEAP :: 
        Queue<Integer> que = new PriorityQueue<>();
        /*
        // for MAX HEEP 
        Queue<Integer> que = new PriorityQueue<>(Comparator.reverseOrder());
        */
        /*
        
         default it uses the MIN HEAP data struture
         MIN HEAP ::- smallest element will be at the 1st index and others remains unchaged
         MAX HEAP ::- greatest element will be at the 1st index and others remains unchaged
        
         */
        // 1. offer(element) ::- used to insert element
        que.offer(8);
        que.offer(7);
        que.offer(1);
        que.offer(87);
        que.offer(17);
        que.offer(8717);
        System.out.println("The Queue is in the MIN HEAP form ::- " +que);

        // 2. poll() ::- used to remove the top element of the HEAP
        // 3. peek() ::- used to see the 1st element
        
        System.out.println("1st element ::- "+que.peek());
        System.out.println("removed element ::- "+  que.poll());
        System.out.println("new 1st element ::- "+ que.peek());
    }
}
