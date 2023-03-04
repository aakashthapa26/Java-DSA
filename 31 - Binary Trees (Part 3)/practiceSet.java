// // 1. Check if a Binary Tree is Univalued or not

// public class practiceSet {
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

//     public static boolean isUnivalued(Node root){
//         if(root == null){
//             return true;
//         }

//         if(root.left != null && root.data != root.left.data){
//             return false;
//         }

//         if(root.right != null && root.data != root.right.data){
//             return false;
//         }

//         return isUnivalued(root.left) && isUnivalued(root.right);
//     }
//     public static void main(String args[]){
//         Node root = new Node(2);
//         root.left = new Node(2);
//         root.left.left = new Node(5);
//         root.left.right = new Node(2);
//         root.right = new Node(2);
        
//         if(isUnivalued(root)){
//             System.out.print("Yes");
//         }
//         else{
//             System.out.print("No");
//         }

//     }
// }


// 2. Invert Binary Tree
// 1. Check if a Binary Tree is Univalued or not

// public class practiceSet {
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

//     public static boolean isMirror(Node root1, Node root2){
//         if(root1 == null && root2 == null){
//             return true;
//         }

//         if(root1.left.data != root2.right.data && root1.right.data != root2.left.data){
//             return false;
//         }
        

//         return isMirror(root1.left, root2.right) && isMirror(root1.right, root2.left);
//     }
//     public static void main(String args[]){
//         Node root1 = new Node(1);
//         root1.left = new Node(2);
//         root1.left.left = new Node(4);
//         root1.left.right = new Node(5);
//         root1.right = new Node(3);
//         root1.right.left = new Node(6);
//         root1.right.right = new Node(7);
        

//         Node root2 = new Node(1);
//         root2.left = new Node(3);
//         root2.left.left = new Node(7);
//         root2.left.right = new Node(6);
//         root2.right = new Node(2);
//         root2.right.left = new Node(5);
//         root2.right.right = new Node(4);
    
//         if(isMirror(root1, root2)){
//             System.out.print("Yes");
//         }
//         else{
//             System.out.print("No");
//         }
//     }
// }




// 3. Delete leaf nodes with values as x

// import java.util.*;
// public class practiceSet {
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

//     public static Node deleteNode(Node root, int target){
//         if(root == null){
//             return;
//         }
 
//         q.add(root)
//         if(root.data == target){
        
//         } 
//     }
//     public static void main(String args[]){
//         Node root = new Node(1);
//         root.left = new Node(3);
//         root.left.left = new Node(3);
//         root.left.right = new Node(2);
//         root.right = new Node(3);

//         int target = 3;

//     }
// }



// 5. Maximum Path Sum in a Binary Tree

public class practiceSet{
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

    public static int maxPathSum(Node root){
        if(root == null){
            return 0;
        }

        int lsum = maxPathSum(root.left);
        int rsum = maxPathSum(root.right);
        
        int sum = 0;  v
        
    }
    public static void main(String args[]){
        Node root = new Node(-10);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);

        System.out.print(maxPathSum(root));
    }
}


