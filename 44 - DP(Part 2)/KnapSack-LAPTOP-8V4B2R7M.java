// // 0-1 KnapSack

// // Recursion  --> T.C - 0(2^n)

// // public class KnapSack{
// //     static int knapsack(int val[], int wt[], int w, int n){
// //         if(w == 0 || n == 0){
// //             return 0;
// //         }

// //         if(wt[n-1] <= w){
// //             int ans1 = val[n-1] + knapsack(val, wt, w-wt[n-1], n-1);
            

// //             int ans2 = knapsack(val, wt, w-wt[n-1], n-1);

// //             return Math.max(ans1, ans2);
// //         }

// //         else{
// //             return knapsack(val, wt, w-wt[n-1], n-1);
// //         }
// //     }
// //     public static void main(String args[]){
// //         int val[] = {15, 14, 10, 45, 30};
// //         int wt[] = {2, 5, 1 , 3, 4};
// //         int w = 7;

// //         System.out.println(knapsack(val, wt, w, val.length));
// //     }
// // }



// // Memoization  --> T.C - 0(n * W)

// // public class KnapSack{
// //     static int knapsack(int val[], int wt[], int W, int n, int dp[][]){
// //         if(W == 0 || n == 0){
// //             return 0;
// //         }

// //         if(dp[n][W] != -1){
// //             return dp[n][W];
// //         }

// //         if(wt[n-1] <= W){
// //             int ans1 = val[n-1] + knapsack(val, wt, W-wt[n-1], n-1, dp);
            

// //             int ans2 = knapsack(val, wt, W-wt[n-1], n-1, dp);

// //             dp[n][W] = Math.max(ans1, ans2);
// //             return dp[n][W];
// //         }

// //         else{
// //             dp[n][W] = knapsack(val, wt, W-wt[n-1], n-1, dp);
// //             return dp[n][W];
// //         }
// //     }
// //     public static void main(String args[]){
// //         int val[] = {15, 14, 10, 45, 30};
// //         int wt[] = {2, 5, 1 , 3, 4};
// //         int W = 7;

// //         int dp[][] = new int[val.length+1][W+1];
// //         for(int i=0; i<dp.length; i++){
// //             for(int j=0; j<dp[0].length; j++){
// //                 dp[i][j] = -1;
// //             }
// //         }

// //         System.out.println(knapsack(val, wt, W, val.length, dp));
// //     }
// // }



// // Tabulation

// public class KnapSack{
//     // static int knapsack(int val[], int wt[], int W){
//     //     int n = val.length;
//     //     int dp[][] = new int[n+1][W+1];

//     //     for(int i=0; i<dp.length; i++){
//     //         dp[i][0] = 0;
//     //     }

//     //     for(int i=0; i<dp[0].length; i++){
//     //         dp[0][i] = 0;
//     //     }

//     //     for(int i=1; i<n+1; i++){
//     //         for(int j = 1; j<W+1; j++){
//     //             int v = val[i-1];
//     //             int w = wt[i-1];

//     //             if(w <= j){
//     //                 int incProfit = v + dp[i-1][j-w];
//     //                 int excProfit = dp[i-1][j];
//     //                 dp[i][j] = Math.max(incProfit, excProfit);
//     //             }

//     //             else{
//     //                 int excProfit = dp[i-1][j];
//     //                 dp[i][j] = excProfit;
//     //             }
//     //         }
//     //     }
//     //     return dp[n][W];
//     // }

    
//     static int knapsack(int val[], int wt[], int W, int dp[][]){
//         int n = val.length;
//         for(int i=0; i<dp.length; i++){
//             dp[i][0] = 0;
//         }
//         for(int i=0; i<dp[0].length; i++){
//             dp[0][i] = 0;
//         }

//         for(int i=1; i<n+1; i++){
//             for(int j=1; j<W+1; j++){
//                 int v = val[i-1];
//                 int w = wt[i-1];

//                 if(w <= j){
//                     int incProfit = v + dp[i-1][j-w];
//                     int excProfit = dp[i-1][j];

//                     dp[i][j] = Math.max(incProfit, excProfit);
//                 }

//                 else{
//                     int excProfit = dp[i-1][j];
//                     dp[i][j] = excProfit;
//                 }
//             }
//         }
//         return dp[n][W];
//     }
//     public static void main(String args[]){
//         int val[] = {15, 14, 10, 45, 30};
//         int wt[] = {2, 5, 1 , 3, 4};
//         int W = 7;

//         int dp[][] = new int[val.length+1][W+1];
//         for(int i=0; i<dp.length; i++){
//             for(int j=0; j<dp[0].length; j++){
//                 dp[i][j] = -1;
//             }
//         }

//         System.out.println(knapsack(val, wt, W, dp));
//     }
// }


public class KnapSack{

    public static int knapsack(int val[], int wt[], int W){
        int n = val.length;
        int dp[][] = new int[n+1][W+1];

        for(int i=0; i<dp.length; i++){// Generally not required to assign 0 as in java, default it takes 0.
            dp[i][0] = 0;
        }
        for(int i=0; i<dp[0].length; i++){// Generally not required to assign 0 as in java, default it takes 0.
            dp[0][i] = 0;
        }

        for(int i=1; i<n+1; i++){
            for(int j=1; j<W+1; j++){
                int v = val[i-1];
                int w = wt[i-1];

                if(w <= j){
                    int incProfit = v + dp[i-1][j-w];
                    int excProfit = dp[i-1][j];
                    dp[i][j] = Math.max(incProfit, excProfit); 
                }
                else{
                    int excProfit = dp[i-1][j];
                    dp[i][j] = excProfit;
                }
            }
        }
        return dp[n][W];
    }
public static void main(String args[]){

    int val[] = {15, 14, 10, 45, 30};
    int wt[] = {2, 5, 1 , 3, 4};
    int W = 7;
 
    int dp[][] = new int[val.length+1][W+1];
    for(int i=0; i<dp.length; i++){
        for(int j = 0; j<dp[0].length; j++){
            dp[i][j] = -1;
        }
    }

    System.out.println(knapsack(val, wt, W));
}
}