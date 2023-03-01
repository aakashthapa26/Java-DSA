// Nearby Cars

// import java.util.*;
// public class b {
//     static class point implements Comparable<point>{
//         int x;
//         int y;
//         int distSq;
//         int idx;

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
//         int pts[][] = {{3, 3},{5,-1},{-2,4}};
//         int k = 2;

//         PriorityQueue<point> pq = new PriorityQueue<>();
//         for(int i=0; i<pts.length; i++){
//             int distSq = pts[i][0]*pts[i][0] + pts[i][1]*pts[i][1];
//             pq.add(new point(pts[i][0], pts[i][1], distSq, i));
//         }

//         for(int i=0; i<k; i++){
//             System.out.print("C"+pq.remove().idx+" ");
//         }
//     }
// }



// Connect N Ropes with Minimum Cost

// import java.util.*;
// public class b{
//     public static void main(String args[]){
//         int ropes[] = {4, 3, 2, 6};

//         PriorityQueue<Integer> pq = new PriorityQueue<>();
//         for(int i=0; i<ropes.length; i++){
//             pq.add(ropes[i]);
//         }

//         int cost = 0;
//         while(pq.size() > 1){
//             int min = pq.remove();
//             int min2 = pq.remove();
        
//             cost += min+min2;

//             pq.add(min+min2);
//         }

//         System.out.print("Minimum Cost will be: Rs "+cost);
//     }
// }



// Weakest Soldiers

// import java.util.*;
// public class b{
//     static class Row implements Comparable<Row>{
//         int soldier;
//         int idx;

//         Row(int soldier, int idx){
//             this.soldier = soldier;
//             this.idx = idx;
//         }

//         @Override
//         public int compareTo(Row r2){
//             if(this.soldier == r2.soldier){
//                 return this.idx - r2.idx;
//             }
//             else{
//                 return this.soldier - r2.soldier; 
//             }
//         }
//     }
//     public static void main(String args[]){
//         int pts[][]= {{1,0,0,0}, {1,1,1,1}, {1,1,0,0}, {1, 0, 0, 0}};
//         int k = 2;

//         PriorityQueue<Row> pq = new PriorityQueue<>();
//         for(int i=0; i<pts.length; i++){
//             int count = 0;
//             for(int j=0; j<pts[0].length; j++){
//                 count += pts[i][j] == 1 ? 1 : 0;
//             }
//             pq.add(new Row(count , i));
//         }

//         for(int i=0; i<k; i++){
//             System.out.print("R"+pq.remove().idx+" ");
//         }
//     }
// }


// import java.util.*;
// public class b{
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
//         int arr[] = {2,4,1,5,8,-3,7};
//         int k = 3;

//         PriorityQueue<pair> pq = new PriorityQueue<>();
//         for(int i=0; i<k; i++){
//             pq.add(new pair(arr[i], i));
//         }

//         int res[] = new int[arr.length-k+1];
//         res[0] = pq.peek().val;

//         for(int i=k; i<arr.length; i++){
//             while(pq.size() > 0 && pq.peek().idx <= (i-k)){
//                 pq.remove();
//             }
//             pq.add(new pair(arr[i], i));
//             res[i-k+1] = pq.peek().val;
//         }

//         for(int i=0; i<res.length; i++){
//             System.out.print(res[i]+" ");
//         }
//     }
// }



import java.util.*;
public class b{
    static class Row implements Comparable<Row>{
        int soldier;
        int idx;

        Row(int soldier, int idx){
            this.soldier = soldier;
            this.idx = idx;
        }
        @Override
        public int compareTo(Row r2){
            if(this.soldier == r2.soldier){
                return this.idx - r2.idx;
            }
            else{
                return this.soldier - r2.soldier;
            }
        }
    }
    public static void main(String args[]){
        int pts[][]= {{1,0,0,0}, 
                      {1,1,1,1}, 
                      {1,0,0,0}, 
                      {1,0,0,0}};
        int k = 2;

        PriorityQueue<Row> pq = new PriorityQueue<>();
        for(int i=0; i<pts.length; i++){
            int count = 0;
            for(int j=0; j<pts[0].length; j++){
                count += pts[i][j] == 1 ? 1 : 0;
             }
            pq.add(new Row(count, i));
        }

        for(int i=0; i<k; i++){
            System.out.println("R"+pq.remove().idx); 
        }

    }
}


 