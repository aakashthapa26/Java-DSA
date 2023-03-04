// Tree Traversal

// import java.util.*;
// public class b {
//     static class Node{
//         int data;
//         Node left;
//         Node right;

//         Node(int data){
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     // public static void preOrder(Node root){
//     //     if(root == null){
//     //         return;
//     //     }

//     //     System.out.print(root.data+" ");
//     //     preOrder(root.left);
//     //     preOrder(root.right);

//     // }

//     // public static void inOrder(Node root){
//     //     if(root == null){
//     //         return;
//     //     }
//     //     inOrder(root.left);
//     //     System.out.print(root.data+" ");
//     //     inOrder(root.right);
//     // }

//     // public static void postOrder(Node root){
//     //     if(root == null){
//     //         return;
//     //     }

//     //     postOrder(root.left);
//     //     postOrder(root.right);
//     //     System.out.print(root.data+" ");
//     // }


//     public static void levelOrder(Node root){
//         if(root == null){
//             return;
//         }   

//         Queue<Node> q = new LinkedList<>();
//         q.add(root);
//         q.add(null);

//         while(!q.isEmpty()){
//             Node currNode = q.remove();
//             if(currNode == null){
//                 System.out.println();
//                 if(q.isEmpty()){
//                     break;
//                 }
//                 else{
//                     q.add(null);
//                 }
//             }
//             else{
//                 System.out.print(currNode.data+" ");
//                 if(currNode.left != null){
//                     q.add(currNode.left);
//                 }
//                 if(currNode.right != null){
//                     q.add(currNode.right);
//                 }
//             }
//         }
//     }
//     public static void main(String args[]){
//         Node root = new Node(1);   
//         root.left = new Node(2);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right = new Node(3);
//         root.right.right = new Node(6);

//         // preOrder(root);
//         // inOrder(root); 
//         // postOrder(root); 
//         levelOrder(root); 
//     }
// }



// Height of a Tree

// public class b {
//     static class Node{
//         int data;
//         Node left;
//         Node right;

//         Node(int data){
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }
//     public static int height(Node root){
//         if(root == null){
//             return 0;
//         }

//         int lh = height(root.left);
//         int rh = height(root.right);

//         return Math.max(lh, rh)+1;
//     }
// public static void main(String args[]){
//    Node root = new Node(1);
//    root.left = new Node(2);
//    root.left.left = new Node(4);
//    root.left.right = new Node(5);
//    root.right = new Node(3);
//    root.right.right = new Node(6);

//    System.out.println(height(root));
// }

// }


// Count of a Node in a Binary Tree

// public class b {
//     static class Node{
//         int data;
//         Node left;
//         Node right;

//         Node(int data){
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }
//     public static int count(Node root){
//         if(root == null){
//             return 0;
//         }
//         int lh = count(root.left);
//         int rh = count(root.right);

//         return (lh + rh + 1);
//     }
// public static void main(String args[]){
//    Node root = new Node(1);
//    root.left = new Node(2);
//    root.left.left = new Node(4);
//    root.left.right = new Node(5);
//    root.right = new Node(3);
//    root.right.right = new Node(6);

//    System.out.println(count(root));
// }

// }


// Sum of Nodes:

// public class b {
//     static class Node{
//         int data;
//         Node left;
//         Node right;

//         Node(int data){
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }
//     public static int sum(Node root){
//         if(root == null){
//             return 0;
//         }

//         int lsum = sum(root.left);
//         int rsum = sum(root.right);

//         return (lsum+rsum+root.data);
//     }
// public static void main(String args[]){
//    Node root = new Node(1);
//    root.left = new Node(2);
//    root.left.left = new Node(4);
//    root.left.right = new Node(5);
//    root.right = new Node(3);
//    root.right.right = new Node(6);

//    System.out.println(sum(root));
// }

// }


import java.util.*;
public class b{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void levelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(currNode.data+" ");
                if(currNode.left != null){
                     q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
        }
    }
}
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        levelOrder(root);
    }
}