import java.util.*;

public class Bellman_Ford_Algo{
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    // static void createGraph(ArrayList<Edge>[] graph){
    //     for(int i=0; i<graph.length; i++){
    //         graph[i] = new ArrayList<>();
    //     }  

    //     graph[0].add(new Edge(0, 1, 2));
    //     graph[0].add(new Edge(0, 2, 4));

    //     graph[1].add(new Edge(1, 2, -4));

    //     graph[2].add(new Edge(2, 3, 2));

    //     graph[3].add(new Edge(3, 4, 4));

    //     graph[4].add(new Edge(4, 1, -1));
    // }

    static void createGraph2(ArrayList<Edge> graph){

        graph.add(new Edge(0, 1, 2));
        graph.add(new Edge(0, 2, 4));
        graph.add(new Edge(1, 2, -4));
        graph.add(new Edge(2, 3, 2));
        graph.add(new Edge(3, 4, 4));
        graph.add(new Edge(4, 1, -1));
    }

    // public static void bellmanFord(ArrayList<Edge>[]graph, int src){
    //     int[] dis = new int[graph.length];
        
    //     for(int i=0; i<dis.length; i++){
    //         if(i!=src){
    //             dis[i] = Integer.MAX_VALUE;
    //         }
    //     }

    //     int V = graph.length;
    //     //0(V*E)
    //     //Algorithm - O(V)
    //     for(int i=0; i<V-1; i++){
    //         // edges - O(E)
    //         for(int j=0; j<graph.length; j++){
    //             for(int k=0; k<graph[j].size(); k++){
    //                 Edge e = graph[j].get(k);

    //                 //u, v, wt
    //                 int u = e.src;
    //                 int v = e.dest;
    //                 int wt = e.wt;

    //                 //relaxation
    //                 if(dis[u] != Integer.MAX_VALUE && dis[u] + wt < dis[v]){
    //                     dis[v] = dis[u] + wt;
    //                 }
    //             }
    //         }
    //     }

    //     for(int i=0; i<dis.length; i++){
    //         System.out.print(dis[i]+" ");
    //     }
    //     System.out.println();
    // }

    public static void bellmanFord(ArrayList<Edge> graph, int src, int V){
        int[] dis = new int[V];
        
        for(int i=0; i<dis.length; i++){
            if(i!=src){
                dis[i] = Integer.MAX_VALUE;
            }
        }

        for(int i=0; i<V-1; i++){
            // edges - O(E)
            for(int j=0; j<graph.size(); j++){
                    Edge e = graph.get(j);

                    //u, v, wt
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;

                    //relaxation
                    if(dis[u] != Integer.MAX_VALUE && dis[u] + wt < dis[v]){
                        dis[v] = dis[u] + wt;
                    }
                }
            }

        for(int i=0; i<dis.length; i++){ 
            System.out.print(dis[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int V = 6;
        // ArrayList<Edge>[] graph = new ArrayList[V];

        ArrayList<Edge> graph = new ArrayList<>();
      
        createGraph2(graph);
        bellmanFord(graph, 0, V);
    
    }
}



