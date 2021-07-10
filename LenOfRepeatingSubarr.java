//Given two integer arrays return the maximum length of subarray that appears in both the arrays.

public class LenOfRepeatingSubarr {
	
	private static int lenOfRepSubarr(int[] num1, int[] num2) {
		int ans = 0;
		int[][] memo = new int[num1.length + 1][num2.length + 1];
		for(int i = num1.length-1 ; i >= 0; i-- ) {
            for(int j = num2.length-1 ; j >= 0; j-- ) {
                if (num1[i] == num2[j]) {
                    memo[i][j] = memo[i+1][j+1] + 1;
                    if (ans < memo[i][j]) ans = memo[i][j];
                }
            }
     }

		return ans;
	}

	public static void main(String[] args) {
		int[] num1 = {0,1,1,1,1};
		int[] num2 = {1,0,1,0,1};
		System.out.println(lenOfRepSubarr(num1, num2));
	}
	
}
