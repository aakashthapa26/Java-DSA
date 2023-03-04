// 1. Maximum Balanced String Partition
// public class practiceset {
//     static int BalancedPartition(String str, int n){
//         int r = 0, l = 0;
//         int ans = 0;
//         for(int i=0; i<n; i++) {
//             if(str.charAt(i) == 'R'){
//                 r++;
//             }
//             else if(str.charAt(i) == 'L') {
//                 l++;
//             }

//             if(r == l) {
//                 ans++;
//             }
//         }
//         return ans;
//     }
//     public static void main(String args[]) {
//         String str = "LRRRRLLRLLRL";
//         int n = str.length();
//         System.out.println(BalancedPartition(str, n));
//     }
// }



// 2. kth Largest odd Number in a given range (Incomplete)

// import java.util.*;
// public class practiceset {
//     static int kthlargestOddNumber(int L, int R, int k) {
//         ArrayList<Integer> ans = new ArrayList<>();
//         for(int i=L; i<=R; i++){
//             ans.add(i);
//         }

//         Collections
//     }
// public static void main(String args[]){
//     int L = -3, R = 3, k = 1;
//     System.out.print(kthlargestOddNumber(L, R, k));    

// }

// }


// 3. Lexicographically smallest string of length N and sum K. (Incomplete)

// public class practiceset {
//     static char[] lexo_small(int n, int k) {
//         char arr[] = new char[n];
//     }
// public static void main(String args[]){
//    int n=5, k = 42;
   
//    char arr[] = lexo_small(n, k);
//    System.out.print(new String(arr));

// }

// }



// 4. Best Time to Buy and Sell Stock

// public class practiceset {
//     static int maxProfit(int prices[], int n) {
//         int buy = prices[0];
//         int maxProfit = 0;

//         for(int i=1; i<n; i++) {
//             if(buy > prices[i]) {
//                 buy = prices[i];
//             }
//             else if(prices[i]-buy > maxProfit){
//                 maxProfit = prices[i]-buy;
//             }
//         }
//         return maxProfit;
//     }
// public static void main(String args[]){
//    int prices[] = {7, 1, 5, 3, 6, 4};
//    int n = prices.length;
//    System.out.print(maxProfit(prices, n));


// }

// }



// 5. Split the given array into K sub-arrays

public class practiceset {
public static void main(String args[]){
    int arr[] = {1, 2, 3, 4};
    int k = 3; // k divisons
    int n = 4; // size of Array
    solve(arr, l,)

}

}