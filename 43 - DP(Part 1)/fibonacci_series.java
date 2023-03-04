// Recursion

// public class fibonacci_series{
//     static int fib(int n){
//         if(n == 0 || n == 1){
//             return n;
//         }
//         return fib(n-1)+fib(n-2);
//     }
// public static void main(String args[]){

//     int n = 5;
//     System.out.print(fib(n));
// }
// }

// Memoization (Top Down)

public class fibonacci_series{ // T.C - O(n) --> Linear

    static int fib(int n, int f[]){
        if(n == 0 || n == 1){
            return n;
        }

        if(f[n] != 0){ // f[n] is already calculated
            return f[n]; 
        }
        f[n] = fib(n-1, f)+fib(n-2, f);
        return f[n];
    }
public static void main(String args[]){

    int n = 5;
    int f[] = new int [n+1]; // {0, 0, 0, 0, 0, 0}
    System.out.print(fib(n, f));

}
}



// Tabulation(Bottom Up)

// public class fibonacci_series{ // T.C - O(n) --> Linear

//     static int fibTabulation(int n){
//         int dp[] = new int[n+1];
//         dp[0] = 0;
//         dp[1] = 1;

//         for(int i=2; i<=n; i++){
//             dp[i] = dp[i-1]+dp[i-2];
//         }

//         return dp[n];
//     }
// public static void main(String args[]){

//     int n = 5;
//     int f[] = new int [n+1];
//     System.out.print(fibTabulation(n));

// }
// }