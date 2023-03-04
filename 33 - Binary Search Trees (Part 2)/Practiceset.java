// 1. Range Sum of BST

public class Practiceset {
  static class Node{
    int data;
    Node left, right;

    Node(int data){
        this.data = data;
    }
  }

  public static int rangeSumBST(Node root, int low, int high){
    if(root == null){
      return 0;
    }
    if(root.data > high){
      return rangeSumBST(root.left, low, high);
    }
    else if(root.data < low){
      return rangeSumBST(root.right, low, high);
    }
    else{
      return root.data + rangeSumBST(root.left, low, high) +  rangeSumBST(root.right, low, high);
    }
  }


  public static void main(String args[]){
    Node root = new Node(8);
    root.left = new Node(5);
    root.left.left = new Node(3);
    root.left.right = new Node(6);
    root.right = new Node(11);
    root.right.right = new Node(20);

    System.out.print(rangeSumBST(root, 5, 11));
        
  }
}
