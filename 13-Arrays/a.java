import javax.sound.sampled.Line;
import javax.swing.text.MaskFormatter;
import javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction;

// public class a {
//     public static int buyAndSellStocks(int prices[]){
//         int buyPrice = Integer.MAX_VALUE;
//         int maxProfit = 0;

//         for(int i=0; i<prices.length; i++){
//             if(buyPrice < prices[i]){
//                 int Profit = prices[i] - buyPrice;
//                 maxProfit = Math.max(maxProfit, Profit);
//             }
//             else{
//                 buyPrice = prices[i];
//             }
//         }
//         return maxProfit;
//     }
// public static void main(String args[]){
//     int prices[] = {7, 1, 5, 3, 6, 4};  
//         System.out.println(buyAndSellStocks(prices));

// }

// }




// public class a {
//     public static int BinarySearch(int numbers[], int key){
//         int start = 0, end = numbers.length-1;

//         while(start<=end){
//             int mid = (start + end)/2;
//             if(numbers[mid] == key){
//                 return mid;
//             }
//             if(numbers[mid]<key){
//                 start = mid + 1;
//             }
//             else{
//                 end = mid - 1;
//             }
//         }
//             return -1;
//     }

// public static void main(String args[]){
//      int numbers[] = {2,4,6,8,10,12,14};
//      int key = 10;   
//      System.out.println("index for key is: "+BinarySearch(numbers, key));

// }

// }




// public class a {
//     public static void reverse(int nums[]){
//         int first = 0, last = nums.length - 1;

//         while(first < last){
//             int temp = nums[last];
//             nums[last] = nums[first];
//             nums[first] = temp;

//             first++;
//             last--;
//         }
//     }
// public static void main(String args[]){
//     int nums[] = {1,2,3,4}; 
//     reverse(nums); 
//     for(int i=0; i<nums.length; i++){   
//         System.out.print(nums[i]+" ");
//     }   
// }

// }      



// Q). Pairs in an Array

// public class a {
//     public static void pairsInArray(int nums[]){
//         int totalPairs = 0;
//         int n = nums.length;
//         for(int i = 0; i<n; i++){
//             for(int j = i+1; j<n; j++){
//                 System.out.print("("+nums[i]+","+nums[j]+")"+" ");
//                 totalPairs++;
//             }
//             System.out.println();
//         }
//         System.out.println("totalPairs is: "+ totalPairs);
//     }
// public static void main(String args[]){
//     int nums[] = {2,4,6,8,10};
//     pairsInArray(nums);

// }

// }



// Q). Print Subarrays
 
//  public class a {
//     public static void subarrays(int nums[]){
//         int n = nums.length;
//         for(int i = 0; i<n; i++){
//          int start = i;
//             for(int j=i+1; j<=n; j++){
//                int end = 
//             }

//         }
//     }
//  public static void main(String args[]){
//     int nums[] = {2,4,6,8,10};   
//     subarrays(nums); 
 
//  }
 
//  }




// Q). Maximum Subarray Sum

// public class a {
//     public static void MaxsubarraySum(int nums[]){
//         int n = nums.length;
//         int Subarraysum;
//         int MaxsubarraySum = 0;
//         for(int i=0; i<n; i++){
//             for(int j=i+1; j<n; j++){
//                 Subarraysum = nums[i]+nums[j];
//                 MaxsubarraySum = Math.max(Subarraysum, MaxsubarraySum);
//             }
//         }
//         System.out.println("Max subarray sum is: "+MaxsubarraySum);
//     }
// public static void main(String args[]){
//    int nums[] = {1,-2,6,-1,3};   
//    MaxsubarraySum(nums);  

// }

// }


// Aakash

// public class a {
//    public static int LinearSearch(String numbers[], String key){
//       for(int i = 0; i<numbers.length; i++){
//          if(numbers[i] == key){
//             return i;
//          }
//       }
//       return -1;
//    }
// public static void main(String args[]){
//    // int numbers[] = {2,4,6,8,10,12,14,16,18,20};
//    String numbers[] = {"dosa", "samosa", "chicken"};
//    String key = "chiken";     
//    System.out.println("Index is: "+LinearSearch(numbers, key));

// }

// }



// public class a {
//    public static int largest(int numbers[]){
//       int largest = Integer.MIN_VALUE;
//       for(int i = 0; i<numbers.length; i++){
//          if(largest < numbers[i]){
//             largest = numbers[i];
//          }
//       }
//       return largest;
//    }
// public static void main(String args[]){
//     int numbers[] = {1,2,6,3,5};  
//     System.out.println("Largest numbers is: "+largest(numbers));

// }

// }


// public class a {
//    public static int BinarySearch(int num[], int key){
//       int start = 0, end = num.length - 1;

//       while(start <= end){
//          int mid = (start + end)/2;

//          if(num[mid] == key){
//             return mid;
//          }
//          if(num[mid] < key){
//             start = mid + 1;
//          }
//          else{
//             end = mid - 1;
//          }

//       }
//       return -1;
//    }
// public static void main(String args[]){
//    int num[] = {2,4,6,8,10,12,14};
//    int key = 4;
//    System.out.println("Index for key is: "+BinarySearch(num, key));

// }

// }


// public class a {
//    public static void reverse(int num[]){
//       int first = 0, last = num.length-1;
//       while(first < last){
//          int temp = num[last];
//          num[last] = num[first];
//          num[first] = temp;
//          first++;
//          last--;

//       }
//    }
// public static void main(String args[]){
//     int num [] = {2,4,6,8,10,11};  
//     reverse(num);    
//     for(int i=0; i<num.length; i++){
//       System.out.print(num[i] + " ");
//     }
// }

// }


// public class a {
//    public static void pairs(int num[]){
//       int totalPairs = 0;
//       int n = num.length;
//       for(int i= 0; i<n; i++){
//          for(int j = i+1; j<n; j++){
//             System.out.print("("+num[i]+","+num[j]+")"+" ");
//             totalPairs++;
//          }
//          System.out.println();
//       }
//       System.out.print("Total pairs is: "+totalPairs);
//    }
// public static void main(String args[]){
//     int num[] = {2,4,6,8,10};  
//     pairs(num);

// }

// }


// public class a {
//    public static void subarrays(int num[]){    
//       int totalPairs = 0;
//       int sum = 0;
//       int Max = Integer.MIN_VALUE;
//       int Min = Integer.MAX_VALUE;
      
//       for(int i = 0; i<num.length; i++){ 
//          System.out.println((i+1)+" Subarray is: ");
//          for(int j = i; j<num.length; j++){
//             sum = 0;
//             for(int k=i; k<=j; k++){
//                System.out.print(num[k]+" ");
//                totalPairs++;
//                sum += num[k];
//             }
//             if(sum > Max){
//                Max = sum;
//             }
//             if(sum < Min){
//                Min = sum;
//             }
//             System.out.println();
//             System.out.print("Sum of Subarrays is: "+sum);
//             System.out.println();
            
//          }
//          System.out.println();
//    }
//    System.out.println("Maximum sum of subarray is: "+Max);
//    System.out.println("Minimum sum of subarray is: "+Min);
// }
// public static void main(String args[]){
//     int num[] = {2,4,6,8,10};  
//     subarrays(num);

// }

// }


// public class a {
//     public static void MaxsubarraySum(int num[]){
//         int sum = 0;
//         int MaxSum = Integer.MIN_VALUE;
//         int prefix[] = new int[num.length];
        
//         prefix[0] = num[0];

//         for(int i =1; i<prefix.length; i++){
//             prefix[i] = prefix[i-1] + num[i];
//         }

//         for(int i=0; i<num.length; i++){
//                 sum = prefix[i];
                
//                 if(MaxSum<sum){
//                     MaxSum = sum;
//                 }
//         }
//         System.out.println(MaxSum);
// }
// public static void main(String args[]){
//       int num[] = {2,2,10};
//       MaxsubarraySum(num);

// }

// }


// public class a {
//     public static void MaxsubarraySum(int num[]){
//         int sum = 0;
//         // int MaxSum = Integer.MIN_VALUE;
//         int prefix[] = new int[num.length];

//         prefix[0] = num[0];
//         for(int i=1; i<num.length; i++){
//             prefix[i] = prefix[i-1] + num[i];
//         }

//         for(int i = 0; i<num.length; i++){
            
//             sum = i == 0 ? num[0] : prefix[i];
//         }
//         System.out.println("Maximum sum is: "+sum);
//     }
// public static void main(String args[]){
//     int num[] = {2,1,15,6};
//     MaxsubarraySum(num);


// }

// }


// public class a {
//     public static void MaxsubarraySum(int num[]){
//         int currsum = 0;
//         int MaxSum = Integer.MIN_VALUE;

//         for(int i = 0; i<num.length; i++){
//             currsum = currsum + num[i];
//             if(currsum<0){
//                 currsum = 0;
//             }
//             MaxSum = Math.max(MaxSum, currsum);
//         }
//         System.out.println("Max sum is: "+MaxSum);
//     }
// public static void main(String args[]){
//     int num[] = {-2, -3, 4, -1, -2, 1, 5, -3};
//     MaxsubarraySum(num);
// }
// }

// 1.

// import java.util.*;
// public class a {
// public static void main(String args[]){
//      int nums[] = new int[10];
//      Scanner sc = new Scanner(System.in);
//      for(int i = 0; i<nums.length; i++){
//         nums[i] = sc.nextInt();
//     }  
//     System.out.println("********");
//      for(int i = 0; i<nums.length; i++){
//         System.out.println(nums[i]);
//     }  
    
   
// }

// }



// 2.

// public class a {
//     public static void update(int marks[]){
//         for(int i = 0; i<marks.length; i++){
//             marks[i] = marks[i]+1;
//         }

//     }
// public static void main(String args[]){
//     int marks[] = {97, 98, 99}; 
//     update(marks);

//     for(int i = 0; i<marks.length; i++){
//         System.out.print(marks[i] + " ");
//     }
// }

// }



// 3. Linear Search

 
// public class a {
//     public static int LinearSearch(int num[], int key){
//         for(int i = 0; i<num.length; i++){
//             if(num[i] == key){
//                 return i;
//             }
//         }
//         return -1;
//     }
// public static void main(String args[]){
//    int num[] = {2,4,6,8,10,12,14,16};     
//    int key = 11;

//    System.out.println(LinearSearch(num, key));
//    if(LinearSearch(num, key) == -1){
//     System.out.println(key + " does not exist in array");
//    }
// }

// }



// 4. 


// public class a {
//     public static int largest(int num[]){
//         int largest = Integer.MIN_VALUE;
//         for(int i=0; i<num.length; i++){
//             if(num[i]>largest){
//                 largest = num[i];
//             }
//         }
//         return largest;
//     }
// public static void main(String args[]){
//    int num[] = {1, 2, 6, 3, 10};     
//     System.out.println("largest value is: "+largest(num));
// }

// }



// 5. Binary Search


// public class a {
//     public static int BinarySearch(int num[], int key){
//         int start = 0, end = num.length-1;

//         while(start<=end){
//             int mid = (start+end)/2;
            
//             if(key == num[mid]){
//                 return mid;
//             }

//             if(key < num[mid]){
//                 end = mid - 1;
//             }

//             if(key > num[mid]){
//                 start = mid + 1;
//             }

//         }
//         return -1;
//     }
// public static void main(String args[]){
//    int num[] = {2,4,6,8,10};  
//    int key = 8;   
//     System.out.print(BinarySearch(num, key));
// }

// }



// 6.


// public class a {
//     public static void reverse(int nums[]){
//         int first = 0, end = nums.length - 1;

//         while(first<end){
//             int temp = nums[first];
//             nums[first] = nums[end];
//             nums[end] = temp;

//             first ++ ;
//             end --;
//         }
//     }
// public static void main(String args[]){
//    int nums[] = { 2, 9, 8, 7, 10};
//    reverse(nums);

//    for(int i = 0; i<nums.length; i++){
//     System.out.print(nums[i] + " ");
//    }

// }

// }




// 7.  // Brute Force


// public class a {
//     public static void pairs(int nums[]){
//         int count = 0;
//         for(int i = 0; i<nums.length; i++){
//             for(int j = i+1; j<nums.length; j++){
//                 System.out.print("("+nums[i]+","+nums[j]+") ");
//                 count ++;
//             }
//             System.out.println();
//         }
//         // System.out.println();
//         System.out.print("Total Pairs is: "+count);
//     }
// public static void main(String args[]){
//    int nums[] = {2,4,6,8,10};     
//    pairs(nums);

// }

// }



// 8.


// public class a {
//     public static void subarrays(int nums[]){
//         int sum;
//         int MaxSum = Integer.MIN_VALUE;
//         int MinSum = Integer.MAX_VALUE;
//         for(int i = 0; i<nums.length; i++){
//             for(int j = i+1; j<nums.length; j++){
//                 sum = 0;
//                 for(int k = i; k<=j; k++){
//                     System.out.print(nums[k]+" ");
//                     sum+=nums[k];
//                 }
//                 System.out.println();
//                 System.out.println("Sum of subarray: "+sum);
//                 if(sum > MaxSum){
//                     MaxSum = sum;
//                 }
//                 // if(sum < MinSum){
//                 //     MinSum = sum;
//                 // }
//             }
//         }
//         System.out.println();  
//         System.out.println("MaxSum of Subarray is: "+MaxSum);
//         System.out.println("MinSum of Subarray is: "+MinSum);
// }
//  public static void main(String args[]){
//     int nums[] = {2,4,6,8,10};    
//     subarrays(nums);     

// }  

// }



// 9. Time Complexity - O(n^2)
 

// public class a {
//     public static void MaxsubarraySum(int arr[]){
//         int currSum = 0;
//         int MaxSum = Integer.MIN_VALUE;
//         int prefix[] = new int[arr.length];

//         prefix[0] = arr[0];
//         for(int i = 1; i<prefix.length; i++){ 
//             prefix[i] = prefix[i-1] + arr[i];
//         }

//         for(int i = 0; i<arr.length; i++){
//             int start = i;
//             for(int j = 0; j<arr.length; j++){
//                 int end = j;
//                 currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

//                 if(currSum > MaxSum){
//                     MaxSum = currSum;
//                 }
//             }
//         }
//         System.out.println("MaxSum is: "+MaxSum);
//     }
// public static void main(String args[]){
//     int arr[] = {1, -2, 6, -1, 3};
//     MaxsubarraySum(arr);
// }
// }   



// 10. Time Complexity - O(n) as only 1 loop is being invoked.


// public class a {
//     public static void Kandans(int nums[]){
//         int MaxSum = Integer.MIN_VALUE;
//         int currSum = 0;

//         for(int i = 0; i<nums.length; i++){
//                 currSum = currSum + nums[i];
//                 if(currSum<0){
//                     currSum = 0;
//                 }
//                 MaxSum = Math.max(MaxSum, currSum);
//         }
//         System.out.print("MaxSum is: "+MaxSum);  
//     }
// public static void main(String args[]){
//     int nums[] = {-2,-3,4,-1,-2,1,5,-3};    
//     Kandans(nums);
// }   
// }



// 11. Kadanes Algorithm to find SumMaxSubarray in an array havaing all negative numbers.


// public class a {
//     public static void MaxsubarraySum(int nums[]){
//         int MaxSum = Integer.MIN_VALUE;
//         int currSum = 0;
//         for(int i = 0; i<nums.length; i++){
//             currSum = currSum + nums[i];
//             if(currSum<nums[i]){
//                 currSum = nums[i];
//             }

//             MaxSum = Math.max(currSum,MaxSum);
//         }
//         System.out.print("MaxSum is: "+MaxSum);
//     }
// public static void main(String args[]){
//     int nums[] = {-2, -1 , -5}; 
//     MaxsubarraySum(nums);
// }
// }



// 12. TrappedRainWater


// public class a {
//     public static int trappedRainwater(int height[]){
//         int n = height.length;
        
//         // For LeftMax

//         int LeftMax[] = new int[n];

//         LeftMax[0] = height[0];
//         for(int i = 1; i<n; i++){
//             LeftMax[i] = Math.max(LeftMax[i-1], height[i]);
//         }

//         // For RightMax

//         int RightMax[] = new int[n];

//         RightMax[n-1] = height[n-1];
//         for(int i = n-2; i>=0; i--){
//             RightMax[i] = Math.max(RightMax[i+1], height[i]);
//         }

//         int trappedRainwater = 0;

//         for(int i = 0; i<n; i++){
//             int waterLevel = Math.min(LeftMax[i], RightMax[i]);
//             trappedRainwater += (waterLevel-height[i]);
//         }
//         return trappedRainwater;
//     }
// public static void main(String args[]){
//    int height[] = {4, 2, 0, 6, 3, 2, 5};   
//    System.out.print("TrappedRainwater is: "+trappedRainwater(height));  


// }

// }




// 13.


public class a {
    public static int buyAndSellStocks(int prices[]){
        int n = prices.length;
        int buyPrice = Integer.MAX_VALUE;
        int MaxProfit = 0;

        for(int i = 0; i<n; i++){
            if(buyPrice < prices[i]){
                int Profit = prices[i] - buyPrice;
                MaxProfit = Math.max(Profit, MaxProfit);
            }
            else{
                buyPrice = prices[i];
            }   
        }
        return MaxProfit;
    }  
public static void main(String args[]){   
    int prices[] = {7, 1, 5, 3, 6, 4};
    System.out.print("Maximum Profit is: "+buyAndSellStocks(prices));

}    

}         