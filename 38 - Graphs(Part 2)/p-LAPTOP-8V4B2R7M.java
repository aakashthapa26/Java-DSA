// // import java.util.*;
// // public class p {
// //     static class Edge{
// //         int scr;
// //         int dest;

// //         public Edge(int scr, int dest){
// //             this.scr = scr;
// //             this.dest = dest;
// //         }
// //     }

// //     public static void createGraph(ArrayList<Edge>[] graph){
// //         for(int i=0; i<graph.length; i++){
// //             graph[i] = new ArrayList<>();
// //         }

// //         graph[0].add(new Edge(0, 1));
// //         graph[0].add(new Edge(0, 2));
// //         graph[0].add(new Edge(0, 3));

// //         graph[1].add(new Edge(1, 0));
// //         graph[1].add(new Edge(1, 2));

// //         graph[2].add(new Edge(2, 0));
// //         graph[2].add(new Edge(2, 1));

// //         graph[3].add(new Edge(3, 0));
// //         graph[3].add(new Edge(3, 4));

// //         graph[4].add(new Edge(4, 3));

// //     }

// //     public static boolean cycleDetection(ArrayList<Edge> [] graph){
// //         boolean[] vis = new boolean[graph.length];

// //         for(int i=0; i<graph.length; i++){
// //             if(!vis[i]){
// //                 if(cycleDetectionUtil(graph, vis, i, i-1)){
// //                     return true;
// //                 }
// //             }
// //         }
// //         return false;
// //     }

// //     public static boolean cycleDetectionUtil(ArrayList<Edge>[] graph, boolean[]vis, int curr, int par){
// //         vis[curr] = true;

// //         for(int i=0; i<graph[curr].size(); i++){
// //             Edge e = graph[curr].get(i);
            
// //             if(!vis[e.dest] && cycleDetectionUtil(graph, vis, e.dest, curr)){
// //                 return true;
// //             }

// //             else if(vis[e.dest] && e.dest != par){
// //                 return true;
// //             }
// //         }
// //         return false;
// //     }
// //     public static void main(String args[]){
// //         int vertices = 7;
// //         ArrayList<Edge> [] graph = new ArrayList[7];
// //         createGraph(graph);
        
        
// //         if(cycleDetection(graph)){
// //             System.out.println("Cycle Exists");
// //         } 
// //         else{
// //             System.out.println("Cycle doesn't Exist");
// //         }
// //     }
// // }


// // import java.util.*;
// // public class p {
// //     static class Edge{
// //         int scr;
// //         int dest;

// //         public Edge(int scr, int dest){
// //             this.scr = scr;
// //             this.dest = dest;
// //         }
// //     }

// //     public static void createGraph(ArrayList<Edge>[] graph){
// //         for(int i=0; i<graph.length; i++){
// //             graph[i] = new ArrayList<>();
// //         }

// //         graph[0].add(new Edge(0, 1));
// //         graph[0].add(new Edge(0, 3));

// //         graph[1].add(new Edge(1, 0));
// //         graph[1].add(new Edge(1, 2));

// //         graph[2].add(new Edge(2, 1));

// //         graph[3].add(new Edge(3, 0));
// //         graph[3].add(new Edge(3, 4));

// //         graph[4].add(new Edge(4, 3));

// //     }

// //     //O(V+E)
// //     public static boolean cycleDetection(ArrayList<Edge> [] graph){
// //         boolean[] vis = new boolean[graph.length];

// //         for(int i=0; i<graph.length; i++){
// //             if(!vis[i]){
// //                 if(cycleDetectionUtil(graph, vis, i, i-1)){
// //                     return true;
// //                 }
// //             }
// //         }
// //         return false;
// //     }

// //     public static boolean cycleDetectionUtil(ArrayList<Edge>[] graph, boolean[]vis, int curr, int par){
// //         vis[curr] = true;

// //         for(int i=0; i<graph[curr].size(); i++){
// //             Edge e = graph[curr].get(i);
            
// //             if(!vis[e.dest]){
// //                 if(cycleDetectionUtil(graph, vis, e.dest, curr)){
// //                     return true;
// //                 }
                    
// //             }

// //             else if(vis[e.dest] && e.dest != par){
// //                 return true;
// //             }
// //         }
// //         return false;
// //     }  
// //     public static void main(String args[]){
// //         int vertices = 7;
// //         ArrayList<Edge> [] graph = new ArrayList[7];
// //         createGraph(graph);
        
        
// //         if(cycleDetection(graph)){
// //             System.out.println("Cycle Exists");
// //         } 
// //         else{
// //             System.out.println("Cycle doesn't Exist");
// //         }
// //     }
// // }


// import java.util.*;
// public class p{
//     static class Edge{
//         int scr;
//         int dest;

//         public Edge(int scr, int dest){
//             this.scr = scr;
//             this.dest = dest;
//         }
//     }

//     static void createGraph(ArrayList<Edge>[] graph){
//         for(int i=0; i<graph.length; i++){
//             graph[i] = new ArrayList<>();
//         }
    
//     graph[0].add(new Edge(0, 2));

//     graph[1].add(new Edge(1, 0));

//     graph[2].add(new Edge(2, 3));

//     graph[3].add(new Edge(3, 0));

//     }

//     static boolean CycleDetection(ArrayList<Edge>[] graph){
//         boolean []vis = new boolean[graph.length];

//         for(int i=0; i<graph.length; i++){
//             if(!vis[i]){
//                 if(CycleDetectionUtil(graph, vis, i, i-1)){
//                     return true;
//                 }
//             }
//         }
//     }

//     public static boolean CycleDetectionUtil(ArrayList<Edge>[] graph, boolean[]vis, int curr, int par){
//         vis[curr] = true;

//         for(int i=0; i<graph[curr].size(); i++){
//             Edge e = graph[curr].get(i);
            
//         }
//     }
//     public static void main(String args[]){

//         int V = 5;
//         ArrayList<Edge>[] graph = new ArrayList[V];
//     }
// }


import java.util.*;
public class p{
    static class Edge{
        int scr;
        int dest;

        public Edge(int s, int d){
            this.scr = s;
            this.dest = d;
        }
    }

    static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));

    }

    static boolean cycleDetection(ArrayList<Edge> [] graph){
        boolean[]vis = new boolean[graph.length];
        
        for(int i=0; i<graph.length; i++){
            if(!vis[i]){
                if(cycleDetectionUtil(graph, vis, i, i-1)){
                    return true;
                }
            }
        }
        return false;
    }

    static boolean cycleDetectionUtil(ArrayList<Edge>[] graph, boolean[]vis, int curr, int par){
        vis[curr] = true;
        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            if(!vis[e.dest] && cycleDetectionUtil(graph, vis, e.dest, curr)){
                return true;
            }
            else if(vis[e.dest] && e.dest!= par){
                return true;
            }
        }
        return false;
    }
public static void main(String args[]){

    int V = 5;
    ArrayList<Edge> [] graph = new ArrayList[V];

    createGraph(graph);

    System.out.println(cycleDetection(graph));

}
}