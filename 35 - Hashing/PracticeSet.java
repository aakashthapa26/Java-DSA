// 1.Top view of a Binary Tree

// import java.util.*;
// public class PracticeSet{
//     static class Node{
//         int data;
//         Node left, right;

//         Node(int data){
//             this.data = data;
//             this.left = this.right = null;
            
//         }
//     }
//     static class Pair{
//         int hd;
//         Node node;

//         Pair(int hd, Node node){
//             this.hd = hd;
//             this.node = node;
//         }
//     }
//     static ArrayList<Integer> topView(Node root){
//         Queue<Pair> q = new LinkedList<>();
//         Map<Integer, Integer> map = new TreeMap<>();

//         q.add(new Pair(0, root));
//         while(!q.isEmpty()){
//             Pair curr = q.poll();
//             if(!map.containsKey(curr.hd)){
//                 map.put(curr.hd, curr.node.data);
//             }

//             if(curr.node.left != null){
//                 q.add(new Pair(curr.hd-1, curr.node.left));
//             }

//             if(curr.node.right != null){
//                 q.add(new Pair(curr.hd+1, curr.node.right));
//             }
//         }

//         ArrayList<Integer> ans = new ArrayList<>();
//         for(Map.Entry<Integer, Integer> entry: map.entrySet()){
//             ans.add(entry.getValue());
//         }

//         return ans;
//     }
//     public static void main(String args[]){

//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right.left = new Node(6);
//         root.right.right = new Node(7);

//         System.out.println(topView(root));
//     }
// }


// 1. Bottom view of a Binary Tree

// import java.util.*;
// public class PracticeSet{ 
//     static class Node{
//         int data; 
//         Node left, right;

//         Node(int data){
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     // Logical Part

//     static ArrayList<Integer> bottomView(Node root){
//         Queue<Pair> q = new LinkedList<>();
//         Map<Integer, Integer> map = new TreeMap<>();

//         q.add(new Pair(0, root));
//         while(!q.isEmpty()){
//             Pair curr = q.poll();
            
//             map.put(curr.hd, curr.node.data);

//             if(curr.node.left != null){
//                 q.add(new Pair(curr.hd-1, curr.node.left));
//             }

//             if(curr.node.right != null){
//                 q.add(new Pair(curr.hd+1, curr.node.right));
//             }
//         }

//         ArrayList<Integer> ans = new ArrayList<>();
//         for(Map.Entry<Integer, Integer> entry : map.entrySet()){
//             ans.add(entry.getValue());
//         }

//         return ans;
//     }

//     //

//     static class Pair{
//         int hd;
//         Node node;

//         Pair(int hd, Node node){
//             this.hd = hd;
//             this.node = node;
//         }
//     }
//     public static void main(String args[]){

//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right.left = new Node(6);
//         root.right.right = new Node(7);


//         System.out.println(bottomView(root));

//     }
// }

// 2. Two Sums

// import java.util.*;

// public class PracticeSet{
//     public static int[] TwoSum(int arr[], int target){

//         Map<Integer, Integer> map = new HashMap<>();

//         for(int i=0; i<arr.length; i++){
//             int diff = target-arr[i];
//             if(map.containsKey(diff) && map.get(diff) != i){
//                 return new int[] {map.get(target-arr[i]), i};
//             }
//             map.put(arr[i],i);
//         }
   
//         return new int[] {0, 0};
//     }
//     public static void main(String args[]){
//         int arr[] = {2,7,11,15};
//         int target = 9;

//         PracticeSet num = new PracticeSet();

//         System.out.println(Arrays.toString(num.TwoSum(arr, target)));
//     }
// }



//3. Frequency Sort

import java.util.*;

public class PracticeSet{
    public String frequencySort(String s){
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> pq = 
        new PriorityQueue<>((a,b)->a.getValue()==b.getValue()?
        a.getKey()-b.getKey(): b.getValue()-a.getValue());

        for(Map.Entry<Character,Integer> e: map.entrySet())  pq.add(e);

        StringBuilder res = new StringBuilder();
        while(pq.size()!=0){
            char ch = pq.poll().getKey();
            int val = map.get(ch);
            while(val != 0){
                res.append(ch);
                val--;
            }
        }
        return res.toString();
    }
    public static void main(String args[]){
        String s = "ccdaab";
        
        PracticeSet a = new PracticeSet();
        System.out.println(a.frequencySort(s));
    }
}




