// Print node data of kth level

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

//     public static void klevel(Node root, int level, int k){
//         if(root == null){
//             return;
//         }

//         if(level == k){
//             System.out.print(root.data+" ");
//         }

//         klevel(root.left, level+1, k);
//         klevel(root.right, level+1, k);
//     }
//     public static void main(String args[]){
//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right = new Node(3);
//         root.right.left = new Node(6);
//         root.right.right = new Node(7);

//         int k = 3;

//         klevel(root, 1, k);
        
//     }
// }


// lowest common ancestor - Approach 1

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

//     public static boolean getPath(Node root, int n, ArrayList<Node> path){
//          if(root == null){
//             return false;
//          }
//          path.add(root);

//          if(root.data == n){
//             return true;
//          }

//          boolean foundLeft = getPath(root.left, n, path);
//          boolean foundright = getPath(root.right, n, path);

//          if(foundLeft || foundright){
//             return true;
//          } 

//          path.remove(path.size()-1);
//          return false;
         
//     }
//     public static Node lca(Node root, int n1, int n2){
//         ArrayList<Node> path1 = new ArrayList<>();
//         ArrayList<Node> path2 = new ArrayList<>();

//         getPath(root, n1, path1);
//         getPath(root, n2, path2);

//         //last common ancestor
//         int i=0;
//         for(; i<path1.size() && i<path2.size(); i++){
//             if(path1.get(i) != path2.get(i)){
//                 break;
//             }
//         }

//         //last equal node -> i-1th
//         Node lca = path1.get(i-1);
//         return lca;
//     }
//     public static void main(String args[]){
//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right = new Node(3);
//         root.right.left = new Node(6);
//         root.right.right = new Node(7);

//         int n1 = 4, n2 = 5;
//         System.out.println(lca(root, n1,n2).data);
//     }
// }


// Approach 2

// import java.util.*;
// public class b{
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

//     public static Node lca(Node root, int n1, int n2){
//         if(root == null || root.data == n1 || root.data == n2){
//             return root;
//         }

//         Node leftLca = lca(root.left, n1, n2);
//         Node rightLca = lca(root.right, n1, n2);

//         if(leftLca == null){
//             return rightLca;
//         }
//         else if(rightLca == null){
//             return leftLca;
//         }

//         else{
//             return root;
//         }
//     }
//     public static void main(String args[]){
//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right = new Node(3);
//         root.right.left = new Node(6);
//         root.right.right = new Node(7);

//         int n1 = 4, n2 = 5;
//         System.out.println(lca(root, n1, n2).data);
//     }
// }



// Minimum Distance b/w two nodes
 
// import java.util.*;
// public class b{
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

//     public static Node lca(Node root, int n1, int n2){
//         if(root == null || root.data == n1 || root.data == n2){
//             return root;
//         }

//         Node leftLca = lca(root.left, n1, n2);
//         Node rightLca = lca(root.right, n1, n2);

//         if(leftLca == null){
//             return rightLca;
//         }
//         else if(rightLca == null){
//             return leftLca;
//         }

//         else{
//             return root;
//         }
//     }

//     public static int lcaDistance(Node root, int n){
//         if(root == null){
//             return -1;
//         }

//         if(root.data == n){
//             return 0;
//         }

//         int leftDist = lcaDistance(root.left, n);
//         int rightDist = lcaDistance(root.right, n);

//         if(leftDist == -1 && rightDist == -1){
//             return -1;
//         }
//         else if(leftDist == -1){
//             return rightDist+1;
//         }
//         else{
//             return leftDist+1;
//         }
//     }

//     public static int minDistance(Node root, int n1, int n2){
//         Node lca = lca(root, n1, n2);

//         int Dist1 = lcaDistance(lca, n1);
//         int Dist2 = lcaDistance(lca, n2);

//         return Dist1 + Dist2;
//     }
//     public static void main(String args[]){
//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right = new Node(3);
//         root.right.left = new Node(6);
//         root.right.right = new Node(7);

//         int n1 = 4, n2 = 6;
//         System.out.println("Min distance b/w node "+n1+" and "+n2+" is : "+minDistance(root, n1, n2));
//     }
// }


// kth Ancestor of Node

// public class b{
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

//     public static int kAncestor(Node root, int n, int k){
//         if(root == null){
//             return -1;
//         }
//         if(root.data == n){
//             return 0;
//         }

//         int leftDist = kAncestor(root.left, n, k);
//         int rightDist = kAncestor(root.right, n, k);

//         if(leftDist == -1 && rightDist == -1){
//             return -1;
//         }

//         int max = Math.max(leftDist, rightDist);
//         if(max+1 == k){
//             System.out.println(root.data+" ");
//         }
//         return max+1;
//     }
//     public static void main(String args[]){
//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right.left = new Node(6);    
//         root.right.right = new Node(7);

//         int n = 5, k = 2;    

//         kAncestor(root, n, k);
//     }
// }
  


// Transform to Sum Tree

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

    public static int transform(Node root){
        if(root == null){
            return 0;
        }

        int leftchild = transform(root.left);
        int rightchild = transform(root.right);

        int data = root.data;

        int newLeft = root.left == null ? 0 : root.left.data;
        int newRight = root.right == null ? 0 : root.right.data;
        
        root.data = leftchild + newLeft + rightchild + newRight;

        return data;
    }

    public static void preorder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);    
        root.right.right = new Node(7);

        transform(root);
        preorder(root);
    }
}
  