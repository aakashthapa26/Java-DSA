// import java.util.*;
// public class Connect_N_Ropes {
//     public static void main(String args[]){
//         int ropes[] = {2, 3, 3, 4, 6};

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
//         System.out.println("cost of connecting n ropes = " + cost);
//     } 
// }


import java.util.*;
public class Connect_N_Ropes{
    public static void main(String args[]){
        int ropes[] = {6, 2, 3, 4, 3};

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<ropes.length; i++){
            pq.add(ropes[i]);
        }

        int cost = 0;
        while(pq.size()>1){
            int min = pq.remove();
            int min2 = pq.remove();

            cost += (min+min2);

            pq.add(min+min2);
        }

        System.out.print("Total cost is: "+cost);
    }
}