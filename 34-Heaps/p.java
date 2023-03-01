// // Nearby Cars

// import java.util.*;
// public class p{
//     static class point implements Comparable<point>{
//         int x, y, distSq, idx;

//         point(int x, int y, int distSq, int idx){
//             this.x = x;
//             this.y = y;
//             this.distSq = distSq;
//             this.idx = idx;
//         }

//         @Override
//         public int compareTo(point p2){
//             return this.distSq - p2.distSq;
//         }
//     }
//     public static void main(String args[]){
//         int pts[][] = {{3,3}, {5,-1}, {-2,4}};
//         int k = 2;

//         PriorityQueue<point> pq = new PriorityQueue<>(); 
//         for(int i=0; i<pts.length; i++){
//             int distSq = pts[i][0]*pts[i][0]+pts[i][1]*pts[i][1];
//             pq.add(new point(pts[i][0], pts[i][1], distSq, i));
//         }

//         for(int i=0; i<k; i++){
//             System.out.print("C"+pq.remove().idx+" ");
//         }
//     }
// }


// 

// import java.util.*;
// public class p{
//     public static void main(String args[]){
//         int ropes[] = {4,3,2,6};

//         PriorityQueue<Integer> pq = new PriorityQueue<>();
//         for(int i=0; i<ropes.length; i++){
//             pq.add(ropes[i]);
//         }

//         int tcost = 0;
//         while(pq.size()>1){
//             int cost1 = pq.poll();
//             int cost2 = pq.poll();
//             tcost += cost1+cost2;
//             pq.add(cost1+cost2);
//         }

//         System.out.println(tcost); 
//     }
// }


// import java.util.*;
// public class p{
//     static class Soldiers implements Comparable<Soldiers>{
//         int soldier;
//         int idx;

//         Soldiers(int soldier, int idx){
//             this.soldier = soldier;
//             this.idx = idx;
//         }

//         @Override
//         public int compareTo(Soldiers p2){
//             if(this.soldier == p2.soldier){
//                 return this.idx - p2.idx;
//             }
//             else{
//                 return this.soldier - p2.soldier;
//             }
//         }
//     }
//     public static void main(String args[]){
//         int pts[][] = {{1,0,0,0},
//                        {1,1,1,1},
//                        {1,0,0,0},
//                        {1,0,0,0},};

//         int k = 2;

//         PriorityQueue<Soldiers> pq = new PriorityQueue<>();

//         for(int i=0; i<pts.length; i++){
//             int count = 0;
//             for(int j=0; j<pts[i].length; j++){
//                 count += pts[i][j] == 1? 1:0;
//             }

//             pq.add(new Soldiers(count, i));
//         }

//         for(int i=0; i<k; i++){
//             System.out.println("R"+pq.remove().idx);
//         }
//     }
// }


// import java.util.*;
// public class p{
//     static class pair implements Comparable<pair>{
//         int val;
//         int idx;

//         pair(int val, int idx){
//             this.val = val;
//             this.idx = idx;
//         }

//         @Override
//         public int compareTo(pair p2){
//             return p2.val - this.val;
//         }
//     }
//     public static void main(String args[]){
//         int num[] = {1,2,3,4,5,6,7,8};
//         int k = 3;

//         PriorityQueue<pair> pq = new PriorityQueue<>();

//         for(int i=0; i<k; i++){
//             pq.add(new pair(num[i], i));
//         }

//         int res[] = new int[num.length-k+1];

//         res[0] = pq.peek().val;

//         for(int i=k; i<num.length; i++){
//             while(pq.size()>0 && pq.peek().idx <= i-k){
//                 pq.remove();
//             }
//             pq.add(new pair(num[i],i));
//             res[i-k+1] = pq.peek().val;
//         }
    
//         for(int i=0; i<res.length; i++){
//             System.out.println(res[i]);
//         }
//     }
// }


// import java.util.*;
// public class p{
//     static class maxHeap{
        
//         ArrayList<Integer> arr = new ArrayList<>();

//         public void add(int data){
//             arr.add(data);

//             int x =  arr.size()-1;
//             int par = (x-1)/2;

//             while(arr.get(x) > arr.get(par)){
//                 int temp = arr.get(x);
//                 arr.set(x, arr.get(par));
//                 arr.set(par, temp);

//                 x = par;
//                 par = (x-1)/2;
//             }
//         }

//         public int peek(){
//             return arr.get(0);
//         }

//         public void heapify(int i){
//             int left = 2*i+1;
//             int right = 2*i+2;
//             int maxIdx = i;

//             if(left < arr.size() && arr.get(maxIdx) < arr.get(left)){
//                 maxIdx = left;
//             }
//             if(right < arr.size() && arr.get(maxIdx) < arr.get(right)){
//                 maxIdx = right;
//             }

//             if(maxIdx != i){
//                 int temp = arr.get(i);
//                 arr.set(i, arr.get(maxIdx));
//                 arr.set(maxIdx, temp);

//                 heapify(maxIdx);
//             }
//         }
//         public int remove(){
//             int data = arr.get(0);

//             int n = arr.size()-1;
//             int temp = arr.get(0);
//             arr.set(0,arr.get(n));
//             arr.set(n, temp);

//             arr.remove(n);
            
//             heapify(0);
//             return data;
//         }

//         public boolean isEmpty(){
//             return arr.size() == 0;
//         }
//     }
//     public static void main(String args[]){
//         maxHeap pq = new maxHeap();

//         pq.add(9);
//         pq.add(4);
//         pq.add(2);
//         pq.add(7);

//         while(!pq.isEmpty()){
//             System.out.print(pq.peek()+" ");
//             pq.remove();
//         }

//     }
// }



// import java.util.*;
// public class p{
    
//     PriorityQueue<Integer> minHeap = new PriorityQueue<>();
//     public int add(int num, int k){
        
//         if(minHeap.size()<k){
//             minHeap.add(num);
//             return minHeap.size() == k ? minHeap.peek(): -1;
//         }

//         if(num > minHeap.peek()){
//             minHeap.remove();
//             minHeap.add(num);
//         }

//         return minHeap.peek();
//     }

//     public static void main(String args[]){
//         int arr[] = {10,20,11,70,50,40,100};
//         int k = 3;

//         p a = new p();

//         for(int i=0; i<arr.length; i++){
//             System.out.println(a.add(arr[i],k));
//         }

//     }
// }


// Minimum time required to fill given N slots

// import java.util.*;
// public class p{

//     public static void minTime(int arr[], int N, int K){

//         Queue<Integer> q = new LinkedList<>();

//         boolean vis[] = new boolean[N];
//         int time = 0;

//         for(int i=0; i<K; i++){
//             q.add(arr[i]);
//             vis[arr[i]] = true;
//         }

//         while(q.size() > 0){
//             for(int i=0; i<q.size(); i++){
//                 int curr = q.poll();

//                 if(curr-1 >= 1 && !vis[curr-1]) {
//                     q.add(curr-1);
//                     vis[curr-1] = true;
//                 }

//                 if(curr+1 <=N && !vis[curr+1]){
//                     q.add(curr+1);
//                     vis[curr+1] = true;
//                 }
//             }
//             time++;
//         }

//         System.out.println(time-1);
//     }
//     public static void main(String args[]){
//         int N = 6;
//         int arr[] = {2, 6};
//         int K = arr.length;

//         minTime(arr, N, K); 
//     }
// }


import java.util.*;
public class p{
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String args[]){
        
        
    }
} 