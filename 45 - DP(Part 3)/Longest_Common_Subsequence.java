// Recursion

// public class Longest_Common_Subsequence {
//     static int LCS(String str1, String str2, int n, int m){
//         if(n == 0 || m == 0){
//             return 0;
//         }

//         if(str1.charAt(n-1) == str2.charAt(m-1)){
//             return (1 + LCS(str1, str2, n-1, m-1));  
//         }
        
//         else{
//             return Math.max(LCS(str1, str2, n-1, m), LCS(str1, str2, n, m-1));
//         }

//     }
//     public static void main(String args[]){
//         String str1 = "abcdge";
//         String str2 = "abedg";

//         System.out.print(LCS(str1, str2, str1.length(), str2.length()));
//     }
// }



// Memoization --> O(n * m)
// public class Longest_Common_Subsequence {
//     static int LCS(String str1, String str2, int n, int m, int dp[][]){
//         if(n == 0 || m == 0){
//             return 0;
//         }

//         if(dp[n][m] != -1){
//             return dp[n][m];
//         }

//         if(str1.charAt(n-1) == str2.charAt(m-1)){
//             return dp[n][m] = (1 + LCS(str1, str2, n-1, m-1, dp));  
//         }
        
//         else{
//             int ans1 = LCS(str1, str2, n-1, m, dp);
//             int ans2 = LCS(str1, str2, n, m-1, dp);

//             return Math.max(ans1, ans2);
//         }
//     }
//     public static void main(String args[]){
//         String str1 = "abcdge";
//         String str2 = "abedg";

//         int n = str1.length();
//         int m = str2.length();

//         int dp[][] = new int[n+1][m+1];

//         //initialization
//         for(int i=0; i<dp.length; i++){
//             for(int j=0; j<dp[0].length; j++){
//                 dp[i][j] = -1;
//             }
//         }

//         System.out.print(LCS(str1, str2, n, m, dp));
//     }
// }


// Tabulation
public class Longest_Common_Subsequence {
    static int LCS(String str1, String str2, int n, int m){
        int dp[][] = new int[n+1][m+1];

        for(int i=0; i<n+1; i++){
            for(int j=0; j<m+1; j++){
                if(i == 0 || j==0){
                    dp[i][j] = 0;
                }
            }
        }

        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }  
        }
        return dp[n][m];  
    }
    public static void main(String args[]){
        String str1 = "abcdge";
        String str2 = "abedg";
        int n = str1.length();
        int m = str2.length();

        System.out.print(LCS(str1, str2, n, m));
    }
}
