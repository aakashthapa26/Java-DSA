//1. Tribonacci Numbers

// Recursion -> (3^n)

// public class practiceset{
//     static int tri(int n){
//         if(n == 0 || n == 1){
//             return 0;
//         }

//         if(n == 2){
//             return 1;
//         }

//         return tri(n-1) + tri(n-2) + tri(n-3);
//     }
// public static void main(String args[]){

//     int n = 5;

//     for(int i=0; i<n; i++){
//         System.out.print(tri(i)+" ");
//     }
// }
// }


// Memoization
// import java.util.*;
// public class practiceset{
//     static int tri(int n, int dp[]){
//         if(n == 0 || n == 1){
//             return 0;
//         }

//         if(n == 2){ 
//             return 1;
//         }

//         if(dp[n] != -1){
//             return dp[n];
//         }

//         return dp[n] = tri(n-1, dp) + tri(n-2, dp) + tri(n-3, dp);
//     }
// public static void main(String args[]){

//     int n = 5;
//     int dp[] = new int[n];
//     Arrays.fill(dp, -1);
  
//     for(int i=0; i<n; i++){
//         System.out.print(tri(i, dp)+" ");
//     }
// }
// }

// Note : In Memoization & Recursion, There is always a possibility of "Stack Overflow"
//        for high value of n. ----> like in this case n > 39, output will be dummy value.

//        For avoiding "Stack Overflow" condition, We use Tabulation


// public class practiceset{
//     static void tri(int n){
//         int dp[] = new int[n];

//         dp[0] = dp[1] = 0;
//         dp[2] = 1;

//         for(int i=3; i<n; i++){
//             dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
//         }
        
//         for(int i=0; i<n; i++){
//             System.out.print(dp[i]+" ");
//         }
//     }
// public static void main(String args[]){

//     int n = 5;
    
//     tri(n);
    
// }
// }



//2. Print all combinations of balanced parenthese

public class practiceset{
    static int balParanthese(int n){
        
    }
public static void main(String args[]){

    int n = 1;
}
}