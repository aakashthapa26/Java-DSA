// Generalized Form: 

import java.util.*;
public class  Largest_subarray_with_K_sum{
  public static void main(String args[]){
    int arr[] = {10,2,-2,-20,10};
    int k = -10;

    HashMap<Integer, Integer> map = new HashMap<>();

    int sum=0;
    int len=0;

    for(int j=0; j<arr.length; j++){
      sum+=arr[j];
      if(map.containsKey(sum-k)){
        len = Math.max(len, j-map.get(sum-k));
      }
      map.put(sum, j);
    }

    System.out.println("Largest subarray with sum as "+k+" = "+len);
  }

}



// Case : When k = 0;

// import java.util.*;
// public class Largest_subarray_with_K_sum {
//     public static void main(String args[]){
//            int arr[] = {15,-2,2,-8,1,7,10,23};
//            int k = 0;

//            HashMap<Integer, Integer> map = new HashMap<>();
//            //(sum, idx)

//            int sum = 0;
//            int len = 0;

//            for(int j=0; j<arr.length; j++){ //O(n)
//                 sum += arr[j];
//                 if(map.containsKey(sum)){
//                     len = Math.max(len, j-map.get(sum));
//                 }
//                 else{
//                     map.put(sum,j);
//                 }
//            }

//            System.out.println("Largest subarray with sum as 0 = "+ len);
//     }
// }
