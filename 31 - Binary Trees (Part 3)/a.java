// kLevel
public class a {
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

    public static void kLevel(Node root, int level, int k){
        if(root == null){
            return;
        }

        if(level == k){
            System.out.print(root.data+" ");
        }

        kLevel(root.left, level+1, k);
        kLevel(root.right, level+1, k);
    }

public static void main(String args[]){
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);

    int k = 3;

    kLevel(root,1, k);
}
}

// public class a {
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

//         Node leftlca = lca(root.left, n1, n2);
//         Node rightlca = lca(root.right, n1, n2);

//         if(leftlca == null){
//             return rightlca;
//         }
//         else if(rightlca == null){
//             return leftlca;
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

//         int leftlca = lcaDistance(root.left, n);
//         int rightlca = lcaDistance(root.right, n);

//         if(leftlca == -1 && rightlca == -1){
//             return -1;
//         }
//         else if(leftlca == -1){
//             return rightlca + 1;
//         }
//         else{
//             return leftlca + 1; 
//         }
//     }

//     public static int minDistance(Node root, int n1, int n2){
//         Node lca = lca(root, n1, n2);

//         int leftDist = lcaDistance(root, n1);
//         int rightDist = lcaDistance(root, n2);

//         return leftDist + rightDist;
//     }
// public static void main(String args[]){
//     Node root = new Node(1);
//     root.left = new Node(2);
//     root.right = new Node(3);
//     root.left.left = new Node(4);
//     root.left.right = new Node(5);
//     root.right.left = new Node(6);
//     root.right.right = new Node(7);

//     int n1 = 4, n2 = 7;
//     System.out.print(minDistance(root, n1, n2));

// }

// }


// public class a {

//     static class Node{
//         int data;
//         Node left;
//         Node right;

//         Node(int data) {
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
//         /*
//                1
//               / \
//              2   3
//             / \ / \
//            4  5 6  7

//          */

//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right.left = new Node(6);
//         root.right.right = new Node(7);

//         int n = 5, k = 2;
//         kAncestor(root, n, k);
// }
// }
