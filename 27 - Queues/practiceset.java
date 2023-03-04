// 1. Generate Binary Numbers

// import java.util.*;
// public class practiceset {
//     public static void generateBinaryNumber(int n){
//         Deque<String> d = new LinkedList<>();
//         d.addLast("1");
//         while(n--> 0){
//             String BinaryNumber = d.removeFirst();
//             System.out.println(BinaryNumber);

//             d.addLast(BinaryNumber+"0");
//             d.addLast(BinaryNumber+"1");
//         }
//     }
// public static void main(String args[]){
//    int n = 2;
//    generateBinaryNumber(n);   

// }

// }


// 2. Connect N ropes with minimum cost

// import java.util.*;
// public class practiceset {
//     public static int minimumCost(int arr[]){
//         PriorityQueue<Integer> q = new PriorityQueue<>();
//         for(int i=0; i<arr.length; i++) {
//             q.add(arr[i]);
//         }

//         int ans = 0;
//         while(q.size() > 1){
//             int first = q.remove();
//             int second = q.remove();
//             int sum = first + second;
//             ans += sum;
//             q.add(sum);
//         }
//         return ans;
//     }
// public static void main(String args[]){
//    int arr[] = {4,3,2,6};    
//    System.out.println(minimumCost(arr)); 

// }

// }


// // 3. Job Sequencing Problem

// import java.util.*;
// public class practiceset {
//     static class Job{
//         char job_id;
//         int deadline;
//         int profit;

//         Job(char job_id, int deadline, int profit) {
//             this.job_id = job_id;
//             this.deadline = deadline;
//             this.profit = profit;
//         }
//     }

//     static void printJobScheduling(ArrayList<Job> arr, int t){

//         // Length of array
//         int n = arr.size();

//         // Sort all jobs according to decreasing order of profit.
//         Collections.sort(arr, (a,b) -> b.profit - a.profit);

//         // To keep track of free time slots
//         boolean result[] = new boolean[t];

//         // To store result (Sequence of Jobs)
//         char Job[] = new char[t];
         
//     }
// public static void main(String args[]){
//    ArrayList<Job> arr = new ArrayList<>();

//    arr.add(new Job('a',2,100));
//    arr.add(new Job('b',1,19));
//    arr.add(new Job('c',2,27));
//    arr.add(new Job('d',1,25));

// }

// }



// 4. Reversing the first K elements of a Queue

// import java.util.*;
// public class practiceset {
//     public static void reverse(Deque<Integer> q, int k){
//         Deque<Integer> a = new LinkedList<>();
        
//         for(int i=0; i<k; i++){
//             a.addLast(q.removeFirst());
//         }

//         while(!a.isEmpty()){
//             q.addFirst(a.removeFirst());
//         }
//     }
// public static void main(String args[]){
//    Deque<Integer> q = new LinkedList<>();
//    q.add(10);
//    q.add(20);
//    q.add(30);
//    q.add(40);
//    q.add(50);
//    q.add(60);
//    q.add(70);
//    q.add(80);
//    q.add(90);
//    q.add(100);

//    System.out.println(q);

//    int k = 5;

//    reverse(q, k);
   
//    System.out.println(q);

// }

// }



// Reverse a String from index i to j and add into origin String;

// import java.util.*;
// public class practiceset {
//     public static String reverse(String s, int i, int j) {
//         Stack<Character> st = new Stack<>();
//         int n = s.length();
//         for(int x = i; x<=j ; x++){
//             st.push(s.charAt(x));
//         } 

//         StringBuffer result = new StringBuffer("");
//         for(int y = 0; y<n; y++) {
//             while(y>0 && y<=j) { 
//                 result.append(st.pop());
//                 y++;
//             }
//             result.append(s.charAt(y));
//         }
//         return result.toString();
//     }
// public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     String s = sc.nextLine();
//     int i = 1;
//     int j = 7;

//     System.out.print(reverse(s,i,j));
// }
// }


// Maximum of all subarrays of size k  -- Anuj Bhaiya DSA 54

// 1. Brute Force 
// public class practiceset {
//     public static void printKMax(int arr[], int n, int k) {
//         int j, max;
//         for(int i=0; i<n-k+1; i++) {
//             max = arr[i];
            
//             for(j=1; j<k; j++) {
//                 if(arr[i+j] > max){
//                     max = arr[i+j];
//                 }
//             }
//             System.out.print(max+" ");
//         }
//     }
// public static void main(String args[]){
//     int arr[] = { 1, 2, 3, 1, 4, 5, 2, 3, 6};
//     int n = arr.length;
//     int k = 3;
//     printKMax(arr, n, k);
// }

// }



// 2. Optimized Sol --> Using Priority Queue 

public class practiceset {
public static void main(String args[]){
        

}

}