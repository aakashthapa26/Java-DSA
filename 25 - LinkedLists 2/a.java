// 
// public class a {
//     public static class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }
//     public static Node head; 
//     public static Node tail;
 
//     public static boolean isCycle() {  //
//         Node slow = head;
//         Node fast = head;
//         while(fast != null && fast.next != null) {
//             // slow = slow.next;  //+1
//             fast = fast.next.next;   //+2
//             if(slow == fast){
//                 return true;   // Cycle exists
//             }
//         }
//         return false;  // Cycle doesn't exist
//     }
//     public static void main(String args[]){
//         a ll = new a();
//         head = new Node(1);
//         head.next = new Node(2);
//         head.next.next = new Node(3);
//         head.next.next.next = head;
//         // 1->2->3->1  (Cycle Exists)

//         System.out.println(isCycle()); 
//     }
// }



// Remove a loop in a LL
public class a {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head; 
    public static Node tail;
 
    public static boolean isCycle() {  //
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            // slow = slow.next;  //+1
            fast = fast.next.next;   //+2
            if(slow == fast){
                return true;   // Cycle exists
            }
        }
        return false;  // Cycle doesn't exist
    }

    public static void removeCycle() {
        // detect Cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) {
                cycle = true;
                break;
            }
        }
        if(cycle == false){
            return;
        }

        // find meeting point
        slow = head;
        Node prev = null; 
        while(slow != fast){    
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // remove Cycle -> last.next = null
        prev.next = null;

    }
    public static void main(String args[]){
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        // 1->2->3->2  (Cycle Exists)

        System.out.println(isCycle()); 
        removeCycle();
        System.out.println(isCycle());          
    }   
}
  
           