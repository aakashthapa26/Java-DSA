// import java.util.*;
// public class a{
//     static class Edge{
//         int src;
//         int dest;

//         public Edge(int s, int d){
//             this.src = s;
//             this.dest = d;
//         }
//     }

//     static void createGraph(ArrayList<Edge> []graph){
//         for(int i=0; i<graph.length; i++){
//             graph[i] = new ArrayList<>();
//         }

//         graph[0].add(new Edge(0, 1));
//         graph[0].add(new Edge(0, 2));

//         graph[1].add(new Edge(1, 0));
//         graph[1].add(new Edge(1, 3));

//         graph[2].add(new Edge(2, 0));
//         graph[2].add(new Edge(2, 4));

//         graph[3].add(new Edge(3, 1));
//         graph[3].add(new Edge(3, 4));

//         graph[4].add(new Edge(4, 2));
//         graph[4].add(new Edge(4, 3));

//     }

//     static boolean isBipartite(ArrayList<Edge>[]graph){
//         int [] col = new int[graph.length];
//         for(int i=0; i<graph.length; i++){
//             col[i] = -1;
//         }

//         Queue<Integer> q = new LinkedList<>();

//         for(int i=0; i<graph.length; i++){
//             if(col[i] == -1){
//                 col[i] = 0;
//                 q.add(i);

//                 while(!q.isEmpty()){
//                     int curr = q.remove();

//                     for(int j=0; j<graph[curr].size(); j++){
//                         Edge e = graph[curr].get(j);

//                         if(col[e.dest] == -1){
//                             int nextCol = col[curr] == 0 ? 1: 0;
//                             col[e.dest] = nextCol;
//                             q.add(nextCol);
//                         } 
//                         else if(col[curr] == col[e.dest]){
//                             return false;
//                         }
//                     }
//                 }
//             }
//         }
//         return true;
//     }
// public static void main(String args[]){
//     /*  
//             1 ---- 3
//            /       | \
//           0        |   5 -- 6
//            \       | 
//             2 ---- 4
//       */

//       int V= 7;
//       ArrayList<Edge>[] graph = new ArrayList[V];
//       createGraph(graph);

//       System.out.print(isBipartite(graph));

// }

// }






import java.util.*;
public class a{
    static class Edge{
        int src;
        int dest;

        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

    static void createGraph(ArrayList<Edge> []graph){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));

    }

    static boolean detectCycle(ArrayList<Edge>[]graph){
        boolean[]vis = new boolean[graph.length];

        for(int i=0; i<graph.length; i++){
            if(!vis[i]){
                if(detectCycleUtil(graph,vis, i, i-1)){
                    return true;
                }
            }
        }
        return false;
    }

    static boolean detectCycleUtil(ArrayList<Edge>[]graph, boolean[]vis, int curr, int par){
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            if(!vis[e.dest] && detectCycleUtil(graph, vis, e.dest, curr)){
                return true;
            }

            else if(vis[e.dest] && e.dest != par){   
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        /*  
                1 ---- 3
               /       | \
              0        |   5 -- 6
               \       | 
                2 ---- 4
          */
    
          int V= 7;
          ArrayList<Edge>[] graph = new ArrayList[V];
          createGraph(graph);
    
          System.out.print(detectCycle(graph));
    
    
    }
    
    }