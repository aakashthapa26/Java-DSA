// //1. Recursion Method --> (T.C - O(2^n))

// // public class Climbing_Stairs {
// //     static int countWays(int n){
// //         if(n == 0){
// //             return 1;
// //         }
// //         if(n < 0){
// //             return 0;
// //         }
// //         return countWays(n-1)+countWays(n-2);
// //     }
// //     public static void main(String args[]){
// //         int n = 5; // n=3 --> 4 , n=4 --> 5
// //         System.out.print(countWays(n));
// //     }
// // }



// //2. (Recursion + Memoization) Methond --> (T.C - O(n))

// import java.util.*;
// public class Climbing_Stairs {
//     static int countWays(int n, int ways[]){
//         if(n == 0){
//             return 1;
//         }
//         if(n < 0){
//             return 0;
//         }

//         if(ways[n] != -1){
//             return ways[n];
//         }
//         ways[n] = countWays(n-1, ways)+countWays(n-2, ways);
//         return ways[n];
//     }
//     public static void main(String args[]){
//         int n = 5; 
//         int ways[] = new int[n+1];
//         Arrays.fill(ways, -1);
//         System.out.print(countWays(n, ways));
//     }
// }


import java.util.*;
public class Climbing_Stairs{
    static int countWays(int n, int ways[]){
        if(n == 0){
            return 1;
        }

        if(n < 0){
            return 0;
        }

        if(ways[n] != -1){
            return ways[n];
        }

        ways[n] = countWays(n-1, ways)+countWays(n-2, ways);
        return ways[n];
    }
public static void main(String args[]){

    int n  = 5;
    int ways[] = new int[n+1];
    Arrays.fill(ways, -1);


}
}