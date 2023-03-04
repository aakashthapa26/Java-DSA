// // Recursion -> n^n-1

// public class Matrix_Chain_Multiplication{
//     static int mcm(int arr[], int i, int j){
//         if(i == j){
//             return 0; //single matrix case
//         }

//         int MinCost = Integer.MAX_VALUE;
//         for(int k=i; k<j; k++){ 
//             int cost1 = mcm(arr, i, k); //Ai...Ak => arr[i-1]xarr[k]
//             int cost2 = mcm(arr, k+1, j); //Ai+1...Aj => arr[k]xarr[j]
//             int cost3 = arr[i-1] * arr[k] * arr[j];
//             int finalCost = cost1 + cost2 + cost3;
//             MinCost = Math.min(MinCost, finalCost);
//         }
//         return MinCost;
//     }
// public static void main(String args[]){

//      int arr[] = {1, 2, 3, 4, 3}; //n = 5
//      int n = arr.length;

//      System.out.print(mcm(arr, 1 ,n-1));

// }
// }


// Memoization (O^2)

// import java.util.*;
// public class Matrix_Chain_Multiplication{
//     static int mcm(int arr[], int i, int j, int dp[][]){
//         if(i == j){
//             return 0; //single matrix case
//         }

//         if(dp[i][j] != -1){
//             return dp[i][j];
//         }

//         int MinCost = Integer.MAX_VALUE;
//         for(int k=i; k<j; k++){ 
//             int cost1 = mcm(arr, i, k, dp); //Ai...Ak => arr[i-1]xarr[k]
//             int cost2 = mcm(arr, k+1, j, dp); //Ai+1...Aj => arr[k]xarr[j]
//             int cost3 = arr[i-1] * arr[k] * arr[j];
//             int finalCost = cost1 + cost2 + cost3;
//             MinCost = Math.min(MinCost, finalCost);
//         }
//         return dp[i][j] = MinCost;
//     }
// public static void main(String args[]){

//      int arr[] = {1, 2, 3, 4, 3}; //n = 5
//      int n = arr.length;

//      int dp[][] = new int[n][n];
//      for(int i=0; i<n; i++){
//         Arrays.fill(dp[i], -1);
//      }

//      System.out.print(mcm(arr, 1 ,n-1, dp));

// }
// }



//Tabulation

import java.util.*;
public class Matrix_Chain_Multiplication{
    static int mcm(int arr[], int i, int j, int dp[][]){
        if(i == j){
            return 0; //single matrix case
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int MinCost = Integer.MAX_VALUE;
        for(int k=i; k<j; k++){ 
            int cost1 = mcm(arr, i, k, dp); //Ai...Ak => arr[i-1]xarr[k]
            int cost2 = mcm(arr, k+1, j, dp); //Ai+1...Aj => arr[k]xarr[j]
            int cost3 = arr[i-1] * arr[k] * arr[j];
            int finalCost = cost1 + cost2 + cost3;
            MinCost = Math.min(MinCost, finalCost);
        }
        return dp[i][j] = MinCost;
    }
public static void main(String args[]){

     int arr[] = {1, 2, 3, 4, 3}; //n = 5
     int n = arr.length;

     int dp[][] = new int[n][n];
     for(int i=0; i<n; i++){
        Arrays.fill(dp[i], -1);
     }

     System.out.print(mcm(arr, 1 ,n-1, dp));

}
}

