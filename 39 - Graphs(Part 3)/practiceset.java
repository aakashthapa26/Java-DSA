// // import java.util.*;
// // public class practiceset{
// //     static class Edge{
// //         int scr;
// //         int dest;


// //         Edge(int s, int d){
// //             this.scr = s;
// //             this.dest = d;
// //         }
// //     }

// //     static void createGraph(ArrayList<Edge>[] graph){
// //         for(int i=0; i<graph.length; i++){
// //             graph[i] = new ArrayList<>();
// //         }

// //         graph[1].add(new Edge(1, 9));
// //         graph[1].add(new Edge(1, 5));

// //         graph[9].add(new Edge(9, 5));
// //         graph[5].add(new Edge(5, 2));

// //         graph[2].add(new Edge(2, 4));
// //     }

// //     class Node{
// //         int src;
// //         int par;

// //         Node(int src, int par){
// //             this.src = src;
// //             this.par = par;
// //         }
// //     }

// //     class solution{

// //         static boolean checkForCycle(Array)
// //     }
// //     public static boolean isCycle(ArrayList<Edge>[]graph){


// //     }
// //     public static void main(String args[]){
// //         int V = 5;
// //         ArrayList<Edge>[] graph = new ArrayList[V];
// //         createGraph(graph);

// //         isCycle(graph);

// //     }
// // }


//2. Minimum Depth of a Binary Tree

// import java.util.*;
// public class practiceset{
//     static class Node{
//         int data;
//         Node left, right;

//         Node(int data){
//             this.data = data;
//         }
//     }

//     static class pair{
//         Node node;
//         int depth;

//         pair(Node node, int depth){
//             this.node = node;
//             this.depth = depth;
//         }
//     }

//     static int minDepth(Node root){
//         if(root == null){
//             return 0;
//         }

//         Queue<pair> q = new LinkedList<>();
//         q.add(new pair(root, 1));

//         while(!q.isEmpty()){
//             pair qi = q.remove();
//             Node node = qi.node;
//             int depth = qi.depth;

//             if(node.left == null && node.right == null){
//                 return depth;
//             }

//             if(node.left != null){
//                 qi.node = node.left;
//                 qi.depth = depth+1;
//                 q.add(qi);
//             }

//             if(node.right != null){
//                 qi.node = node.right;
//                 qi.depth = depth+1;
//                 q.add(qi);
//             }

//         }
//         return 0;
//     }
// public static void main(String args[]){

//         Node root = new Node(1);
// 		root.left = new Node(2);
// 		root.right = new Node(3);
// 		root.left.left = new Node(4);
// 		root.left.right = new Node(5);
       
//         System.out.print(minDepth(root));
// }
// }


//3. --> source - take u forward channel

// import java.util.*;
// public class practiceset{
    
//     static class pair{
//         int row;
//         int col;
//         int tm;

//         pair(int row, int col, int tm){
//             this.row = row;
//             this.col = col;
//             this.tm = tm;
//         }
//     }

//     static int orangesRotting(int[][]grid){
//         int n = grid.length;
//         int m = grid[0].length;

//         Queue<pair> q = new LinkedList<>();

//         int [][] vis = new int[n][m];
//         int cntFresh = 0;

//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 if(grid[i][j] == 2){
//                     q.add(new pair(i, j, 0));
//                     vis[i][j] = 2;
//                 }

//                 else{
//                     vis[i][j] = 0;
//                 }

//                 if(grid[i][j] == 1) cntFresh++;
//             }
//         }

//         int tm = 0;
//         int drow[] = {-1, 0, +1, 0};
//         int dcol[] = {0, 1, 0, -1};
//         int cnt = 0;
//         while(!q.isEmpty()){
//             int r = q.peek().row;
//             int c = q.peek().col;
//             int t = q.peek().tm;

//             tm = Math.max(tm, t);
//             q.remove();
//             for(int i=0; i<4; i++){
//                 int nrow = r + drow[i];
//                 int ncol = c + dcol[i];
//                 if(nrow >=0 && nrow < n && ncol >= 0 && ncol < m 
//                     && vis[nrow][ncol] == 0 && grid[nrow][ncol] == 1){
//                         q.add(new pair(nrow, ncol, t + 1));
//                         vis[nrow][ncol] = 2;
//                         cnt++;
//                     }
//             }
//         }
//         if(cnt != cntFresh) return -1;
//         return tm;
//     }
// public static void main(String args[]){
//     int[][] grid = {{2,1,0,2,1},
//                  {0,0,1,2,1},
//                  {1,0,0,2,1}};


//     System.out.print(orangesRotting(grid));
// }
// }


//4. Find the size of the largest region in the Boolean Matrix

import java.util.*;
public class practiceset{

    public class solution{
        static int Row, col, count;

        static boolean isSafe(int [][]m, int row,)
    }
public static void main(String args[]){



}
}

