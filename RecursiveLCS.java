class RecursiveLCS{

    private static int lcs(String str1, String str2, int m, int n){
        if(m == 0 || n == 0)return 0;       //Base condition
        if(str1.charAt(m-1) == str2.charAt(n-1))return 1+lcs(str1, str2, m-1, n-1);
        return Math.max(lcs(str1, str2, m-1, n), lcs(str1, str2, m, n-1));
    }

    public static void main(String[] arg){
        //Driver code
        String str1 = "abbba";
        String str2 = "abab";
        System.out.println("Length of longest common subsequence is "+lcs(str1, str2, str1.length(), str2.length()));
    }
}