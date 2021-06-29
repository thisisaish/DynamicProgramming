public class DpLCS {

    private static int lcs(String str1, String str2, int m, int n){
        int[][] dp = new int[m+1][n+1];
        for(int row = 0; row <= m;row++){
            for(int col = 0; col <= n;col++){
                if(row == 0 || col == 0)dp[row][col] = 0;
                else if(str1.charAt(row-1) == str2.charAt(col-1))dp[row][col] = 1+dp[row-1][col-1];
                else
                    dp[row][col] = Math.max(dp[row-1][col], dp[row][col-1]);
            }
        }
        return dp[m][n];
    }

    public static void main(String[] args){
        //Driver code
        String str1 = "abbba";
        String str2 = "abab";
        System.out.println("Length of longest common subsequence is "+lcs(str1, str2, str1.length(), str2.length()));
    }
}
