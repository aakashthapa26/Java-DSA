// 1. a)

// import java.util.ArrayList;
// public class PracticeSet {
//     public static boolean Monotonic(ArrayList<Integer> nums){
//         boolean inc = true;
//         boolean dec = true;
//         for(int i = 0; i<nums.size()-1; i++){
//             if(nums.get(i) > nums.get(i+1)){
//                 inc = false;
//             }
//             if(nums.get(i) < nums.get(i+1)){
//                 dec = false;
//             }
//         }
//     return inc || dec;  
// }
//     public static void main(String args[]){
//         ArrayList<Integer> nums = new ArrayList<>();   
//         nums.add(1);
//         nums.add(2);
//         nums.add(2);
//         nums.add(3);

//         if(Monotonic(nums)){
//             System.out.print("Yes, "+nums+" is a Monotonic");
//         }
//         else{  
//             System.out.print("No, "+nums+" is not a Monotonic");

//         }     
//     }
// }


// b)

// import java.util.ArrayList;
// public class PracticeSet {
//     public static boolean Monotonic(ArrayList<Integer> nums){
//         boolean inc = true;
//         boolean dec = true;
//         for(int i = 0; i<nums.size()-1; i++){
//             if(nums.get(i) > nums.get(i+1)){
//                 inc = false;
//             }
//             if(nums.get(i) < nums.get(i+1)){
//                 dec = false;
//             }
//         }
//     return inc || dec;  
// }
//     public static void main(String args[]){
//         ArrayList<Integer> nums = new ArrayList<>();   
//         nums.add(6);
//         nums.add(5);
//         nums.add(4);
//         nums.add(4);

//         if(Monotonic(nums)){
//             System.out.print("Yes, "+nums+" is a Monotonic");
//         }
//         else{  
//             System.out.print("No, "+nums+" is not a Monotonic");

//         }     
//     }
// }


// c)

// import java.util.ArrayList;
// public class PracticeSet {
//     public static boolean Monotonic(ArrayList<Integer> nums){
//         boolean inc = true;
//         boolean dec = true;
//         for(int i = 0; i<nums.size()-1; i++){
//             if(nums.get(i) > nums.get(i+1)){
//                 inc = false;
//             }
//             if(nums.get(i) < nums.get(i+1)){
//                 dec = false;
//             }
//         }
//     return inc || dec;  
// }
//     public static void main(String args[]){
//         ArrayList<Integer> nums = new ArrayList<>();   
//         nums.add(1);
//         nums.add(3);
//         nums.add(2);

//         if(Monotonic(nums)){
//             System.out.print("Yes, "+nums+" is a Monotonic");
//         }
//         else{  
//             System.out.print("No, "+nums+" is not a Monotonic");

//         }     
//     }
// }



// 2. a)

// import java.util.*;
// public class PracticeSet {
//     public static ArrayList<Integer> findLonely(ArrayList<Integer> nums){
//         Collections.sort(nums);
//         ArrayList<Integer> list = new ArrayList<>();
//         for(int i = 1; i<nums.size()-1; i++){
//             if(nums.get(i-1)+1 < nums.get(i) && nums.get(i) + 1 < nums.get(i+1)){
//                 list.add(nums.get(i));
//             }
//         }

//         if(nums.size() == 1){
//             list.add(nums.get(0));
//         }
//         if(nums.size() > 1){
//             if(nums.get(0)+1 < nums.get(1)){
//                 list.add(nums.get(0));
//             }

//             if(nums.get(nums.size()-2)+1 < nums.get(nums.size()-1)){
//                 list.add(nums.get(nums.size()-1));
//             }
//         }
//         return list;
//     }
// public static void main(String args[]){
//     ArrayList<Integer> nums = new ArrayList<>();
//     nums.add(10);    
//     nums.add(6);    
//     nums.add(5);    
//     nums.add(8);    
//     System.out.print(findLonely(nums));

// } 
 
// } 

 

// 3. a)

// import java.util.ArrayList;
// public class PracticeSet {
//     public static int mostFrequent(ArrayList<Integer> nums, int key){
//         int[] result = new int[1000];

//         for(int i=0; i<nums.size()-1; i++){
//             if(nums.get(i) == key){
//                 result[nums.get(i+1)-1]++;
//             }
//         }
        
//         int max = Integer.MIN_VALUE;
//         int ans = 0;

//         for(int i = 0; i<1000; i++){
//             if(result[i] > max){
//                 max = result[i];
//                 ans = i+1;
//             }
//         }
//         return ans;
//     }
// public static void main(String args[]){
//    ArrayList<Integer> nums = new ArrayList<>();
   
//    nums.add(1);
//    nums.add(100);
//    nums.add(200);
//    nums.add(1);
//    nums.add(100);
//    int key = 1;
//    System.out.print(mostFrequent(nums, key));
// }

// }



// 4. 

import java.util.*;
public class PracticeSet {
    public ArrayList<Integer> beautifulArray(int n){
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);

        for(int i=2; i<=n; i++){
            ArrayList<Integer>temp = new ArrayList<>();
            for(Integer e:ans)
        }
    }
public static void main(String args[]){
    int n = 4;    

}

}