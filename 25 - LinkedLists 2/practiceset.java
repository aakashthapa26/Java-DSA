// public class practiceset {
//     static class Node{
//         int data;
//         Node next;
//         Node(int d){
//             data = d;
//             next = null;
//         }
//     }

//     public Node getIntersectionNode(Node head1, Node head2) {
//         while(head2 != null){
//             Node temp = head1;
//             while(temp != null){
//                 if(temp == head2){
//                     return head2;
//                 }
//                 temp = temp.next;
//             }
//             head2 = head2.next;
//         }
//         return null;
//     }
//     public static void main(String args[]){
//         practiceset list = new practiceset();

//         Node head1, head2;
//         head1 = new Node(4);
//         head2 = new Node(1);

//         Node newNode = new Node(2);
//         head2.next = newNode;

//         newNode = new Node(3);
//         head2.next.next = newNode;

//         newNode = new Node(5);
//         head1.next = newNode;

//         newNode = new Node(6);
//         head1.next.next = newNode;
//         head2.next.next.next = newNode;

//         newNode = new Node(7);
//         head1.next.next.next = newNode;
//         head2.next.next.next.next = newNode;

//         head1.next.next.next.next = null;
//         head2.next.next.next.next.next = null;


//         Node intersectionPoint = list.getIntersectionNode(head1, head2);

//         if(intersectionPoint == null){
//             System.out.print("No intersection Point\n");
//         }
//         else{
//             System.out.print("Intersection Point:"+intersectionPoint.data);
//         }

//     }
// }



// 2. Delete N Nodes After M Nodes of a Linked List

// public class practiceset {
//     public class Node {
//         int data;
//         Node next;

//         public Node(int data) { // Constructor
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node head;
//     public static Node tail;

//     // Methods

//     public void addFirst(int data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = tail = newNode;
//             return;
//         }
//         newNode.next = head;
//         head = newNode;
//     }

//     public void print() { // T.C - O(n)
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

//     public void linkdelete(Node head, int M, int N){
//         int count = 0;
//         Node temp = head;
//         while(temp != null && temp.next != null){
//             count++;
//             if(count == M){
//                 temp.next = temp.next.next.next;
//                 count = 0;
//             }
//             temp = temp.next;
//         }
//     }
//     public static void main(String args[]) {
//         practiceset ll = new practiceset();
//         ll.addFirst(9 );
//         ll.addFirst(8);
//         ll.addFirst(7);
//         ll.addFirst(6);
//         ll.addFirst(5);
//         ll.addFirst(4);
//         ll.addFirst(3);
//         ll.addFirst(2);
//         ll.addFirst(1);
    
//         ll.print();
//         ll.linkdelete(head, 2, 2);
//         ll.print();
// }
// }
   


// 3. Swapping Nodes in a LL
public class practiceset {
    public class Node {
        int data;
        Node next;

        public Node(int data) { // Constructor
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // Methods

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void print() { // T.C - O(n)
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void swap(Node head, int x, int y){
        if(x == y){ 
            return;
        }

        Node prev = null;
        Node curr = head;
        while(curr != null && curr.data != x){
            prev = curr;
            curr = curr.next;
        }
        
    }
    public static void main(String args[]) {
        practiceset ll = new practiceset();
        ll.addFirst(9 );
        ll.addFirst(8);
        ll.addFirst(7);
        ll.addFirst(6);
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
    
        ll.print();
        ll.linkdelete(head, 2, 2);
        ll.print();
}
}
   

