// import java.util.*;
// public class PracticeSet {
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

//     static void createGraph(ArrayList<Edge>[]graph){
//         for(int i=0; i<graph.length; i++){
//             graph[i] = new ArrayList<>();
//         }

//         graph[0].add(new Edge(0, 2, 1));
//         graph[0].add(new Edge(0, 3, 1));
//         graph[1].add(new Edge(1, 0, 1));
//         graph[3].add(new Edge(3, 4, 1));
//     }

//     static void findMothervertex(ArrayList<Edge>[]graph, int N){
//         Stack<Integer> s = new Stack<>();
//         boolean[] vis = new boolean[N];

//         for(int i=0; i<graph.length; i++){
//             if(!vis[i]){
//                 dfs(graph, vis, i, s);
//             }
//         }

//         int ans = s.pop();
//         vis = new boolean[N];
//     }

//     static void dfs(ArrayList<Edge>[] graph, boolean[]vis, int curr, Stack<Integer> s){
//         vis[curr] = true;

//         for(int i=0; i<graph[curr].size(); i++){
//             Edge e = graph[curr].get(i);

//             if(!vis[e.dest]){
//                 dfs(graph, vis, e.dest, s);
//             }
//             s.push(curr);
//         }
//     }

    
//     public static void main(String args[]){
//     int V = 4;
//     ArrayList<Edge>[]graph = new ArrayList[V]; 
//     createGraph(graph);

//     }
// }


import java.util.*;
public class PracticeSet{
    static void addEdge(int u, int v, ArrayList<ArrayList<Integer>>adj){
        adj.get(u).add(v);
    }

    static void DFSUtil(ArrayList<ArrayList<Integer>> g, int v, boolean[]vis){
        vis[v] = true;

        for(int x: g.get(v)){
            if(!vis[x]){
                DFSUtil(g, v, vis);
            }
        }
    }

    static int MotherVertex(ArrayList<ArrayList<Integer>> g, int V){
        boolean[]vis = new boolean[V];
        int v = -1;

        for(int i=0; i<V; i++){
            if(!vis[i]){
                DFSUtil(g, i, vis);
                v=i;
            }
        }

        boolean[] check = new boolean[V];
        DFSUtil(g, v, check);
    }
public static void main(String args[]){


}
}