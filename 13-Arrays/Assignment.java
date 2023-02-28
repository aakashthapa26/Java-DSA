// 1.

// a)

// public class Assignment {
//     public static boolean ans(int nums[]){
//         for(int i = 0; i<nums.length; i++){
//             for(int j = i+1; j<nums.length; j++){
//                 if(nums[i] == nums[j]){
//                     return true;
//                 }
//             }
//         }
//             return false;
//     }
//     public static void main(String args[]){
//     int nums [] = {1,2,3,1};
//     System.out.println(ans(nums));
    
//     }
// }



// b.

// public class Assignment {
//     public static boolean ans(int nums[]){
//         for(int i = 0; i<nums.length; i++){
//             for(int j = i+1; j<nums.length; j++){
//                 if(nums[i] == nums[j]){
//                     return true;
//                 }
//             }   
//         }
//             return false;
//     }
//     public static void main(String args[]){
//     int nums [] = {1,2,3,4};
//     System.out.println(ans(nums));
//     }
// }        
   

// c

// public class Assignment {
//     public static boolean ans(int nums[]){
//         for(int i = 0; i<nums.length; i++){
//             for(int j = i+1; j<nums.length; j++){
//                 if(nums[i] == nums[j]){
//                     return true;
//                 }
//             }
//         }
//             return false;
//     }
//     public static void main(String args[]){
//     int nums [] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
//     System.out.println(ans(nums));
    
//     }
// }




// 2. 

// a)

// public class Assignment {
//     public static int ans(int nums[]){
//        int target = 0;
//        for(int i = 0; i<nums.length; i++){
//             if(nums[i] == target){
//                 return i;
//             }
//        }
//             return -1;
//     }
//     public static void main(String args[]){
//     int nums [] = {4,5,6,7,0,1,2};
//     System.out.println(ans(nums));
    
//     }
// }



// b)

// public class Assignment {
//     public static int ans(int nums[]){
//        int target = 3;
//        for(int i = 0; i<nums.length; i++){
//             if(nums[i] == target){
//                 return i;
//             }
//        }
//             return -1;
//     }
//     public static void main(String args[]){
//     int nums [] = {4,5,6,7,0,1,2};
//     System.out.println(ans(nums));
    
//     }
// }



// c)

// public class Assignment {
//     public static int ans(int nums[]){
//        int target = 0;
//        for(int i = 0; i<nums.length; i++){
//             if(nums[i] == target){
//                 return i;
//             }
//        }
//             return -1;
//     }
//     public static void main(String args[]){
//     int nums [] = {1};
//     System.out.println(ans(nums));
    
//     }
// }



// 3.  

// a.)

// public class Assignment {
//     public static int buyandSellstocks(int prices []){
//         int buyingPrice = Integer.MAX_VALUE;
//         int maxProfit = 0;

//         for(int i = 0; i<prices.length; i++){
//             if(buyingPrice < prices[i]){
//                 int profit = prices[i] - buyingPrice;
//                 maxProfit = Math.max(profit, maxProfit);
//             }
//         else{
//             buyingPrice = prices[i];
//         }
//     }
//     return maxProfit;

// }
// public static void main(String args[]){
//      int prices [] = {7,1,5,3,6,4};
//      System.out.println(buyandSellstocks(prices));
// }
// }   



// b).

// public class Assignment {
//     public static int buyandSellstocks(int prices []){
//         int buyingPrice = Integer.MAX_VALUE;
//         int maxProfit = 0;

//         for(int i = 0; i<prices.length; i++){
//             if(buyingPrice < prices[i]){
//                 int profit = prices[i] - buyingPrice;
//                 maxProfit = Math.max(profit, maxProfit);
//             }
//         else{
//             buyingPrice = prices[i];
//         }
//     }
//     return maxProfit;

// }
// public static void main(String args[]){
//      int prices [] = {7,6,4,3,1};
//      System.out.println(buyandSellstocks(prices));
// }
// }   



// 4. 

// a).
// public class Assignment {
//     public static int trappedRainwater(int height[]){
//         int n = height.length;

//         int leftside [] = new int[n];
//         leftside[0] = height[0];
//         for(int i=1; i<n; i++){
//             leftside[i] = Math.max(leftside[i-1], height[i]);
//         }

//         int rightside [] = new int[n];
//         rightside[n-1] = height[n-1];
//         for(int i=n-2; i>=0; i--){
//             rightside[i] = Math.max(rightside[i+1], height[i]);
//         }

//         int trappedWater = 0, waterlevel;
//         for(int i = 0; i<n; i++){
//             waterlevel = Math.min(leftside[i], rightside[i]);
//             trappedWater += waterlevel - height[i];
//         }
//         return trappedWater;
//     }
// public static void main(String args[]){
//     int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
//     System.out.println("Total trapped Water is: "+trappedRainwater(height));
// }

// }


// b).
// public class Assignment {
//     public static int trappedRainwater(int height[]){
//         int n = height.length;

//         int leftside [] = new int[n];
//         leftside[0] = height[0];
//         for(int i=1; i<n; i++){
//             leftside[i] = Math.max(leftside[i-1], height[i]);
//         }

//         int rightside [] = new int[n];
//         rightside[n-1] = height[n-1];
//         for(int i=n-2; i>=0; i--){
//             rightside[i] = Math.max(rightside[i+1], height[i]);
//         }

//         int trappedWater = 0, waterlevel;
//         for(int i = 0; i<n; i++){
//             waterlevel = Math.min(leftside[i], rightside[i]);
//             trappedWater += waterlevel - height[i];
//         }
//         return trappedWater;
//     }
// public static void main(String args[]){
//     int height[] = {4,2,0,3,2,5};
//     System.out.println("Total trapped Water is: "+trappedRainwater(height));
// }

// }



//  5).

public class Assignment {
    public static void triplets(int nums[]){
        int n = nums.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    if((nums[i] + nums[j] + nums[k] == 0)){
                        System.out.print("["+nums[i]+","+nums[j]+","+nums[k]+"],");
                    }
                }
            }
        }

    }
public static void main(String args[]){
     int nums[] = {-1,0,1,2,-1,-4};
     triplets(nums);
        

}

}