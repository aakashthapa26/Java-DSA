// Recursion --> O(2^n)

// public class Catalans_Number {
//     static int catalanRec(int n){
//         if(n == 0 || n == 1){
//             return 1;
//         }

//         int ans = 0;
//         for(int i=0; i<n; i++){
//             ans += catalanRec(i)*catalanRec(n-i-1);
//         }
//         return ans;
//     }
//     public static void main(String args[]){
//         int n = 4;
//         System.out.print(catalanRec(n));
//     }
// }


//Memoization ()

// import java.util.*;
// public class Catalans_Number {
//     static int catalanRec(int n, int dp[]){
//         if(n == 0 || n == 1){
//             return 1;
//         }

//         if(dp[n] != -1){
//             return dp[n];
//         }

//         int ans = 0;
//         for(int i=0; i<n; i++){
//             ans += catalanRec(i, dp)*catalanRec(n-i-1, dp);
//         }
//         return ans;
//     }
//     public static void main(String args[]){
//         int n = 4;

//         int dp[] = new int[n+1];
//         Arrays.fill(dp, -1);

//         System.out.print(catalanRec(n, dp));
//     }
// }


//Tabulation (n^2)

public class Catalans_Number{
    static int catalansTab(int n){
        int dp[] = new int[n+1];

        dp[0]=dp[1] = 1;
        for(int i=2; i<n+1; i++){ //Ci
            for(int j=0; j<i; j++){
                dp[i] += dp[j]*dp[i-j-1];  //Ci = Cj * Ci-j-1
            }
        }
        return dp[n];
    }
public static void main(String args[]){

    int n = 4;

    System.out.print(catalansTab(n));
}
}