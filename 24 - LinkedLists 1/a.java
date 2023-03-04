
// public class a {
//     public class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//            this.data = data;
//            this.next = null; 
//         }
//     }

//     public static Node head;
//     public static Node tail;
//     public static int size;

//     public void addFirst(int data) {
//         Node newNode = new Node(data);
//         size++;
//         if(head == null) {
//             head = tail = newNode;
//             return;
//         }

//         newNode.next = head;
//         head = newNode;
//     }

//     public void print(){
//         Node temp = head;
//         while(temp != null){
//             System.out.print(temp.data + "->");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }
//     public void addLast(int data) {
//         Node newNode = new Node(data);
//         if(head == null){
//             head = tail = newNode;
//             return;
//         }
//         tail.next = newNode;
//         tail = newNode;   
//     }

//     public int removeFirst() {
//         if(size == 0) {
//             System.out.println("SLL is empty");
//             return Integer.MIN_VALUE;
//         }

//         if(size == 1) {
//             int temp = head.data;
//             head = tail = null;
//             size = 0;
//             return temp;
//         }

//         int temp = head.data;
//         head = head.next;
//         size--;
//         return temp;
//     }

//     public int removeLast() {
//          if(size == 0) {
//             System.out.println("SLL is empty");
//             return Integer.MIN_VALUE;
//          }

//          else if(size == 1){
//             int val = head.data;
//             head = tail = null;
//             size = 0;
//             return val;
//          }

//          Node prev = head;
//          for(int i=0; i<size-2; i++) {
//             prev = prev.next;
//          }
         
//          int val = prev.next.data;
//          prev.next = null;
//          tail = prev;
//          size--;
//          return val;

//     }
//     public void add(int data, int idx) {
//         if(idx == 0) {
//             addFirst(data);
//             return;
//         }

//         Node newNode = new Node(data);
//         size++;
//         Node temp = head;
//         int i=0;

//         while(i < idx-1) {
//             temp = temp.next;
//             i++;
//         }
//         newNode.next = temp.next;
//         temp.next = newNode;
//     }

//     // public int searchitr(int key) {
//     //     int i=0;
//     //     Node temp = head;

//     //     while(temp != null){
//     //         if(temp.data == key){
//     //             return i;
//     //         }
//     //         i++;
//     //         temp = temp.next;
//     //     }
//     //     return -1;
//     // }

//     public int helper(Node head, int key) {  // O(n)
//         if(head == null) {
//             return -1;
//         }

//         if(head.data == key) {
//             return 0;
//         }
//         int idx = helper(head.next, key);
//         if(idx == -1){
//             return -1;
//         }
//         return idx+1;
//     }
//     public int searchRec(int key) {
//         return helper(head, key);
//     }
// public static void main(String args[]){
//   a ll = new a(); 
//   ll.addFirst(3);     
//   ll.addFirst(2);     
// //   ll.print();
// //   System.out.println(size);
//   ll.addLast(1);
// //   ll.print();
// //   ll.removeFirst();
// //   ll.print();
// //   ll.removeLast();
// //   ll.print();
//   ll.add(4, 2);   
//   ll.print();
//   System.out.println(ll.searchRec(4));
//   System.out.println(ll.searchRec(10));
// }
// }




// // Reverse a LL
// public class a {
//     public class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//            this.data = data;
//            this.next = null; 
//         }
//     }

//     public static Node head;
//     public static Node tail;
//     public static int size;

//     public void addFirst(int data) {
//         Node newNode = new Node(data);
//         size++;
//         if(head == null) {
//             head = tail = newNode;
//             return;
//         }

//         newNode.next = head;
//         head = newNode;
//     }

//     public void print(){
//         Node temp = head;
//         while(temp != null){
//             System.out.print(temp.data + "->");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }
//     public void addLast(int data) {
//         Node newNode = new Node(data);
//         if(head == null){
//             head = tail = newNode;
//             return;
//         }
//         tail.next = newNode;
//         tail = newNode;   
//     }

//     public int removeFirst() {
//         if(size == 0) {
//             System.out.println("SLL is empty");
//             return Integer.MIN_VALUE;
//         }

//         if(size == 1) {
//             int temp = head.data;
//             head = tail = null;
//             size = 0;
//             return temp;
//         }

//         int temp = head.data;
//         head = head.next;
//         size--;
//         return temp;
//     }

//     public int removeLast() {
//          if(size == 0) {
//             System.out.println("SLL is empty");
//             return Integer.MIN_VALUE;
//          }

//          else if(size == 1){
//             int val = head.data;
//             head = tail = null;
//             size = 0;
//             return val;
//          }

//          Node prev = head;
//          for(int i=0; i<size-2; i++) {
//             prev = prev.next;
//          }
         
//          int val = prev.next.data;
//          prev.next = null;
//          tail = prev;
//          size--;
//          return val;

//     }
//     public void add(int data, int idx) {
//         if(idx == 0) {
//             addFirst(data);
//             return;
//         }

//         Node newNode = new Node(data);
//         size++;
//         Node temp = head;
//         int i=0;

//         while(i < idx-1) {
//             temp = temp.next;
//             i++;
//         }
//         newNode.next = temp.next;
//         temp.next = newNode;
//     }

//     // public int searchitr(int key) {
//     //     int i=0;
//     //     Node temp = head;

//     //     while(temp != null){
//     //         if(temp.data == key){
//     //             return i;
//     //         }
//     //         i++;
//     //         temp = temp.next;
//     //     }
//     //     return -1;
//     // }

//     public int helper(Node head, int key) {  // O(n)
//         if(head == null) {
//             return -1;
//         }

//         if(head.data == key) {
//             return 0;
//         }
//         int idx = helper(head.next, key);
//         if(idx == -1){
//             return -1;
//         }
//         return idx+1;
//     }
//     public int searchRec(int key) {
//         return helper(head, key);
//     }

//     public void reverse() { // O(n)
//         Node prev = null;
//         Node curr = tail = head;
//         Node next;

//         while(curr != null){
//             next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = next;
//         }
//         head = prev;
//     }
// public static void main(String args[]){
//   a ll = new a(); 
//   ll.addFirst(3);     
//   ll.addFirst(2);     
//   ll.addLast(1);
//   ll.add(4, 2);   
//   ll.print();
//   ll.reverse();
//   ll.print();
// }
// }


// DeleteNth node from end
// public class a {
//     public class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//            this.data = data;
//            this.next = null; 
//         }
//     }

//     public static Node head;
//     public static Node tail;
//     public static int size;

//     public void addFirst(int data) {
//         Node newNode = new Node(data);
//         size++;
//         if(head == null) {
//             head = tail = newNode;
//             return;
//         }

//         newNode.next = head;
//         head = newNode;
//     }

//     public void print(){
//         Node temp = head;
//         while(temp != null){
//             System.out.print(temp.data + "->");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }
//     public void addLast(int data) {
//         Node newNode = new Node(data);
//         if(head == null){
//             head = tail = newNode;
//             return;
//         }
//         tail.next = newNode;
//         tail = newNode;   
//     }

//     public int removeFirst() {
//         if(size == 0) {
//             System.out.println("SLL is empty");
//             return Integer.MIN_VALUE;
//         }

//         if(size == 1) {
//             int temp = head.data;
//             head = tail = null;
//             size = 0;
//             return temp;
//         }

//         int temp = head.data;
//         head = head.next;
//         size--;
//         return temp;
//     }

//     public int removeLast() {
//          if(size == 0) {
//             System.out.println("SLL is empty");
//             return Integer.MIN_VALUE;
//          }

//          else if(size == 1){
//             int val = head.data;
//             head = tail = null;
//             size = 0;
//             return val;
//          }

//          Node prev = head;
//          for(int i=0; i<size-2; i++) {
//             prev = prev.next;
//          }
         
//          int val = prev.next.data;
//          prev.next = null;
//          tail = prev;
//          size--;
//          return val;

//     }
//     public void add(int data, int idx) {
//         if(idx == 0) {
//             addFirst(data);
//             return;
//         }

//         Node newNode = new Node(data);
//         size++;
//         Node temp = head;
//         int i=0;

//         while(i < idx-1) {
//             temp = temp.next;
//             i++;
//         }
//         newNode.next = temp.next;
//         temp.next = newNode;
//     }

//     // public int searchitr(int key) {
//     //     int i=0;
//     //     Node temp = head;

//     //     while(temp != null){
//     //         if(temp.data == key){
//     //             return i;
//     //         }
//     //         i++;
//     //         temp = temp.next;
//     //     }
//     //     return -1;
//     // }

//     public int helper(Node head, int key) {  // O(n)
//         if(head == null) {
//             return -1;
//         }

//         if(head.data == key) {
//             return 0;
//         }
//         int idx = helper(head.next, key);
//         if(idx == -1){
//             return -1;
//         }
//         return idx+1;
//     }
//     public int searchRec(int key) {
//         return helper(head, key);
//     }

//     public void reverse() { // O(n)
//         Node prev = null;
//         Node curr = tail = head;
//         Node next;

//         while(curr != null){
//             next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = next;
//         }
//         head = prev;
//     }

//     public void deleteNthfromEnd(int n) {
//         // Size of LL
//         int size = 0;
//         Node temp = head;
//         while(temp != null){
//             size++;
//             temp = temp.next;
//         }

//         if(n == size) {
//             head = head.next;  // removeFirst
//             return;
//         }

//         // size - n;
//         int i = 1;
//         int iToFind = size - n;
//         Node prev = head;
//         while(i < iToFind) {
//             prev = prev.next;
//             i++;
//         }
//         prev.next = prev.next.next;
//         return;
//         }
// public static void main(String args[]){
//   a ll = new a(); 
//   ll.addFirst(3);     
//   ll.addFirst(2);     
//   ll.addLast(1);
//   ll.add(4, 2);   
//   ll.print();
// //   ll.reverse();
// //   ll.print();

//   ll.deleteNthfromEnd(3);
//   ll.print();


// }
// }



// 
public class a {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
           this.data = data;
           this.next = null; 
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void addLast(int data) {
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;   
    }

    public int removeFirst() {
        if(size == 0) {
            System.out.println("SLL is empty");
            return Integer.MIN_VALUE;
        }

        if(size == 1) {
            int temp = head.data;
            head = tail = null;
            size = 0;
            return temp;
        }

        int temp = head.data;
        head = head.next;
        size--;
        return temp;
    }

    public int removeLast() {
         if(size == 0) {
            System.out.println("SLL is empty");
            return Integer.MIN_VALUE;
         }

         else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
         }

         Node prev = head;
         for(int i=0; i<size-2; i++) {
            prev = prev.next;
         }
         
         int val = prev.next.data;
         prev.next = null;
         tail = prev;
         size--;
         return val;

    }
    public void add(int data, int idx) {
        if(idx == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;

        while(i < idx-1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // public int searchitr(int key) {
    //     int i=0;
    //     Node temp = head;

    //     while(temp != null){
    //         if(temp.data == key){
    //             return i;
    //         }
    //         i++;
    //         temp = temp.next;
    //     }
    //     return -1;
    // }

    public int helper(Node head, int key) {  // O(n)
        if(head == null) {
            return -1;
        }

        if(head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int searchRec(int key) {
        return helper(head, key);
    }

    public void reverse() { // O(n)
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deleteNthfromEnd(int n) {
        // Size of LL
        int size = 0;
        Node temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }

        if(n == size) {
            head = head.next;  // removeFirst
            return;
        }

        // size - n;
        int i = 1;
        int iToFind = size - n;
        Node prev = head;
        while(i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
        }

        // Slow-Fast Approach
        public Node findMid(Node head) {  //helper
            Node slow = head;
            Node fast = head;
   
            while(fast != null && fast.next != null) {
                slow = slow.next;  //+1
                fast = fast.next.next;   //+2
            }
            return slow;  // slow is my midNode
        }

        public boolean checkPalindrome() {
            if(head == null || head.next == null){
                return true;
            }
            // step1 - find mid
            Node midNode = findMid(head);

            // step2 - reverse 2nd half
            Node prev = null;
            Node curr = midNode;
            Node next;

            while(curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            Node right = prev;  // right half head
            Node left = head;   // left half head

            // step3 - check left half and right half
            while(right != null) {
                if(left.data != right.data){
                    return false;
                }
                left = left.next;
                right = right.next;
            }
            return true;
        }
public static void main(String args[]){
  a ll = new a(); 
  ll.addFirst(3);     
  ll.addFirst(2);     
  ll.addLast(1);
  ll.add(4, 2);   
  ll.print();

  System.out.println(ll.checkPalindrome());

}
}          
