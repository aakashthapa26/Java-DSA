import java.util.*;
public class Root_to_leaf_paths {

    static class Node{
        int data;
        Node left;
        Node right;

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

    // public static Node delete(Node root, int val){
    //     if(root.data < val){
    //         root.right = delete(root.right, val);
    //     }
    //     else if(root.data > val){
    //         root.left = delete(root.left, val);
    //     }
    //     else{
    //         // case 1 - leaf node
    //         if(root.left == null && root.right == null){
    //             return null;
    //         }
    //         // case 2 - single child
    //         if(root.left == null){
    //             return root.right;
    //         }
    //         else if(root.right == null){
    //             return root.left;
    //         }

    //         // case 3 - both children
    //         Node IS = findInorderSuccessor(root.right);
    //         root.data = IS.data;
    //         root.right = delete(root.right, IS.data);
    //     }

    //     return root;
    // }

    // public static Node findInorderSuccessor(Node root) {
    //     while(root.left != null){
    //         root = root.left;
    //     }
    //     return root;
    // }

    public static void inOrder(Node root){
        if(root != null){
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    }

    public static void printPath(ArrayList<Integer> path){
        for(int i=0; i<path.size(); i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("Null");
    }
    public static void printRoot2Leaf(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            printPath(path);
        }
        printRoot2Leaf(root.left, path);
        printRoot2Leaf(root.right, path);
        path.remove(path.size()-1);
    }

    public static void main(String args[]){
        int values[] = {8, 5, 3, 6, 10, 11, 14};
        Node root = null;

        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }
        inOrder(root);
        System.out.println();
        
        printRoot2Leaf(root, new ArrayList<>());

    }   
}

