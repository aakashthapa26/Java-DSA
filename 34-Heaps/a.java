

// // minHeap

// // import java.util.*;
// // public class a {
// //     static class Heap{
// //         ArrayList<Integer> arr = new ArrayList<>();

// //         public void add(int data){
// //             arr.add(data);

// //             int x = arr.size()-1;
// //             int par = (x-1)/2;

// //             while(arr.get(x) < arr.get(par)){
// //                 int temp = arr.get(x);
// //                 arr.set(x, arr.get(par));
// //                 arr.set(par, temp);

// //                 x = par;
// //                 par = (x-1)/2;
// //             }
// //         }

// //         public int peek(){
// //             return arr.get(0);
// //         }

// //         public void heapify(int i){
// //             int left = 2*i+1;
// //             int right = 2*i+2;
// //             int minIdx = i;

// //             if(left < arr.size() && arr.get(left) < arr.get(minIdx)){
// //                 minIdx = left;
// //             }

// //             if(right < arr.size() && arr.get(right) < arr.get(minIdx)){
// //                 minIdx = right;
// //             }

// //             if(minIdx != i){
// //                 int temp = arr.get(i);
// //                 arr.set(i, arr.get(minIdx));
// //                 arr.set(minIdx, temp);

// //                 heapify(minIdx);
// //             }
// //         }

// //         public int remove(){
// //             int data = arr.get(0);

// //             int temp = arr.get(0);
// //             arr.set(0, arr.get(arr.size()-1));
// //             arr.set(arr.size()-1, temp);

// //             arr.remove(arr.size()-1);

// //             heapify(0);
// //             return data;
// //         }

// //         public boolean isEmpty(){
// //             return arr.size() == 0;
// //         }
// //     }
// //     public static void main(String args[]){
// //         Heap h = new Heap();
// //         h.add(5);
// //         h.add(8);
// //         h.add(1);
// //         h.add(9);

// //         while(!h.isEmpty()){
// //             System.out.println(h.peek());
// //             h.remove();
// //         }


// //     }
// // }


// // public class a{

// //     public static void heapify(int arr[], int i, int size){
// //         int left = 2*i+1; 
// //         int right = 2*i+2;
// //         int maxIdx = i;

// //         if(left < size && arr[left] > arr[maxIdx]){
// //             maxIdx = left;
// //         }
// //         if(right < size && arr[right] > arr[maxIdx]){
// //             maxIdx = right;
// //         }

// //         if(maxIdx != i){
// //             int temp = arr[i];
// //             arr[i] = arr[maxIdx];
// //             arr[maxIdx] = temp;

// //             heapify(arr, maxIdx, size);
// //         }
// //     }

// //     public static void heapSort(int arr[]){
// //         int n = arr.length;
// //         for(int i=n/2; i>=0; i--){
// //             heapify(arr, i, n);
// //         }

// //         for(int i=n-1; i>=0; i--){
// //             int temp = arr[i];
// //             arr[i] = arr[0];
// //             arr[0] = temp;

// //             heapify(arr, 0, i);
// //         }
        
// //     }
// //     public static void main(String args[]){
// //         int arr[] = {2,8,10,5,3,4,6,7,1,9};
// //         heapSort(arr);

// //         for(int i=0; i<arr.length; i++){
// //             System.out.print(arr[i]+" ");
// //         }
// //     }
// // }


// import java.util.*;
// public class a{
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
//         int pts[][] = {{3,3},{5,-1},{-2,4}};
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


import java.util.*;
public class a{
    static class point implements Comparable<point>{
        int x;
        int y;
        int distSq;
        int idx;

        point(int x, int y, int distSq, int idx){
            this.x = x;
            this.y = y;
            this.distSq = distSq;
            this.idx = idx;
        }

        @Override
        public int compareTo(point p2){
            return this.distSq - p2.distSq;
        }
    }
    public static void main(String args[]){
        int pts[][] = {{3, 3}, {5, -1}, {-2, 4}};
        int k = 2;

        PriorityQueue<point> pq = new PriorityQueue<>();
        for(int i=0; i<pts.length; i++){
            int distSq = pts[i][0]*pts[i][0] + pts[i][1]*pts[i][1];
            pq.add(new point(pts[i][0], pts[i][1], distSq, i));
        }

        for(int i=0; i<k; i++){
            System.out.print("C"+pq.remove().idx+" ");
        }
    }
}