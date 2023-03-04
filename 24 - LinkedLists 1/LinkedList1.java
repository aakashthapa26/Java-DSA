
// 1.

// public class LinkedList1 {
//     public static class Node{
//         int data;
//         Node next;

//         public Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node head;
//     public static Node tail;
// public static void main(String args[]){
//    LinkedList1 ll = new LinkedList1();

// }

// }


// 2. addFirst & addLast

// public class LinkedList1 {
//     public static class Node{
//         int data;
//         Node next;

//         public Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node head;
//     public static Node tail;

//     public void addFirst(int data) {    // T.C - O(1) constant (since we are not using any loop or doing recursion)
//         //Step1 = Create new node
//         Node newNode = new Node(data);

//         if(head == null) {
//             head = tail = newNode;
//             return;
//         }

//         //Step2 = newNode next = head;
//         newNode.next = head;    // Linking Step

//         //Step3 = head = newNode
//         head = newNode;
//     }

//     public void addLast(int data){
//         Node newNode = new Node(data);

//         if(head == null){
//             head = tail = newNode;
//             return;
//         }

//         tail.next = newNode;
//         tail = newNode;
//     }

// public static void main(String args[]){
//    LinkedList1 ll = new LinkedList1();
//    ll.addFirst(1);
//    ll.addFirst(2);
//    ll.addLast(3);
//    ll.addLast(4);

// }

// }



// 3. Print a LinkedList
// public class LinkedList1{

// public static class Node{
//     int data;
//     Node next;

//     public Node(int data){
//         this.data = data;
//         this.next = null;
//     }
// }

// public static Node head;
// public static Node tail;

// public void addFirst(int data) {    // T.C - O(1) constant (since we are not using any loop or doing recursion)
//     //Step1 = Create new node
//     Node newNode = new Node(data);

//     if(head == null) {
//         head = tail = newNode;
//         return;
//     }

//     //Step2 = newNode next = head;
//     newNode.next = head;    // Linking Step

//     //Step3 = head = newNode
//     head = newNode;
// }

// public void addLast(int data){
//     Node newNode = new Node(data);

//     if(head == null){
//         head = tail = newNode;
//         return;
//     }

//     tail.next = newNode;
//     tail = newNode;
// }

// public void print() {
//     if(head == null){
//         System.out.println("LL is empty");
//         return;
//     }
//     Node temp = head;
//     while(temp!=null){
//         System.out.print(temp.data+" -> ");
//         temp = temp.next;
//     }
//     System.out.println();
// }

// public static void main(String args[]){
// LinkedList1 ll = new LinkedList1();
// ll.print();
// ll.addFirst(1);
// ll.print();
// ll.addFirst(2);
// ll.print();
// ll.addLast(3);
// ll.print();
// ll.addLast(4);
// ll.print();

// }

// }



// 4. Add in the Middle
// public class LinkedList1{

//     public static class Node{
//         int data;
//         Node next;
    
//         public Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }
    
//     public static Node head;
//     public static Node tail;
    
//     public void addFirst(int data) {    // T.C - O(1) constant (since we are not using any loop or doing recursion)
//         //Step1 = Create new node
//         Node newNode = new Node(data);
    
//         if(head == null) {
//             head = tail = newNode;
//             return;
//         }
    
//         //Step2 = newNode next = head;
//         newNode.next = head;    // Linking Step
    
//         //Step3 = head = newNode
//         head = newNode;
//     }
    
//     public void addLast(int data){
//         Node newNode = new Node(data);
    
//         if(head == null){
//             head = tail = newNode;
//             return;
//         }
    
//         tail.next = newNode;
//         tail = newNode;
//     }
    
//     public void print() {
//         if(head == null){
//             System.out.println("LL is empty");
//             return;
//         }
//         Node temp = head;
//         while(temp!=null){
//             System.out.print(temp.data+" -> ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }

//     public void addinMiddle(int idx, int data) {
//         if(idx == 0) {
//             addFirst(data);
//             return;
//         }
//         Node newNode = new Node(data);
//         Node temp = head;
//         int i = 0;

//         while(i<idx-1){
//             temp = temp.next;
//             i++; 
//         }

//         // As i = idx-1; ---> temp = prev
//         newNode.next = temp.next;
//         temp.next = newNode;
//     }
    
//     public static void main(String args[]){
//     LinkedList1 ll = new LinkedList1();
//     ll.addFirst(1);
//     ll.addFirst(2);
//     ll.addLast(3);
//     ll.addLast(4);
//     ll.addinMiddle(2, 9);

//     ll.print();
    
//     }
    
//     }



// 5. Size of a LL
// public class LinkedList1{

//     public static class Node{
//         int data;
//         Node next;
    
//         public Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }
    
//     public static Node head;
//     public static Node tail;
//     public static int size;
    
//     public void addFirst(int data) {    // T.C - O(1) constant (since we are not using any loop or doing recursion)
//         //Step1 = Create new node
//         Node newNode = new Node(data);
//         size++;
    
//         if(head == null) {
//             head = tail = newNode;
//             return;
//         }
    
//         //Step2 = newNode next = head;
//         newNode.next = head;    // Linking Step
    
//         //Step3 = head = newNode
//         head = newNode;
//     }
    
//     public void addLast(int data){
//         Node newNode = new Node(data);
//         size++;
    
//         if(head == null){
//             head = tail = newNode;
//             return;
//         }
    
//         tail.next = newNode;
//         tail = newNode;
//     }
    
//     public void print() {
//         if(head == null){
//             System.out.println("LL is empty");
//             return;
//         }
//         Node temp = head;
//         while(temp!=null){
//             System.out.print(temp.data+" -> ");
//             temp = temp.next;
//         } 
//         System.out.println("null");
//     }

//     public void addinMiddle(int idx, int data) {
//         if(idx == 0) {
//             addFirst(data);
//             return;
//         }
//         Node newNode = new Node(data);
//         size++;
//         Node temp = head;
//         int i = 0;

//         while(i<idx-1){
//             temp = temp.next;
//             i++; 
//         }

//         // As i = idx-1; ---> temp = prev
//         newNode.next = temp.next;
//         temp.next = newNode;
//     }
    
//     public static void main(String args[]){
//     LinkedList1 ll = new LinkedList1();
//     ll.addFirst(2);
//     ll.addFirst(1);
//     ll.addLast(4);
//     ll.addLast(5);
//     ll.addinMiddle(2, 3);

//     ll.print();   // 1->2->3->4->5
//     System.out.println(ll.size);
    
//     }
    
//     }



// 6. removeFirst & removeLast in LL
// public class LinkedList1{

//     public static class Node{
//         int data;
//         Node next;
    
//         public Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }
    
//     public static Node head;
//     public static Node tail;
//     public static int size;
    
//     public void addFirst(int data) {    // T.C - O(1) constant (since we are not using any loop or doing recursion)
//         //Step1 = Create new node
//         Node newNode = new Node(data);
//         size++;
    
//         if(head == null) {
//             head = tail = newNode;
//             return;
//         }
    
//         //Step2 = newNode next = head;
//         newNode.next = head;    // Linking Step
    
//         //Step3 = head = newNode
//         head = newNode;
//     }
    
//     public void addLast(int data){
//         Node newNode = new Node(data);
//         size++;
    
//         if(head == null){
//             head = tail = newNode;
//             return;
//         }
    
//         tail.next = newNode;
//         tail = newNode;
//     }
    
//     public void print() {
//         if(head == null){
//             System.out.println("LL is empty");
//             return;
//         }
//         Node temp = head;
//         while(temp!=null){
//             System.out.print(temp.data+" -> ");
//             temp = temp.next;
//         } 
//         System.out.println("null");
//     }

//     public void addinMiddle(int idx, int data) {
//         if(idx == 0) {
//             addFirst(data);
//             return;
//         }
//         Node newNode = new Node(data);
//         size++;
//         Node temp = head;
//         int i = 0;

//         while(i<idx-1){
//             temp = temp.next;
//             i++; 
//         }

//         // As i = idx-1; ---> temp = prev
//         newNode.next = temp.next;
//         temp.next = newNode;
//     }

//     public int removeFirst(){
//         if(size == 0){
//             System.out.println("LL is empty");
//             return Integer.MIN_VALUE;
//         }
//         else if(size == 1){
//             int val = head.data;
//             head = tail = null;
//             size = 0;
//             return val;
            
//         }
//         int val = head.data;
//         head = head.next;
//         size--;
//         return val;
//     }
    
//     public int removeLast() {
//         if(size == 0){
//             System.out.println("LL is empty");
//             return Integer.MIN_VALUE;
//         }
//         else if(size == 1){
//             int val = head.data;
//             head = tail = null;
//             size = 0;
//             return val;
//         }

//         // prev : i = size - 2
//         Node prev = head;
//         for(int i=0; i<size-2; i++){
//             prev = prev.next;
//         }

//         int val = prev.next.data;
//         prev.next = null;
//         tail = prev;
//         size--;
//         return val;
//     }
//     public static void main(String args[]){
//     LinkedList1 ll = new LinkedList1();
//     ll.addFirst(2);
//     ll.addFirst(1);
//     ll.addLast(4);
//     ll.addLast(5);
//     ll.addinMiddle(2, 3);

//     ll.print();   // 1->2->3->4->5
//     // System.out.println(ll.size);

//     ll.removeFirst();
//     ll.print();
    
//     ll.removeLast();
//     ll.print();
//     System.out.println(ll.size);
//     }
    
//     }
 



// 7. Search(iterative)
// public class LinkedList1{

//     public static class Node{
//         int data;
//         Node next;
    
//         public Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }
    
//     public static Node head;
//     public static Node tail;
//     public static int size;
    
//     public void addFirst(int data) {    // T.C - O(1) constant (since we are not using any loop or doing recursion)
//         //Step1 = Create new node
//         Node newNode = new Node(data);
//         size++;
    
//         if(head == null) {
//             head = tail = newNode;
//             return;
//         }
    
//         //Step2 = newNode next = head;
//         newNode.next = head;    // Linking Step
    
//         //Step3 = head = newNode
//         head = newNode;
//     }
    
//     public void addLast(int data){
//         Node newNode = new Node(data);
//         size++;
    
//         if(head == null){
//             head = tail = newNode;
//             return;
//         }
    
//         tail.next = newNode;
//         tail = newNode;
//     }
    
//     public void print() {
//         if(head == null){
//             System.out.println("LL is empty");
//             return;
//         }
//         Node temp = head;
//         while(temp!=null){
//             System.out.print(temp.data+" -> ");
//             temp = temp.next;
//         } 
//         System.out.println("null");
//     }

//     public int itrSearch(int key){
//         Node temp = head;
//         int i = 0;
//         while(temp!=null){
//             if(temp.data == key){
//                 return i;
//             }
//             temp = temp.next;
//             i++;
//         }
//         return -1;
//     }
//     public static void main(String args[]){
//     LinkedList1 ll = new LinkedList1();
//     ll.addFirst(3);
//     ll.addFirst(2);
//     ll.addFirst(1);
//     ll.addLast(4);
//     ll.addLast(5);

//     ll.print();   // 1->2->3->4->5

//     System.out.println(ll.itrSearch(3));
//     System.out.println(ll.itrSearch(10));
//     }
     
//     }
 


// 8.  Search(Recursive)
// public class LinkedList1{

//     public static class Node{
//         int data;
//         Node next;
    
//         public Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }
    
//     public static Node head;
//     public static Node tail;
//     public static int size;
    
//     public void addFirst(int data) {    // T.C - O(1) constant (since we are not using any loop or doing recursion)
//         //Step1 = Create new node
//         Node newNode = new Node(data);
//         size++;
    
//         if(head == null) {
//             head = tail = newNode;
//             return;
//         }
    
//         //Step2 = newNode next = head;
//         newNode.next = head;    // Linking Step
    
//         //Step3 = head = newNode
//         head = newNode;
//     }
    
//     public void addLast(int data){
//         Node newNode = new Node(data);
//         size++;
    
//         if(head == null){
//             head = tail = newNode;
//             return;
//         }
    
//         tail.next = newNode;
//         tail = newNode;
//     }
    
//     public void print() {
//         if(head == null){
//             System.out.println("LL is empty");
//             return;
//         }
//         Node temp = head;
//         while(temp!=null){
//             System.out.print(temp.data+" -> ");
//             temp = temp.next;
//         } 
//         System.out.println("null");
//     }

//     public int itrSearch(int key){
//         Node temp = head;
//         int i = 0;
//         while(temp!=null){
//             if(temp.data == key){
//                 return i;
//             }
//             temp = temp.next;
//             i++;
//         }
//         return -1;
//     }
    
//     public int helper(Node head, int key){
//         if(head == null){
//             return -1;
//         }

//         if(head.data == key){
//             return 0;
//         }
//         int idx = helper(head.next, key);
//         if(idx == -1) {
//             return -1;
//         }

//         return idx +1;
//     }
//     public int recSearch(int key) {
//         return helper(head, key);
//     }
//     public static void main(String args[]){
//     LinkedList1 ll = new LinkedList1();
//     ll.addFirst(3);
//     ll.addFirst(2);
//     ll.addFirst(1);
//     ll.addLast(4);
//     ll.addLast(5);

//     ll.print();   // 1->2->3->4->5

//     System.out.println(ll.recSearch(3));
//     System.out.println(ll.recSearch(10));
//     }
    
// }


// 9. Reverse a LL(iterave Approach)
// public class LinkedList1{

//     public static class Node{
//         int data;
//         Node next;
    
//         public Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }
    
//     public static Node head;
//     public static Node tail;
//     public static int size;
    
//     public void addFirst(int data) {    // T.C - O(1) constant (since we are not using any loop or doing recursion)
//         //Step1 = Create new node
//         Node newNode = new Node(data);
//         size++;
    
//         if(head == null) {
//             head = tail = newNode;
//             return;
//         }
    
//         //Step2 = newNode next = head;
//         newNode.next = head;    // Linking Step
    
//         //Step3 = head = newNode
//         head = newNode;
//     }
    
//     public void addLast(int data){
//         Node newNode = new Node(data);
//         size++;
    
//         if(head == null){
//             head = tail = newNode;
//             return;
//         }
    
//         tail.next = newNode;
//         tail = newNode;
//     }
    
//     public void print() {
//         if(head == null){
//             System.out.println("LL is empty");
//             return;
//         }
//         Node temp = head;
//         while(temp!=null){ 
//             System.out.print(temp.data+" -> ");
//             temp = temp.next;
//         } 
//         System.out.println("null");
//     }

//     public int itrSearch(int key){
//         Node temp = head;
//         int i = 0;
//         while(temp!=null){
//             if(temp.data == key){
//                 return i;
//             }
//             temp = temp.next;
//             i++;
//         }
//         return -1;
//     }
    
//     public int helper(Node head, int key){
//         if(head == null){
//             return -1;
//         }

//         if(head.data == key){
//             return 0;
//         }
//         int idx = helper(head.next, key);
//         if(idx == -1) {
//             return -1;
//         }

//         return idx +1;
//     }
//     public int recSearch(int key) {
//         return helper(head, key);
//     }

//     public void reverse(){
//         Node prev = null;
//         Node curr = tail = head;
//         Node next;

//         while(curr != null) {
//             next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = next;
//         }
//         head = prev;
//     }
//     public static void main(String args[]){
//     LinkedList1 ll = new LinkedList1();
//     ll.addFirst(3);
//     ll.addFirst(2);
//     ll.addFirst(1);
//     ll.addLast(4);
//     ll.addLast(5);

//     ll.print();   // 1->2->3->4->5

//     ll.reverse();
//     ll.print();
//     }
 


// 10. Find and Remove Nth Node from End
// public class LinkedList1{

//     public static class Node{
//         int data;
//         Node next;
    
//         public Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }
    
//     public static Node head;
//     public static Node tail;
//     public static int size;
    
//     public void addFirst(int data) {    // T.C - O(1) constant (since we are not using any loop or doing recursion)
//         //Step1 = Create new node
//         Node newNode = new Node(data);
//         size++;
    
//         if(head == null) {
//             head = tail = newNode;
//             return;
//         }
    
//         //Step2 = newNode next = head;
//         newNode.next = head;    // Linking Step
    
//         //Step3 = head = newNode
//         head = newNode;
//     }
    
//     public void addLast(int data){
//         Node newNode = new Node(data);
//         size++;
    
//         if(head == null){
//             head = tail = newNode;
//             return;
//         }
    
//         tail.next = newNode;
//         tail = newNode;
//     }
    
//     public void print() {
//         if(head == null){
//             System.out.println("LL is empty");
//             return;
//         }
//         Node temp = head;
//         while(temp!=null){ 
//             System.out.print(temp.data+" -> ");
//             temp = temp.next;
//         } 
//         System.out.println("null");
//     }

//     public int itrSearch(int key){
//         Node temp = head;
//         int i = 0;
//         while(temp!=null){
//             if(temp.data == key){
//                 return i;
//             }
//             temp = temp.next;
//             i++;
//         }
//         return -1;
//     }
    
//     public int helper(Node head, int key){
//         if(head == null){
//             return -1;
//         }

//         if(head.data == key){
//             return 0;
//         }
//         int idx = helper(head.next, key);
//         if(idx == -1) {
//             return -1;
//         }

//         return idx +1;
//     }
//     public int recSearch(int key) {
//         return helper(head, key);
//     }

//     public void reverse(){
//         Node prev = null;
//         Node curr = tail = head;
//         Node next;

//         while(curr != null) {
//             next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = next;
//         }
//         head = prev;
//     }

//     public void deleteNthfromEnd(int n){
//         // calculate Size
//         int sz = 0;
//         Node temp = head;
//         while(temp != null) {
//             temp = temp.next;
//             sz++;
//         }

//         if(n == sz){
//             head = head.next;   // removeFirst
//             return;
//         }

//         // sz-n
//         int i=1;
//         int iToFind = sz-n;
//         Node prev = head;
//         while(i < iToFind) {
//             prev = prev.next;
//             i++;
//         }
//         prev.next = prev.next.next;
//     }
//     public static void main(String args[]){
//     LinkedList1 ll = new LinkedList1();
//     ll.addFirst(3);
//     ll.addFirst(2);
//     ll.addFirst(1);
//     ll.addLast(4);
//     ll.addLast(5);

//     ll.print();   // 1->2->3->4->5
//     ll.deleteNthfromEnd(3);
//     ll.print();
//     }
// }




// 11. Check Palindrome
public class LinkedList1{

    public static class Node{
        int data;
        Node next;
    
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public static Node head;
    public static Node tail;
    public static int size;
    
    public void addFirst(int data) {    // T.C - O(1) constant (since we are not using any loop or doing recursion)
        //Step1 = Create new node
        Node newNode = new Node(data);
        size++;
    
        if(head == null) {
            head = tail = newNode;
            return;
        }
    
        //Step2 = newNode next = head;
        newNode.next = head;    // Linking Step
    
        //Step3 = head = newNode
        head = newNode;
    }
    
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
    
        if(head == null){
            head = tail = newNode;
            return;
        }
    
        tail.next = newNode;
        tail = newNode;
    }
    
    public void print() {
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp!=null){ 
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        } 
        System.out.println("null");
    }

    public int itrSearch(int key){
        Node temp = head;
        int i = 0;
        while(temp!=null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    
    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1) {
            return -1;
        }

        return idx +1;
    }
    public int recSearch(int key) {
        return helper(head, key);
    }

    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deleteNthfromEnd(int n){
        // calculate Size
        int sz = 0;
        Node temp = head;
        while(temp != null) {
            temp = temp.next;
            sz++;
        }

        if(n == sz){
            head = head.next;   // removeFirst
            return;
        }

        // sz-n
        int i=1;
        int iToFind = sz-n;
        Node prev = head;
        while(i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
    }

    // Slow-Fast Approach
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast != null) {
            slow = slow.next;  //+1
            fast = fast.next.next;  //+2
        }
        return slow;  //slow is my midNode
    }  
    
    public boolean checkPalindrome() {
        if(head == null || head.next == null) {
            return true;
        }

        //step1 - find mid
        Node midNode = findMid(head);

        //step2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while(curr != null) {
            next  = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev // right half head
        Node left = head;

        //step3 - check left half & right half
        while(right != null) {
            if(left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String args[]){
    LinkedList1 ll = new LinkedList1();
    ll.addFirst(3);
    ll.addFirst(2);
    ll.addFirst(1);
    ll.addLast(4);
    ll.addLast(5);

    ll.print();   // 1->2->3->4->5
    ll.deleteNthfromEnd(3);
    ll.print();
    }
}


