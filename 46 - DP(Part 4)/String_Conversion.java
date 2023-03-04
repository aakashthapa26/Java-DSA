// Tabulation (n * m)

public class String_Conversion {
    static int stringConversion(String str1, String str2){

        int length = lcs(str1, str2);
        int ans1 = difference(str1, length);
        int ans2 = difference(str2, length);
        return ans1 + ans2;
    }

    static int lcs(String str1, String str2){
        int n = str1.length();
        int m = str2.length();

        int dp[][] = new int[n+1][m+1];

        for(int i=0; i<n+1; i++){
            dp[i][0] = 0;
        }

        for(int j=0; j<m+1; j++){
            dp[0][j] = 0;
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

    static int difference(String str, int length){
        int n = str.length();
        return n - length;
    }
    public static void main(String args[]){
        String str1 = "pear";
        String str2 = "sea";

        System.out.print(stringConversion(str1, str2));
    }
}
