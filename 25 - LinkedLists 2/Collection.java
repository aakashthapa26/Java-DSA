import java.util.LinkedList;  // JCf -> Optimized
public class Collection {
    public static void main(String args[]){
    // Create
        LinkedList<Integer> ll = new LinkedList<>();
        
    // add
    ll.addLast(1);
    ll.addLast(2);
    ll.addFirst(0);
    // 0->1->2
    System.out.println(ll);
    // remove
    ll.removeLast();
    ll.removeFirst();
    System.out.println(ll);
    
    }
}        