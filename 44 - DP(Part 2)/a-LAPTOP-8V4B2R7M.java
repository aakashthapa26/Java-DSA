// import java.util.*;
// public class a{
//     public static void main(String args[]){
//         int val[] = {60, 100, 120};
//         int weight[] = {10, 20, 30};
//         int W = 50;

//         double ratio[][] = new double[val.length][2];

//         for(int i = 0; i<val.length; i++){
//             ratio[i][0] = i;
//             ratio[i][1] = val[i]/(double)weight[i];
//         }

//         Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

//         for(int i=val.length-1; i>=0; i--){
            
//         }
//     } 
// }


public class a{
    static int knapsack(int val[], int wt[], int W){
        int n = val.length;
        int dp[][] = new int[n+1][W+1];

        for(int i=1; i<n+1; i++){
            for(int j=1; j<W+1; j++){
                
                if(wt[i-1] <= j){ 
                    dp[i][j] = Math.max(val[i-1]+dp[i][j-wt[i-1]], dp[i-1][j]);
                }

                else{
                    dp[i][j] = dp[i-1][j];
                }   
            }
        }
        print(dp);
        return dp[n][W];
    }

    static void print(int [][]dp){
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }
public static void main(String args[]){

    int val[] = {15, 14, 10, 45, 30};
    int wt[] = {2, 5, 1 , 3, 4};
    int W = 7;

    System.out.print(knapsack(val, wt, W)); 

}
} 