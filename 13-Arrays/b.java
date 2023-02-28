

// Input

// import java.util.*;
// public class b {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int num[] = new int[3];

//         num[0] = sc.nextInt();
//         num[1] = sc.nextInt();
//         num[2] = sc.nextInt();

//         for(int i = 0; i<3; i++){
//             System.out.println(num[i]);
//         }
//     }
// }  

// Passing arguments in function

// import java.util.*;

// public class b{
//     public static void update(int marks[]) {
//         for(int i=0; i<marks.length; i++){
//             marks[i]=marks[i]+1;
//         }
//     }
//     public static void main(String args[]) {
//         int marks[] = {97, 98, 99};
//         update(marks);

//         // to print our marks

//         for(int i = 0; i<marks.length; i++){
//             System.out.println(marks[i]);
//         }
//     }
// }

// Linear Search
// import java.util.*;

// public class b{
//     public static int LinearSearch(int nums[], int target) {
//         for(int i=0; i<nums.length; i++){
//             if(nums[i] == target){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void  main(String args[]){

//         int nums[] = {2, 4, 6, 8, 10, 12, 14, 16};
//         int target = 8;
//         int index = LinearSearch(nums,target);
//         if(index == -1){
//             System.out.println("Not found");
//         }
//         else{
//             System.out.println("Target is at index " + index);
//         }
//     }
// }

// Largest Number

// public class b{
//     public static int LargestNumber(int nums[]){
//         int Largest = Integer.MIN_VALUE;
//         for(int i = 0; i<nums.length; i++){
//             if(Largest < nums[i]){
//                 Largest = nums[i];
//             }
//         }
//         return Largest;
//     }
//     public static void main(String args[]){
//         int nums[] = {1, 2, 6, 3, 5};  
//         System.out.print("Largest number in given array is "+LargestNumber(nums)); 
//     }
// }

// Binary Search
// import java.util.*;
// public class b{
//     public static int BinarySearch(int nums[], int target){
//         Arrays.sort(nums);  // Sorting of an Array
//         int si = 0, ei = nums.length-1;

//         while(si<=ei){
//             int mid=(si+ei)/2;

//             // comparisons
//             if(nums[mid] == target){
//                 return mid;
//             }
//             else if(nums[mid]>target){
//                 ei = mid -1;
//             }
//             else{
//                 si = mid + 1;
//             }
//         }
//         return -1;
//     }
//     public static void main(String args[]){
//         int nums[] = {10, 15, 2, 4, 6, 8, 10, 12, 14};
//         int target = 4;
//         System.out.print(BinarySearch(nums,target));
//     }
// }

// Reverse an Array

// public class b {
//     public static void Reverse(int nums[]){
//         int si=0, ei = nums.length-1;

//         while(si<ei){
//             // swap
//             int temp = nums[ei];
//             nums[ei] = nums[si];
//             nums[si] = temp; 
//             si++;
//             ei--;
//         } 

//     }

//     public static void main(String args[]) {
//         int nums[] = { 2, 4, 6, 8, 10 };
//         Reverse(nums);
//         // To print Reverse Array

//         for(int i=0; i<nums.length; i++){
//             System.out.print(nums[i]+" ");
//         }
//     }

// }

// Pairs in an Array

// public class b{
//     public static void PrintPair(int nums[]){
//         int n = nums.length;

//         for(int i=0; i<n; i++){
//             for(int j=i+1; j<n; j++){
//                 System.out.print("("+nums[i]+", "+nums[j]+") ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         int nums[] = {2, 4, 6, 8, 10};
//         PrintPair(nums);
//     }
// }

// Print SubArray

// public class b{
//     public static void PrintSubarray(int nums[]){
//         int n = nums.length;
//         for(int i=0; i<n; i++){
//             System.out.println("Subarray of "+nums[i]);
//             for(int j=i; j<n; j++){
//                 for(int k=i; k<=j; k++){
//                     System.out.print(nums[k]+" ");
//                 }
//                 System.out.println();
//             }
//             System.out.println();
//         } 
//     }
//     public static void main(String args[]){
//         int nums[] = {2, 4, 6, 8, 10};
//         PrintSubarray(nums);
//     }
// }

// Max SubArray Sum

// public class b {
//     public static void PrintSubarray(int nums[]) {
//         int n = nums.length;
//         int MaxSum = Integer.MIN_VALUE;
//         int count = 1;
//         for(int i=0; i<n; i++){
//             for(int j=i+1; j<n; j++){
//                 int currsum = 0;
//                 for(int k=i; k<j; k++){
//                     currsum += nums[k];
//                 }
//                 System.out.println("Sum of "+count+" subarray is: "+currsum);
//                 count++;
//                 if(currsum>MaxSum){
//                     MaxSum = currsum;
//                 }
//             }
//         }
//         System.out.println();
//         System.out.println("Maximum Sum of subarray is: "+MaxSum);
//     }

//     public static void main(String args[]) {
//         int nums[] = { 2, 4, 6, 8, 10 };
//         PrintSubarray(nums);
//     }
// }
   


// KadanesAlgorithm

// public class Kadanes_Algorithm {
//     public static void MaxsubarraySum(int nums[]){
//         int MaxSum = Integer.MIN_VALUE;
//         int currSum = 0;
//         for(int i = 0; i<nums.length; i++){
//             currSum = currSum + nums[i];
//             MaxSum = Math.max(currSum,MaxSum);
//             if(currSum<nums[i]){
//                 currSum = nums[i];
//             }

//         }
//         System.out.print("MaxSum is: "+MaxSum); 
//     }
// public static void main(String args[]){
//     int nums[] = {-2, -3, 4, -1, -2, 1, 5, -3}; 
//     MaxsubarraySum(nums);
// }
// }



// 11. Kadanes Algorithm to find SumMaxSubarray in an array havaing all negative numbers.


// public class b {
//     public static void MaxsubarraySum(int nums[]){
//         int ms = Integer.MIN_VALUE;
//         int cs = 0;

//         for(int i = 0; i<nums.length; i++){
//             cs += nums[i];
//             if(cs<nums[i]){
//                 cs = nums[i];
//             }
//             ms = Math.max(ms, cs);
            
//         }
//         System.out.println("Max subarray sum is : "+ms);
//     }
// public static void main(String args[]){
//     int nums[] = {-2, -1 , -5}; 
//     MaxsubarraySum(nums);
// }
// }


// Trapping Rainwater


// public class b {
//     public static int trappedRainwater(int height[]){
//         // Calculate left max boundary - array
//         // Calculate right max boundary - array
    
//         // loop
//         // waterlevel = min(leftmax bound, rightmax bound) 
//         // trapped water = waterlevel - height[i]

//         int n=height.length;
//         int leftMax[] = new int[n];
//         leftMax[0] = height[0];
//         for(int i=1; i<n; i++){
//             leftMax[i] = Math.max(height[i], leftMax[i-1]);
//         }


//         int rightMax[] = new int[n];
//         rightMax[n-1] = height[n-1];
//         for(int i=n-2; i>=0; i--){
//             rightMax[i] = Math.max(height[i], rightMax[i+1]);
//         }

//         int trappedWater = 0;
//         for(int i=0; i<n; i++){
//             int waterlevel = Math.min(leftMax[i], rightMax[i]);
//             trappedWater += waterlevel - height[i];
//         }
//         return trappedWater;
//     }
// public static void main(String args[]){
//    int height[] = {4, 2, 0, 6, 3, 2, 5};     
//    int a = trappedRainwater(height);
//    System.out.println("TrappedRainWater is: "+a);
// }
// }



// Buy and Sell Stock

// public class b {    
//     public static int buyAndSellStocks(int price[]){
//         int buyprice = Integer.MAX_VALUE;
//         int maxProfit = 0;

//         for(int i=0; i<price.length; i++){
//             if(buyprice < price[i]) {
//                 int profit = price[i] - buyprice;
//                 maxProfit = Math.max(maxProfit, profit);
//             }
//             else{
//                 buyprice = price[i];
//             }
//         }
//         return maxProfit;
//     }    
// public static void main(String args[]){
//    int price[] = {7, 1, 5, 3, 6, 4};     
//     System.out.println(buyAndSellStocks(price));
// }

// }



// public class b {
//     public static int Largest(int []num){
//         int largest = Integer.MIN_VALUE;
//         for(int i=0; i<num.length; i++){
//             if(largest<=num[i]){
//                 largest = num[i];
//             }
//         }
//         return largest;
//     }
// public static void main(String args[]){
//    int []num = {1, 2, 3, 8, 5, 4, 0,-1,-2,15};     
//    System.out.println(Largest(num));
// }

// }

// import java.util.*;
// public class b {
//     public static int Smallest(int num[]){
//         int Smallest = Integer.MAX_VALUE;
//         for(int i =0; i<num.length; i++){
//             if(Smallest > num[i]){
//                 Smallest = num[i];
//             }
//         }
//         return Smallest;
//     }
// public static void main(String args[]){
//    Scanner sc = new Scanner(System.in);
//    int num[] = new int[5];

//    num[0] = sc.nextInt();
//    num[1] = sc.nextInt();
//    num[2] = sc.nextInt();
//    num[3] = sc.nextInt();
//    num[4] = sc.nextInt();

//     System.out.println(Smallest(num));
// }
    
// }   



// public class b {
//     public static int BinarySearch(int nums[], int key){
//         int si=0;
//         int ei=nums.length-1;
//         while(si<=ei){
//             int mid = (si+ei)/2;
//             if(nums[mid] == key){
//                 return mid;
//             }
//             if(nums[mid]<key){
//                 si = mid+1;
//             }
//             if(nums[mid]>key){
//                 ei = mid-1;
//             }
//         }
//         return -1;
//     }
// public static void main(String args[]){
//    int nums[] = {1, 8, 5, 10, 12, 15, 7};
//    int key = 10;     
//    System.out.println(BinarySearch(nums, key));

// }

// }


// public class b {
//     public static void reverseArray(int nums[]){
//         int si=0;
//         int ei=nums.length-1;
//         while(si<ei){
//             int mid = (si+ei)/2;
//             int temp = nums[si];
//             nums[si] = nums[ei];
//             nums[ei] = temp;

//             si++;
//             ei--;
//         }
//     }
// public static void main(String args[]){
//   int nums[] = {1, 3, 5, 8, 9, 10};   
//   reverseArray(nums); 
  
//   for(int i=0; i<nums.length; i++){
//     System.out.print(nums[i]+" ");
//   }
// } 
// }



// public class b {
//     public static void ArrayPair(int nums[]){
//         for(int i=0; i<nums.length; i++){
//             for(int j=i+1; j<nums.length; j++){
        
//                 System.out.print("("+nums[i]+" ,"+nums[j]+")"+" ");
//             }
//             System.out.println();
//         }
//     }
// public static void main(String args[]){
//    int nums[] = {-1, 2, 8, 4};     
//    ArrayPair(nums);

// }

// }


// public class b {
//     public static void Subarray(int nums[]){
//         for(int i=0; i<nums.length; i++){
//             for(int j=i+1; j<nums.length; j++){
//                 System.out.print((i+1)+" Subarray is: ");
//                 for(int k=i; k<j; k++){
//                     System.out.println(nums[k]+" ");
//                     System.out.println();   
//                 }
//             }
//             System.out.println();
//         }
//     }
// public static void main(String args[]){
//    int nums[] = {2, 4, -8, 5, 6};     
//    Subarray(nums);

// }

// }