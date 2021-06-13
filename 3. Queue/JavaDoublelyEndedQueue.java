import java.util.ArrayDeque;

public class JavaDoublelyEndedQueue {
    public static void main(String[] args) {
        // use java.util.ArrayDeque for doubly enede queue
        // this also implentes the Queue Interface so all the function of the Queue will be accesseable here too.
        // lets get started with 8717 :-)
        ArrayDeque<Integer> adq= new ArrayDeque<>();
        
        // 1. offer(element) ::- to add the new element at the last.
        // 2. offerLast(element) ::- to add the new element at the last too.

        adq.offer(8);
        adq.offerLast(7);
        adq.offer(1);
        adq.offerLast(7);
        System.out.println(adq);
        
        // 3. offerFirst(element) ::- to add the new element at the first index
        adq.offerFirst(8717);
        System.out.println(adq);
        
        // 4. peek()::- show the first element of the queue
        // 5. peekFirst() ::- show the first element of the queue
        // 6. peekLast() ::-show the last element of the queue

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        // 7. poll() ::- delete the first element 
        // 8. pollFirst() ::- delete the first element
        // 9.pollLast() ::- delete the last element
        
        
        System.out.println("deleting the element form the first "+adq.poll());
        System.out.println("deleting the element form the first "+adq.pollFirst());
        System.out.println("deleting the element form the last "+adq.pollLast());

        System.out.println("New Queue is ::- " + adq);
        
        //  NOTE ::- We can impliment the Stack using Double Ended Queue just we have to remove the element form the last and add new element at the last.
         
    }    
}
