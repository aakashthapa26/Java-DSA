// import java.util.ArrayList;

// public class a{
//     public static void main(String args[]){
//         // Java Collection Framework
//         ArrayList<Integer> list = new ArrayList<>();
//         ArrayList<String> list2 = new ArrayList<>();
//         ArrayList<Boolean> list3 = new ArrayList<>();
//     }  
// }

// To Add Element

// import java.util.ArrayList;

// public class Operations {
//     public static void main(String args[]){
//         ArrayList<Integer> list = new ArrayList<>();
//         ArrayList<String> list2 = new ArrayList<>();
//         ArrayList<Boolean> list3 = new ArrayList<>();

//         list.add(1); // O(1)
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);
//         System.out.println(list);
//     }
// }

// To Get Element (Operation) - O(1)

// import java.util.ArrayList;

// public class Operations {
//     public static void main(String args[]){
//         ArrayList<Integer> list = new ArrayList<>();
//         ArrayList<String> list2 = new ArrayList<>();
//         ArrayList<Boolean> list3 = new ArrayList<>();

//         list.add(1); // O(1)
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);
//         System.out.println(list);

//         int element = list.get(2);
//         System.out.println(element);
//     }
// }

// Remove Element - O(n)

// import java.util.ArrayList;

// public class Operations {
//     public static void main(String args[]){
//         ArrayList<Integer> list = new ArrayList<>();
//         ArrayList<String> list2 = new ArrayList<>();
//         ArrayList<Boolean> list3 = new ArrayList<>();

//         list.add(1); // O(1)
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);
//         System.out.println(list);

//         list.remove(2);
//         System.out.println(list);

//     }
// }   

// Set Element at Index - O(n)

// import java.util.ArrayList;

// public class Operations {
//     public static void main(String args[]){
//         ArrayList<Integer> list = new ArrayList<>();
//         ArrayList<String> list2 = new ArrayList<>();
//         ArrayList<Boolean> list3 = new ArrayList<>();

//         list.add(1); // O(1)
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);
//         System.out.println(list);

//         list.set(2, 10);
//         System.out.println(list);

//     }
// }   


// Contains Element - O(n)  [Contains used to check whether element is present in ArrayList or not? Returns boolean]

// import java.util.ArrayList;

// public class Operations {
//     public static void main(String args[]){
//         ArrayList<Integer> list = new ArrayList<>();
//         ArrayList<String> list2 = new ArrayList<>();
//         ArrayList<Boolean> list3 = new ArrayList<>();

//         list.add(1); // O(1)
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);
//         System.out.println(list);

//         // contains
//         System.out.println(list.contains(1));
//         System.out.println(list.contains(11));
//     }
// }   

// Addition of number in between numbers

// import java.util.ArrayList;

// public class a {
//     public static void main(String args[]){
//         ArrayList<Integer> list = new ArrayList<>();

//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);

//         System.out.println(list);

//         list.add(1, 9);  // O(n)
//         System.out.println(list);
//     }
// }  

// Size of an ArrayList.

// import java.util.ArrayList;
// public class a {
//     public static void main(String args[]) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(1);
//         list.add(2);
//         list.add(3);

//         System.out.println(list.size());

//         // print the arrayList
//         for(int i = 0; i<list.size(); i++){ 
//             System.out.print(list.get(i) + " ");
//         }
//         System.out.println();
//     }     
// }

//  Print Reverse of an ArrayList

// import java.util.ArrayList;
// public class a {
//     public static void main(String args[]) {

//         ArrayList<Integer> list = new ArrayList<>();

//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);

//         // Reverse Print - O(n)
//         for(int i = list.size()-1; i>=0; i--){
//             System.out.print(list.get(i)+ " ");
//         }
//         System.out.println();
//     }    
// }  
 
//  Maximum In an ARRAY - O(n)

// import java.util.ArrayList;

// public class Maximum_in_anArrayList {
//     public static void main(String args[]) {

//             ArrayList<Integer> list = new ArrayList<>();

//             list.add(2);
//             list.add(5);
//             list.add(9);
//             list.add(6);
//             list.add(8);

//             int max = Integer.MIN_VALUE;
//             for(int i = 0; i<list.size(); i++){
//                 // if(max < list.get(i)){
//                 //     max = list.get(i);
//                 // }

//                 max = Math.max(max, list.get(i));
//             }
//             System.out.println("max element = "+max);
//     }
// }

// import java.util.ArrayList;

// public class swap { 
//     public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
//         int temp = list.get(idx1);
//         list.set(idx1, list.get(idx2));
//         list.set(idx2, temp);
//     }
//     public static void main(String args[]){
//         ArrayList<Integer> list = new ArrayList<>();
//             list.add(2);
//             list.add(5);
//             list.add(9);
//             list.add(3);
//             list.add(6); 
//             int idx1 = 1, idx2 = 3;
//             System.out.println(list);
//             swap(list, idx1, idx2);
//             System.out.println(list);
//     } 
// }



//  Collections.sort(array) & Collections.sort(array, Collections.reverseOrder())

// // import java.util.ArrayList;
// // import java.util.Collections;

// import java.util.*;

// public class Sorting_an_ArrayList {
//     public static void main(String args[]) {
//         ArrayList<Integer> l = new ArrayList<>();

//         l.add(8);
//         l.add(2);
//         l.add(9);
//         l.add(4);

//         System.out.println(l);
//         Collections.sort(l);   // This is the Method (Ascending order).
//         System.out.println(l);


//         // descending order
//         Collections.sort(l, Collections.reverseOrder());
//         System.out.println(l);
//         // Comparator - fnx logic
//     } 
// }


// import java.util.*;

// public class a {
//     public static void main(String args[]){
//         ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(1); list.add(2); 
//         mainList.add(list); 

//         ArrayList<Integer> list2 = new ArrayList<>();
//         list2.add(3); list2.add(4);
//         mainList.add(list2);

//         for(int i = 0; i<mainList.size(); i++){
//             ArrayList<Integer> currList = mainList.get(i);
//             for(int j = 0; j<currList.size(); j++){
//                 System.out.print(currList.get(j) + " ");
//             }
//             System.out.println();
//         }
//         System.out.println(mainList);
//     } 
// }

// import java.util.*;

// public class a {
//     public static void main(String args[]){
//         ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
//         ArrayList<Integer> list1 = new ArrayList<>();
//         ArrayList<Integer> list2 = new ArrayList<>();
//         ArrayList<Integer> list3 = new ArrayList<>();

//         for(int i = 1; i<=5; i++){
//             list1.add(i*1); // 1 2 3 4 5
//             list2.add(i*2); // 2 4 6 8 10
//             list3.add(i*3); // 3 6 9 12 15
//         }
//         mainList.add(list1);
//         mainList.add(list2);
//         mainList.add(list3);
        
//         System.out.println(mainList);
        
//         // nested Loops
//         for(int i = 0; i<mainList.size(); i++){
//             ArrayList<Integer> currList = mainList.get(i);
//             for(int j=0; j<currList.size(); j++){
//                 System.out.print(currList.get(j)+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.ArrayList;

// public class a {
//     public static int storeWater(ArrayList<Integer> height){
//         int maxWater = 0;
//         // brute force - O(n^2)
//         for(int i = 0; i<height.size(); i++){
//             for(int j = i+1; j<height.size(); j++){
//                 int ht = Math.min(height.get(i), height.get(j)) ;
//                 int width = j-i;
//                 int currWater = ht * width;
//                 maxWater = Math.max(maxWater, currWater);
//             }
//         }
//         return maxWater;
//     }
// public static void main(String args[]){
//     ArrayList<Integer> height = new ArrayList<>();
//     // 1, 8, 6, 2, 5, 4, 8, 3, 7
//     height.add(1); 
//     height.add(8); 
//     height.add(6); 
//     height.add(2); 
//     height.add(5); 
//     height.add(4); 
//     height.add(8); 
//     height.add(3); 
//     height.add(7); 

//     System.out.println(storeWater(height));
// }
// }

// Optimized Approach of this question - 2 Pointer Approach (T.C - O(n))

// import java.util.*;
// public class Container_with_Most_Water {
//     public static int storeWater(ArrayList<Integer> height){
//         int maxWater = 0;
//         int lp = 0;
//         int rp = height.size()-1;

//         while(lp < rp){
//             // calculate water Area
//             int ht = Math.min(height.get(lp), height.get(rp));
//             int width = rp - lp;
//             int currWater = ht * width;
//             maxWater = Math.max(maxWater, currWater);

//             // update ptr
//             if(height.get(lp) < height.get(rp)) {
//                 lp++;
//             }
//             else{
//                 rp--;
//             }
//         }

//         return maxWater;
//     }
//     public static void main(String args[]){
//         ArrayList<Integer> height = new ArrayList<>();
//         // 1, 8, 6, 2, 5, 4, 8, 3, 7
//         height.add(1); 
//         height.add(8); 
//         height.add(6); 
//         height.add(2); 
//         height.add(5); 
//         height.add(4); 
//         height.add(8); 
//         height.add(3); 
//         height.add(7); 

//         System.out.println(storeWater(height));
//     }

// }

// Brute Force Approach - O(n^2)

// import java.util.ArrayList;
// public class PairSum {
//     public static boolean pairSum(ArrayList<Integer> list, int target){

//         for(int i = 0; i<list.size(); i++){
//             for(int j = i+1; j<list.size(); j++){
//                 if(list.get(i) + list.get(j)== target){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// public static void main(String args[]){
//     ArrayList<Integer> list = new ArrayList<>();
//     list.add(1);
//     list.add(2);
//     list.add(3);
//     list.add(4);
//     list.add(5);
//     list.add(6);
//     int target = 5;
//     System.out.print(pairSum(list, target));
// }
// }

// 2 Pointer Approach - O(n)

// import java.util.ArrayList;

// public class PairSum {
//     public static boolean pairSum(ArrayList<Integer> list, int target){
//         int lp = 0;
//         int rp = list.size()-1;
//         while(lp != rp){
//             // case 1
//             if(list.get(lp)+list.get(rp) == target){
//                 return true;
//             }
//             // case 2
//             else if(list.get(lp)+list.get(rp)<target){
//                 lp++;
//             }
//             // case 3
//             else{
//                 rp--;
//             }
//         }
//         return false;
//     }
//     public static void main(String args[]){
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);
//         list.add(6);
//         int target = 5;     
//         System.out.print(pairSum(list, target));  
//     }
// }

// Boolean Approach - O(n^2)

// import java.util.ArrayList;
// public class PairSum_2 {
//     public static boolean pairSum(ArrayList<Integer> list, int target){
//         for(int i = 0; i<list.size(); i++){
//             for(int j = i+1; j<list.size(); j++){
//                 if(list.get(i)+list.get(j) == target){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
//     public static void main(String args[]) {
//         ArrayList<Integer> list = new ArrayList<>();
//         11, 15, 6, 8, 9, 10 - Sorted & Rotated
//         list.add(11);
//         list.add(15);
//         list.add(6);
//         list.add(8);
//         list.add(9);
//         list.add(10);
//         int target = 16;
//         System.out.print(pairSum(list, target));
//     }
// }

// 2 Pointer Approach - O(n)

// import java.util.ArrayList;
// public class PairSum_2 {
//     public static boolean pairSum2(ArrayList<Integer> list, int target){
//         int bp = -1;   // bp - breakingPoint
//         int n = list.size();
//         for(int i = 0; i<list.size(); i++){
//             if(list.get(i) > list.get(i+1)){  // breaking point
//                 bp = i;
//                 break; 
//             }
//         }

//         int lp = bp+1;  // smallest
//         int rp = bp;  // largest 

//         while(lp != rp){
//             // case1 
//             if(list.get(lp) + list.get(rp) == target){
//                 return true;
//             }
//             // case2
//             else if(list.get(lp) + list.get(rp) < target){
//                 lp = (lp+1) % n;
//             }
//             // case3
//             else{
//                 rp = (n+rp-1)%n;
//             }
//         }
//         return false;
//     }
//     public static void main(String args[]) {
//         ArrayList<Integer> list = new ArrayList<>();
//         // 11, 15, 6, 8, 9, 10 - Sorted & Rotated
//         list.add(11);
//         list.add(15);
//         list.add(6);
//         list.add(8);
//         list.add(9);
//         list.add(10);
//         int target = 16;
//         System.out.print(pairSum2(list, target));
//     }
// }


// 1.
// import java.util.ArrayList;

// public class a {
//     public static boolean isMonotone(ArrayList<Integer> nums){
//         boolean inc = true;
//         boolean dec = true;
//         for(int i = 0; i<nums.size()-1; i++){
//             if(nums.get(i) < nums.get(i+1)){
//                 return false;
//             }
//             if(nums.get(i) > nums.get(i+1)){
//                 return false;
//             }
//         }
//         return inc || dec;
//     }
//     public static void main(String args[]) {
//         ArrayList<Integer> nums = new ArrayList<>();
//         nums.add(1);
//         nums.add(3);
//         nums.add(2); 
//         System.out.println(isMonotone(nums));
//     }
// }     



// 3.

import java.util.ArrayList;
public class b {
    public static mostFrquent(ArrayList<Integer> nums, int key){
        int result[] = new int[1000];

        for(int i=0; i<nums.size(); i++){
            if(nums.get(i)==key){
                result[nums.get(i+1)-1]++;
            }
        }
        int max = Integer.MIN_VALUE;
        int ans = 0;

        for(int i=0; i<1000; i++){
            if(result[i]> max){
                max = result[i];
                ans = i+1;
            }
        } 
        return ans;
    }
public static void main(String args[]){
   ArrayList<Integer> nums = new ArrayList<>();
   nums.add(1);     
   nums.add(100);     
   nums.add(200);     
   nums.add(1);     
   nums.add(100); 
   
   int key = 1;

   System.out.println(mostFrquent(nums, key));
}

}

