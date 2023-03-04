// Build a BST

public class a{
    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
        }
    }

    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            root.left = insert(root.left, val);
        }
        else{
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String args[]){
        int values[] = {3,5,6,8,10,11,12};
        Node root = null;

        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }

        preOrder(root);
    }
}



// Search in a BST

// public class a{
//     static class Node{
//         int data;
//         Node left, right;

//         Node(int data){
//             this.data = data;
//         }
//     }

//     public static Node insert(Node root, int val){
//         if(root == null){
//             root = new Node(val);
//             return root;
//         }

//         if(root.data > val){
//             root.left = insert(root.left, val);
//         }
//         else{
//             root.right = insert(root.right, val);
//         }

//         return root;
//     }
//     public static boolean isFound(Node root, int key){
//         if(root != null){
//             if(root.data == key){
//                 return true;
//             }
//             else if(root.data > key){
//                 return isFound(root.left, key);
//             }
//             else{
//                 return isFound(root.right, key);
//             }
//         }
//         return false;
//     }
//     public static void main(String args[]){ 
//         int values[]={2,8,7,10,5};
//         Node root = null;

//         for(int i=0; i<values.length; i++){
//             root = insert(root, values[i]);
//         }

//         int key = 1;
//         if(isFound(root,key) == true){
//             System.out.println("Yes "+key+" is Present");
//         }
//         else{
//             System.out.println("Yes "+key+" is not Present");
//         }
//     }
// }


// Delete a Node
// public class a{
//     static class Node{
//         int data;
//         Node left, right;

//         Node(int data){
//             this.data = data;
//         }
//     }

//     public static Node insert(Node root, int val){
//         if(root == null){
//             root = new Node(val);
//             return root;
//         }

//         if(root.data > val){
//             root.left = insert(root.left, val);
//         }
//         else{
//             root.right = insert(root.right, val);
//         }

//         return root;
//     }

//     public static void inOrder(Node root){
//         if(root == null){
//             return;
//         }
//         inOrder(root.left);
//         System.out.print(root.data+" ");
//         inOrder(root.right);
//     }

//     public static Node delete(Node root, int val){
//         if(root.data > val){
//             root.left = delete(root.left, val);
//         }
//         else if(root.data < val){
//             root.right = delete(root.right, val);
//         }

//         else{
//             if(root.left == null && root.right == null){
//                 return null;
//             }
//             if(root.left == null){
//                 return root.right;
//             }
//             else if(root.right == null){
//                 return root.left;
//             }
//             else{
//                 Node IS = findInorderSuccessor(root.right);
//                 root.data = IS.data;
//                 delete(root.right, IS.data);
//             }
//         }

//         return root;
//     }

//     public static Node findInorderSuccessor(Node root){
//         while(root.left != null){
//             root = root.left;
//         }
//         return root;
//     }  
//     public static void main(String args[]){ 
//         int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
//         Node root = null;

//         for(int i=0; i<values.length; i++){
//             root = insert(root, values[i]);
//         }

//         inOrder(root);
//         System.out.println();
//         delete(root, 1);
//         inOrder(root);
//     }
// }



// Print in Range
// public class a{
//     static class Node{
//         int data;
//         Node left, right;

//         Node(int data){
//             this.data = data;
//         }
//     }

//     public static Node insert(Node root, int val){
//         if(root == null){
//             root = new Node(val);
//             return root;
//         }

//         if(root.data > val){
//             root.left = insert(root.left, val);
//         }
//         else{
//             root.right = insert(root.right, val);
//         }

//         return root;
//     }

//     public static void inOrder(Node root){
//         if(root == null){
//             return;
//         }
//         inOrder(root.left);
//         System.out.print(root.data+" ");
//         inOrder(root.right);
//     }

//     public static Node delete(Node root, int val){
//         if(root.data > val){
//             root.left = delete(root.left, val);
//         }
//         else if(root.data < val){
//             root.right = delete(root.right, val);
//         }

//         else{
//             if(root.left == null && root.right == null){
//                 return null;
//             }
//             if(root.left == null){
//                 return root.right;
//             }
//             else if(root.right == null){
//                 return root.left;
//             }
//             else{
//                 Node IS = findInorderSuccessor(root.right);
//                 root.data = IS.data;
//                 delete(root.right, IS.data);
//             }
//         }

//         return root;
//     }

//     public static Node findInorderSuccessor(Node root){
//         while(root.left != null){
//             root = root.left;
//         }
//         return root;
//     }  

//     public static void printInRange(Node root, int k1, int k2){
//         if(root == null){
//             return;
//         }
//         if(root.data >= k1 && root.data <= k2){
//             printInRange(root.left, k1, k2);
//             System.out.print(root.data+" ");
//             printInRange(root.right, k1, k2);
//         }
        
//         else if(root.data < k1){
//             printInRange(root.left, k1, k2);
//         }
//         else{
//             printInRange(root.right, k1, k2);
//         }
//     }
//     public static void main(String args[]){ 
//         int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
//         Node root = null;

//         for(int i=0; i<values.length; i++){
//             root = insert(root, values[i]);
//         }

//         inOrder(root);
//         System.out.println();
//         printInRange(root, 5, 12);
//     }
// }

 

// Root to leaf Paths
// import java.util.*;
// public class a{
//     static class Node{
//         int data;
//         Node left, right;

//         Node(int data){
//             this.data = data;
//         }
//     }

//     public static Node insert(Node root, int val){
//         if(root == null){
//             root = new Node(val);
//             return root;
//         }

//         if(root.data > val){
//             root.left = insert(root.left, val);
//         }
//         else{
//             root.right = insert(root.right, val);
//         }

//         return root;
//     }

//     public static void inOrder(Node root){
//         if(root == null){
//             return;
//         }
//         inOrder(root.left);
//         System.out.print(root.data+" ");
//         inOrder(root.right);
//     }

//     public static Node delete(Node root, int val){
//         if(root.data > val){
//             root.left = delete(root.left, val);
//         }
//         else if(root.data < val){
//             root.right = delete(root.right, val);
//         }

//         else{
//             if(root.left == null && root.right == null){
//                 return null;
//             }
//             if(root.left == null){
//                 return root.right;
//             }
//             else if(root.right == null){
//                 return root.left;
//             }
//             else{
//                 Node IS = findInorderSuccessor(root.right);
//                 root.data = IS.data;
//                 delete(root.right, IS.data);
//             }
//         }

//         return root;
//     }

//     public static Node findInorderSuccessor(Node root){
//         while(root.left != null){
//             root = root.left;
//         }
//         return root;
//     }  

//     public static void printInRange(Node root, int k1, int k2){
//         if(root == null){
//             return;
//         }
//         if(root.data >= k1 && root.data <= k2){
//             printInRange(root.left, k1, k2);
//             System.out.print(root.data+" ");
//             printInRange(root.right, k1, k2);
//         }
        
//         else if(root.data < k1){
//             printInRange(root.left, k1, k2);
//         }
//         else{
//             printInRange(root.right, k1, k2);
//         }
//     }

//     public static void printRoot2Leaf(Node root, ArrayList<Integer> path){
//         if(root == null){
//             return;
//         }
//         path.add(root.data);
//         if(root.left == null && root.right == null){
//             printPath(path);
//         }
//         printRoot2Leaf(root.left, path);
//         printRoot2Leaf(root.right, path);
//         path.remove(path.size()-1);
//     }

//     public static void printPath(ArrayList<Integer> path){
//         for(int i = 0; i<path.size(); i++){
//             System.out.print(path.get(i)+"->");
//         }
//         System.out.println("Null");
//     }
//     public static void main(String args[]){ 
//         int values[] = {8, 5, 3, 6, 10, 11, 14};
//         Node root = null;

//         for(int i=0; i<values.length; i++){
//             root = insert(root, values[i]);
//         }

//         inOrder(root);
//         System.out.println();
//         printRoot2Leaf(root, new ArrayList<>());
//     }
// }


// Validate a BST
// Note : To check whether a BST is valid or not
// Check : If inOrder traversal gives sorted BST --> BST is Valid 
// Check : If max value in left subtree < node and min value in right subtree > node

// import java.util.*;
// public class a{
//     static class Node{
//         int data;
//         Node left,right;

//         Node(int data){
//             this.data = data;
//         }
//     }

//     public static Node Build(Node root, int val){
//         if(root == null){
//             root = new Node(val);
//             return root;
//         }

//         if(root.data > val){
//             root.left = Build(root.left, val);
//         }
//         else{
//             root.right = Build(root.right, val);
//         }
        
//         return root;
//     }
    
//     public static void inOrder(Node root){
//         if(root == null){
//             return;
//         }

//         inOrder(root.left);
//         System.out.print(root.data+" ");
//         inOrder(root.right);
//     }

//     public static void printinRange(Node root, int k1, int k2){
//         if(root == null){
//             return;
//         }
//         if(root.data >= k1 && root.data <= k2){
//             printinRange(root.left, k1, k2);
//             System.out.print(root.data+" ");
//             printinRange(root.right, k1, k2);
//         }
//         else if (root.data < k1){
//             printinRange(root.right, k1, k2);
//         }
//         else{
//             printinRange(root.left, k1, k2);
//         }
//     }

//     public static boolean isValidBST(Node root, Node min, Node max){
//         if(root == null){
//             return true;
//         }
        
//         if(min != null && root.data <= min.data){
//             return false;
//         }

//         else if(max != null && root.data >= max.data ){
//             return false;
//         }

//         return isValidBST(root.left, min, root)
//                 && isValidBST(root.right, root, max);
//     }
//     public static void main(String args[]){
//         int val[] = {8, 5, 3, 6, 10, 11, 14};
//         Node root = null;

//         for(int i=0; i<val.length; i++){
//             root = Build(root, val[i]);
//         }

//         inOrder(root);
//         System.out.println();

//         if(isValidBST(root, null, null)){
//             System.out.print("valid BST");
//         }
//         else{
//             System.out.print("invalid BST");
//         }
//     }    
// } 


// Mirror a BST
 
// import java.util.*;
// public class a{
//     static class Node{
//         int data;
//         Node left,right;

//         Node(int data){
//             this.data = data;
//         }
//     }

//     public static Node Build(Node root, int val){
//         if(root == null){
//             root = new Node(val);
//             return root;
//         }

//         if(root.data > val){
//             root.left = Build(root.left, val);
//         }
//         else{
//             root.right = Build(root.right, val);
//         }
        
//         return root;
//     }
 
//     public static Node Mirror_a_BST(Node root){
//         if(root == null){
//             return null;
//         }

//         Node leftMirror = Mirror_a_BST(root.left);
//         Node rightMirror = Mirror_a_BST(root.right);

//         root.left = rightMirror;
//         root.right = leftMirror;

//         return root;
//     }

//     public static void preOrder(Node root){
//         if(root == null){
//             return;
//         }
//         System.out.print(root.data+" ");
//         preOrder(root.left);
//         preOrder(root.right);
//     }
//     public static void main(String args[]){
//         int val[] = {8, 5, 10, 3, 6, 11};
//         Node root = null;

//         for(int i=0; i<val.length; i++){
//             root = Build(root, val[i]);
//         }

//         preOrder(root);
//         System.out.println();
//         root = Mirror_a_BST(root);
//         preOrder(root);
//     }    
// } 

