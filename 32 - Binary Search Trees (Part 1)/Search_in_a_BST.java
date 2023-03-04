public class Search_in_a_BST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node (int data){
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
    public static boolean binarySearch(Node root, int key){  // T.C - O(H)
        if(root != null){
            if(root.data == key){
                return true;
            }
            else if(root.data > key){
                return binarySearch(root.left, key);
            }
            else{
                return binarySearch(root.right, key);
            }
        }

        return false;
    }
    public static void main(String args[]){
        int values[] = {5, 1, 3, 4, 2, 7};
        Node root = null;

        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }
        int key = 7;

        if(binarySearch(root, key)){
            System.out.print("found");
        }
        else{
            System.out.print("not found");
        }
    }
}
