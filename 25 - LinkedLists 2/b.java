// // Detect a Cycle in LL

// public class b {   
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
 
//     public static boolean Cycle() {
//         Node slow = head;
//         Node fast = head;
//         while(fast!= null && fast.next != null){
//             slow = slow.next;
//             fast = fast.next.next;
//             if(fast==slow){
//                 return true;
//             }
//         }
//         return false;
//     }

//     public static void main(String args[]){
//         head = new Node(1);
//         head.next = new Node(2);
//         head.next.next = new Node(3);
//         // head.next.next.next = head;

//         System.out.println(Cycle());
//     }
// }
   



// Remove a Cycle in LL

// public class b {   
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
 
//     public static boolean Cycle() {
//         Node slow = head;
//         Node fast = head;
//         while(fast!= null && fast.next != null){
//             slow = slow.next;
//             fast = fast.next.next;
//             if(fast==slow){
//                 return true;
//             }
//         }
//         return false;
//     }

//     public static void removeCycle() {
//         // detect Cycle
//         Node slow = head;
//         Node fast = head;
//         boolean cycle = false;

//         while(fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//             if(fast == slow){
//                 cycle = true;
//                 break;
//             }
//         }
//         if(cycle == false){
//             return;
//         }
        
//         //find meeting point
//         slow = head;
//         Node prev = null;
//         while(slow != fast){
//             prev = fast;
//             slow = slow.next;
//             fast = fast.next;
//         }

//         // remove cycle -> last.next = null
//         prev.next = null;
//     }
//     public static void main(String args[]){
//         head = new Node(1);
//         Node temp = new Node(2);
//         head.next = temp;
//         head.next.next = new Node(3);
//         head.next.next.next = temp;
//         //1->2->3->2

//         System.out.println(Cycle());
//         removeCycle();
//         System.out.println(Cycle());

//     }
// }
   


// Java Collections FrameWork  (Optimized Way)

// import java.util.LinkedList;
// public class b {
// public static void main(String args[]){
//    //create - objects (Integer Class, Float Class, etc.)     
//    LinkedList<Integer> ll = new LinkedList<>();

//    //add
//    ll.addLast(1);
//    ll.addLast(2); 
//    ll.addFirst(0);
   
//    //0->1->2

//    //print LL
//    System.out.println(ll);

//    //remove
//    ll.removeLast();
//    ll.removeFirst();

//    System.out.println(ll);

// }

// }



// mergerSort 

// public class b {   
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
 
//     public void addFirst(int data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = tail = newNode;
//             return;
//         }
//         newNode.next = head;
//         head = newNode;
//     }

//     public void print() {
//         if (head == null) {
//             System.out.println("LL is empty");
//             return;
//         }
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + "->");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }

//     public static boolean Cycle() {
//         Node slow = head;
//         Node fast = head;
//         while(fast!= null && fast.next != null){
//             slow = slow.next;
//             fast = fast.next.next;
//             if(fast==slow){
//                 return true;
//             }
//         }
//         return false;
//     }

//     public static void removeCycle() {
//         // detect Cycle
//         Node slow = head;
//         Node fast = head;
//         boolean cycle = false;

//         while(fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//             if(fast == slow){
//                 cycle = true;
//                 break;
//             }
//         }
//         if(cycle == false){
//             return;
//         }
        
//         //find meeting point
//         slow = head;
//         Node prev = null;
//         while(slow != fast){
//             prev = fast;
//             slow = slow.next;
//             fast = fast.next;
//         }

//         // remove cycle -> last.next = null
//         prev.next = null;
//     }

//     public Node getMid(Node head) {
//         Node slow = head;
//         Node fast = head.next;
//         while(fast != null && fast.next!= null){
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         return slow;  //mid Node
//     }
    
//     private Node merge(Node head1, Node head2){
//         Node mergedLL = new Node(-1);
//         Node temp = mergedLL;

//         while(head1 != null && head2 != null) {
//             if(head1.data <= head2.data) {
//                 temp.next = head1;
//                 head1 = head1.next;
//                 temp = temp.next;
//             }
//             else{
//                 temp.next = head2;
//                 head2 = head2.next;
//                 temp = temp.next;
//             }
//         }

//         while(head1 != null){
//             temp.next = head1;
//             head1 = head1.next;
//             temp = temp.next;
//         }

//         while(head2 != null){
//             temp.next = head2;
//             head2 = head2.next;
//             temp = temp.next;
//         }
        
//         return mergedLL.next;
//     }

//     public Node mergeSort(Node head) {
//         if(head == null || head.next == null){
//             return head;
//         }
//         //find mid
//         Node mid = getMid(head);
//         // left & right MS
//         Node rightHead = mid.next;
//         mid.next = null;
//         Node newLeft = mergeSort(head);
//         Node newRight = mergeSort(rightHead);
    
//         // merge
//         return merge(newLeft, newRight);
//     }
    
//     public static void main(String args[]){
//         b ll = new b();
//         ll.addFirst(1);
//         ll.addFirst(2);
//         ll.addFirst(3);
//         ll.addFirst(4);
//         ll.addFirst(5);

//         // 5->4->3->2->1

//         ll.print();
//         ll.head = ll.mergeSort(head);
//         ll.print();
//     }
// }



// Zig-Zag LL

// public class b {   
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
 
//     public void addFirst(int data) {     
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = tail = newNode;
//             return;
//         }
//         newNode.next = head;
//         head = newNode;
//     }

//     public void addLast(int data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = tail = newNode;
//             return;
//         }

//         tail.next = newNode;

//         tail = newNode;
//     }

//     public void print() {
//         if (head == null) {
//             System.out.println("LL is empty");
//             return;
//         }
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + "->");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }

//     public static boolean Cycle() {
//         Node slow = head;
//         Node fast = head;
//         while(fast!= null && fast.next != null){
//             slow = slow.next;
//             fast = fast.next.next;
//             if(fast==slow){
//                 return true;
//             }
//         }
//         return false;
//     }

//     public static void removeCycle() {
//         // detect Cycle
//         Node slow = head;
//         Node fast = head;
//         boolean cycle = false;

//         while(fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//             if(fast == slow){
//                 cycle = true;
//                 break;
//             }
//         }
//         if(cycle == false){
//             return;
//         }
        
//         //find meeting point
//         slow = head;
//         Node prev = null;
//         while(slow != fast){
//             prev = fast;
//             slow = slow.next;
//             fast = fast.next;
//         }

//         // remove cycle -> last.next = null
//         prev.next = null;
//     }

//     public Node getMid(Node head) {
//         Node slow = head;
//         Node fast = head.next;
//         while(fast != null && fast.next!= null){
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         return slow;  //mid Node
//     }
    
//     private Node merge(Node head1, Node head2){
//         Node mergedLL = new Node(-1);
//         Node temp = mergedLL;

//         while(head1 != null && head2 != null) {
//             if(head1.data <= head2.data) {
//                 temp.next = head1;
//                 head1 = head1.next;
//                 temp = temp.next;
//             }
//             else{
//                 temp.next = head2;
//                 head2 = head2.next;
//                 temp = temp.next;
//             }
//         }

//         while(head1 != null){
//             temp.next = head1;
//             head1 = head1.next;
//             temp = temp.next;
//         }

//         while(head2 != null){
//             temp.next = head2;
//             head2 = head2.next;
//             temp = temp.next;
//         }
        
//         return mergedLL.next;
//     }

//     public Node mergeSort(Node head) {
//         if(head == null || head.next == null){
//             return head;
//         }
//         //find mid
//         Node mid = getMid(head);
//         // left & right MS
//         Node rightHead = mid.next;
//         mid.next = null;
//         Node newLeft = mergeSort(head);
//         Node newRight = mergeSort(rightHead);
    
//         // merge
//         return merge(newLeft, newRight);
//     }

//     public void zigZag() {
//         // find mid Node
//         Node slow = head;
//         Node fast = head.next;
//         while(fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         Node mid = slow;

//         // reverse 2nd half
//         Node curr = mid.next;
//         mid.next = null;
//         Node prev = null;
//         Node next;

//         while(curr != null){
//             next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = next;
//         }

//         Node left = head;
//         Node right = prev;
//         Node nextL, nextR;

//         // alternate Merge - zigzag Merge
//         while(left != null && right != null){
//             nextL = left.next;
//             left.next = right;
//             nextR = right.next;
//             right.next = nextL;

//             left = nextL;
//             right = nextR;
//         }
//     }
    
//     public static void main(String args[]){
//         b ll = new b();
//         ll.addLast(1);
//         ll.addLast(2);
//         ll.addLast(3);
//         ll.addLast(4);
//         ll.addLast(5);
//         ll.addLast(6);

//         // 1->2->3->4->5

//         ll.print();
//         ll.zigZag();
//         ll.print();
//     }
// }
   
 
    
// Creating DoublyLL

// public class b {
//     public class Node{
//         int data;
//         Node next;
//         Node prev;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//             this.prev = null;
//         }
//     }

//     public static Node head;
//     public static Node tail;
//     public static int size;

//     // add
//     //1. addFirst
//          public void addFirst(int data){
//             Node newNode = new Node(data);
//             size++;
//             if(head == null){
//                 head = tail = newNode;
//                 return;
//             }

//             newNode.next = head;
//             head.prev = newNode;
//             head = newNode;
//          }

//     //2. addLast    
//          public void addLast(int data){
//             Node newNode = new Node(data);
//             size++;
//             if(head == null){
//                 head = tail = newNode;
//                 return;
//             }

//             tail.next = newNode;
//             newNode.prev = tail;
//             tail = newNode;
//          }


//     // remove
//     //1. removeFirst
//          public int removeFirst(){
//             if(head == null){
//                 System.out.println("DLL is empty");
//                 return Integer.MIN_VALUE;
//             }

//             if(size == 1){
//                 int val = head.data;
//                 head = tail = null;
//                 size = 0;
//                 return val;
//             }
//             int val = head.data;
//             head = head.next;
//             head.prev = null;
//             size--;
//             return val;
//          }

//     //2. removeLast
//        public int removeLast(){
//         if(head == null){
//             System.out.println("DLL is empty");
//             return Integer.MIN_VALUE;
//         }

//         if(size == 1){
//             int val = head.data;
//             head = tail = null;
//             size=0;
//             return val;
//         }

//         int val = tail.data;
//         tail = tail.prev;
//         tail.next = null;
//         size--;
//         return val;
        
//        }

//     // printLL
//        public void print() {
//         if(head == null){
//             System.out.println("DLL is empty");
//             return;
//         }
//         Node temp = head;
//         while(temp != null){
//             System.out.print(temp.data+"<->");
//             temp = temp.next;
//         }
//         System.out.println("null");
//        }
// public static void main(String args[]){
//     b dll = new b();
//     dll.print();
//     dll.addFirst(3);
//     dll.addFirst(2);
//     dll.print();
//     dll.removeFirst();
//     dll.print();
//     dll.addLast(5);    
//     dll.addLast(6);    
//     dll.print();
//     dll.removeLast();
//     dll.print();
//     System.out.println(dll.size);
// }

// }


// Reverse a DLL
// public class b {
//     public class Node{
//         int data;
//         Node next; 
//         Node prev;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//             this.prev = null;
//         }
//     }

//     public static Node head;
//     public static Node tail;
//     public static int size;

//     // add
//     //1. addFirst
//          public void addFirst(int data){
//             Node newNode = new Node(data);
//             size++;
//             if(head == null){
//                 head = tail = newNode;
//                 return;
//             }

//             newNode.next = head;
//             head.prev = newNode;
//             head = newNode;
//          }

//     //2. addLast    
//          public void addLast(int data){
//             Node newNode = new Node(data);
//             size++;
//             if(head == null){
//                 head = tail = newNode;
//                 return;
//             }

//             tail.next = newNode;
//             newNode.prev = tail;
//             tail = newNode;
//          }


//     // remove
//     //1. removeFirst
//          public int removeFirst(){
//             if(head == null){
//                 System.out.println("DLL is empty");
//                 return Integer.MIN_VALUE;
//             }

//             if(size == 1){
//                 int val = head.data;
//                 head = tail = null;
//                 size = 0;
//                 return val;
//             }
//             int val = head.data;
//             head = head.next;
//             head.prev = null;
//             size--;
//             return val;
//          }

//     //2. removeLast
//        public int removeLast(){
//         if(head == null){
//             System.out.println("DLL is empty");
//             return Integer.MIN_VALUE;
//         }

//         if(size == 1){
//             int val = head.data;
//             head = tail = null;
//             size=0;
//             return val;
//         }

//         int val = tail.data;
//         tail = tail.prev;
//         tail.next = null;
//         size--;
//         return val;
        
//        }

//     // printLL
//        public void print() {
//         if(head == null){
//             System.out.println("DLL is empty");
//             return;
//         }
//         Node temp = head;
//         while(temp != null){
//             System.out.print(temp.data+"<->");
//             temp = temp.next;
//         }
//         System.out.println("null");
//        }
//        public void reverseDLL(){
//         Node curr = head;
//         Node prev = null;
//         Node next;
//         while(curr != null){
//             next = curr.next;
//             curr.next = prev;
//             curr.prev = next;
//             prev = curr;
//             curr = next;
//         }
//         head = prev;
//        }
// public static void main(String args[]){
//     b dll = new b();
//     dll.addFirst(3);
//     dll.addFirst(2);
//     dll.addFirst(1);
//     dll.print();
//     dll.reverseDLL();
//     dll.print();
// }


// }