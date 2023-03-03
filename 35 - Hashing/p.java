

// import java.util.*;
// public class p{
// public static void main(String args[]){
    
//     int num[] = {4,3,2,5,6,7,3,4,2,1};

//     HashSet<Integer> set = new HashSet<>();

//     for(int i=0; i<num.length; i++){
//         set.add(num[i]);
//     }

//     System.out.println(set);
// }
// }

// import java.util.*;
// public class p{
// public static void main(String args[]){
//     int arr[] = {10,2,-2,-20,10};
//         int k = -10;

//     Map<Integer, Integer> map = new HashMap<>();

//     int sum = 0;
//     int ans = 0;

//     map.put(0,1);

//     for(int j=0; j<arr.length; j++){
//         sum += arr[j];
//         if(map.containsKey(sum-k)){
//             ans += map.get(sum-k);
//         }
//         map.put(sum, map.getOrDefault(sum, 0)+1);
//     }

//     System.out.println(ans);
// }
// }


// import java.util.*;
// public class p{
//     static String frequencySort(String s){
//         Map<Character, Integer> map = new HashMap<>();

//         for(int i=0; i<s.length(); i++){
//             char ch = s.charAt(i);
//             map.put(ch, map.getOrDefault(ch, 0)+1);
//         }

//         PriorityQueue<Map.Entry<Character, Integer>> pq = 
//         new PriorityQueue<>((a,b)->a.getValue() == b.getValue()?
//         a.getKey()-b.getKey() : b.getValue() - a.getValue());

//         for(Map.Entry<Character, Integer> e: map.entrySet()) {
//             pq.add(e);
//         }

//         StringBuilder res = new StringBuilder();
//         while(pq.size()!=0){
//             char ch = pq.poll().getKey();
//             int val = map.get(ch);
//             while(val!=0){
//                 res.append(ch);
//                 val--;
//             }
//         }
//         return res.toString();
//     }
//     public static void main(String args[]){
//         String s = "cclndaa";

//         String ans = frequencySort(s);

//         System.out.println(ans);
//     }
// }


import java.util.*;
public class p{
    public static void main(String args[]){
        int arr[] = {10,2,-2,-20,10};
        int k = -10;

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int len = 0;

        for(int j=0; j<arr.length; j++){
            sum += arr[j];
            if(map.containsKey(sum-k)){
                len = Math.max(len, j-map.get(sum-k));
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }

        System.out.println(len);
    }
}