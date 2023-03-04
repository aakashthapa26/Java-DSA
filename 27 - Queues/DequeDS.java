import java.util.*;

public class DequeDS{
    public static void main(String args[]){
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        System.out.println(deque);
        deque.removeFirst();
        System.out.println(deque);
        deque.addFirst(2);
        deque.addLast(3);
        System.out.println(deque);

        System.out.println("first el = "+deque.getFirst());
        System.out.println("last el = "+deque.getLast());
    }
}
   