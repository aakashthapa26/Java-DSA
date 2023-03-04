// public class Build_a_BST{
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

//     public static Node insert(Node root, int val) {
//         if(root == null){
//             root = new Node(val);
//             return root;
//         }

//         if(root.data > val){
//             // left subtree
//            root.left = insert(root.left, val);
//         }
//         else{
//             // right subtree
//             root.right = insert(root.right, val);
//         }
//         return root;
//     }

//     public static void inorder(Node root){
//         if(root == null){
//             return;
//         }
//         inorder((root.left));
//         System.out.print(root.data+" ");
//         inorder(root.right);
//     }
//     public static void main(String args[]){
//         int values[] = {5, 1, 3, 4, 2, 7};
//         Node root = null;

//         for(int i=0; i<values.length; i++){
//             root = insert(root, values[i]);
//         }

//         inorder(root);
//     }
// }


public class Build_a_BST{
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
        if(root != null){
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    }
    public static void main(String args[]){
        int values[] = {10, 7, 5, 2, 1, 3, 4, 8, 6, 9};
        Node root = null;

        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }

        inOrder(root);
    }
} 