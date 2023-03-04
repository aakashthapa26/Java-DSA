// Diameter of a Tree

// public class a{
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

//         return Math.max(lh,rh)+1;
//     }

//     public static int diameter(Node root){
//         if(root == null){
//             return 0;
//         }

//         int ldiameter = diameter(root.left);
//         int rdiameter = diameter(root.right);
//         int lh = height(root.left);
//         int rh = height(root.right);

//         int selfdiameter = lh + rh + 1;

//         return Math.max(selfdiameter, Math.max(lh, rh));
//     }
//     public static void main(String args[]){
//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right = new Node(3);
//         root.right.left = new Node(6);
//         root.right.right = new Node(7);
//         root.right.right.left = new Node(8);

//         System.out.print(diameter(root));
//     }
// }



// Optimized Solution of Diameter of Tree

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

//     static class Info{
//         int diam;
//         int ht;

//         Info(int diam, int ht){
//             this.diam = diam;
//             this.ht = ht;
//         }
//     }

//     public static Info diameter(Node root){
//         if(root == null){
//             return new Info(0,0);
//         }
//         Info leftInfo = diameter(root.left);
//         Info rightInfo = diameter(root.right);

//         int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
//         int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

//         return new Info(diam, ht);

//     }
//     public static void main(String args[]){
//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right.left = new Node(6);

//         System.out.println(diameter(root).diam); 
//         System.out.println(diameter(root).ht); 
//     }
// }

 

// SubTree of another tree

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

//     public static boolean isIdentical(Node node, Node subroot){
//         if(node == null && subroot == null){
//             return true;
//         }

//         else if(node == null || subroot == null || node.data != subroot.data){
//             return false;
//         }

//         if(!isIdentical(node.left, subroot.left)){
//             return false;
//         }

//         if(!isIdentical(node.right, subroot.right)){
//             return false;
//         }

//         return true;
//     }
//     public static boolean isSubtree(Node root, Node subroot){
//         if(root == null){
//             return false;
//         }
//         if(root.data == subroot.data){
//             if(isIdentical(root, subroot)){
//                 return true;
//             }
//         }

//         return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
//     }
// public static void main(String args[]){
//     Node root = new Node(1);
//     root.left = new Node(2);
//     root.left.left = new Node(4);
//     root.left.right = new Node(5);
//     root.right = new Node(3);
//     root.right.left = new Node(6);
//     root.right.right = new Node(7);



//     Node subroot = new Node(2);
//     subroot.left = new Node(4);
//     subroot.right = new Node(5);

//     System.out.println(isSubtree(root, subroot));
// } 

// }


// Top View of a tree

import java.util.*;
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

    static class Info{
        Node node;
        int hd; //hd -> Horizontal Distance

        Info(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root){
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0, max = 0;
        q.add(new Info(root, 0));
        q.add(null);

        while(!q.isEmpty()){
            Info curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            } 

            if(!map.containsKey(curr.hd)){
                map.put(curr.hd, curr.node);
            }

            if(curr.node.left != null){
                q.add(new Info(curr.node.left, curr.hd-1));
                min = Math.min(min, curr.hd-1);
            }
            if(curr.node.right != null){
                q.add(new Info(curr.node.right, curr.hd+1));
                max = Math.max(max, curr.hd+1);
            }
        }

        for(int i=min; i<=max; i++){
            System.out.print(map.get(i).data);
        }
        System.out.println();
    }
public static void main(String args[]){
    Node root = new Node(1);
    root.left = new Node(2);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right = new Node(3);
    root.right.left = new Node(6);
    root.right.right = new Node(7);



    Node subroot = new Node(2);
    subroot.left = new Node(4);
    subroot.right = new Node(5); 

    
} 

}
