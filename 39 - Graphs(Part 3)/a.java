// // import java.util.*;
// // public class a{
// //     static class Edge{
// //         int src;
// //         int dest;
// //         int wt;

// //         Edge(int s, int d, int w){
// //             this.src = s;
// //             this.dest = d;
// //             this.wt = w;
// //         }
// //     }

// //     static void createGraph(ArrayList<Edge>[]graph){
// //         for(int i=0; i<graph.length; i++){
// //             graph[i] = new ArrayList<>();
// //         }

// //         graph[0].add(new Edge(0, 1, 1));
// //         graph[0].add(new Edge(0, 2, 1));

// //         graph[1].add(new Edge(1, 0, 1));
// //         graph[1].add(new Edge(1, 3, 1));

// //         graph[2].add(new Edge(2, 0, 1));
// //         graph[2].add(new Edge(1, 4, 1));

// //         graph[3].add(new Edge(3, 1, 1));
// //         graph[3].add(new Edge(3, 4, 1));
// //         graph[3].add(new Edge(3, 5, 1));

// //         graph[4].add(new Edge(4, 2, 1));
// //         graph[4].add(new Edge(4, 3, 1));
// //         graph[4].add(new Edge(4, 5, 1));

// //         graph[5].add(new Edge(5, 3, 1));
// //         graph[5].add(new Edge(5, 4, 1));
// //         graph[5].add(new Edge(5, 6, 1));
// //         graph[5].add(new Edge(6, 5, 1));

// //     }

// //     static void bfs(ArrayList<Edge>[]graph){
// //         boolean[]vis = new boolean[graph.length];
// //         Queue<Integer> q = new LinkedList<>();

// //         q.add(0);

// //         while(!q.isEmpty()){
// //             int curr = q.remove();

// //             if(!vis[curr]){
// //                 vis[curr] = true;
// //                 System.out.print(curr+" ");
                
// //                 for(int i=0; i<graph[curr].size(); i++){
// //                     Edge e = graph[curr].get(i);
// //                     q.add(e.dest);
// //                 }
// //             }
// //         }
// //     }
// //     public static void main(String args[]){
// //         int V = 7;
// //         ArrayList<Edge>[]graph = new ArrayList[V];

// //         createGraph(graph);
// //         bfs(graph);
// //     }
// // }


// import java.util.*;
// public class a{
//     static class Edge{
//         int src;
//         int dest;
//         int wt;

//         Edge(int src, int dest, int wt){
//             this.src = src;
//             this.dest = dest;
//             this.wt = wt;

//         }
//     }

//     static class Pair implements Comparable<Pair>{
//         int n;
//         int path;

//         Pair(int n, int path){
//             this.n = n;
//             this.path = path;
//         }
//         @Override
//         public int compareTo(Pair p2){
//             return this.path-p2.path;
//         }
//     }

//     static void dijkstra(ArrayList<Edge>[]graph, int src){
//         int[] dis = new int[graph.length];
//         for(int i=0; i<graph.length; i++){
//             if(i != src){
//                 dis[i] = Integer.MAX_VALUE;
//             }
//         }

//         PriorityQueue<Pair> pq = new PriorityQueue<>();
//         boolean[]vis = new boolean[graph.length];

//         pq.add(new Pair(src, 0));

//         while(!pq.isEmpty()){
//             Pair curr = pq.remove();

//             if(!vis[curr.n]){
//                 vis[curr.n] = true;
//                 for(int i=0; i<graph[curr.n].size(); i++){
//                     Edge e = graph[curr.n].get(i);

//                     int u = e.src;
//                     int v = e.dest;
//                     int wt = e.wt;

//                     if(dis[u]+wt < dis[v]){
//                         dis[v] = dis[u]+wt;
//                         pq.add(new Pair(v, dis[v]));

//                     }
//                 }
//             }
//         }

//         for(int i=0; i<dis.length; i++){
//             System.out.print(dis[i]+" ");
//         }
//     }

//     static void createGraph(ArrayList<Edge>[]graph){
//         for(int i=0; i<graph.length; i++){
//             graph[i] = new ArrayList<>();
//         }

//         graph[0].add(new Edge(0, 1, 2));
//         graph[0].add(new Edge(0, 2, 4));

//         graph[1].add(new Edge(1, 3, 7));
//         graph[1].add(new Edge(1, 2, 1));

//         graph[2].add(new Edge(2, 4, 3));
//         graph[3].add(new Edge(3, 5, 1));

//         graph[4].add(new Edge(4, 3, 2));
//         graph[4].add(new Edge(4, 5, 5));

//     }

//     public static void main(String args[]){
//         int V = 6;
//         ArrayList<Edge>[] graph = new ArrayList[V];

//         createGraph(graph);
//         dijkstra(graph, V);

//     }
// }



public class a{
    public static void main(String[] args){
        int a = 5;

        System.out.println(a);
    }
}