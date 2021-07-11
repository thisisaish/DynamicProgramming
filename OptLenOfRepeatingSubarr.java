//Given two integer arrays return the maximum length of subarray that appears in both the arrays.

public class OptLenOfRepeatingSubarr {
	
	private static int lenOfRepSubarr(int[] num1, int[] num2) {
		int ans = 0;
		int[][] memo = new int[2][num2.length + 1];
		for(int i = num1.length-1 ; i >= 0; i-- ) {
		    Arrays.fill(memo[i%2], 0);	
		    for(int j = num2.length-1 ; j >= 0; j-- ) {
			if (num1[i] == num2[j]) {
			    memo[i%2][j] = memo[(i+1)%2][j+1] + 1;
			    if (ans < memo[i%2][j]) ans = memo[i%2][j];
			}
            	    }
     		}

		return ans;
	}

	public static void main(String[] args) {
		int[] num1 = {3,2,1,4,5};
		int[] num2 = {1,2,3,4,3,2,1};
		System.out.println(lenOfRepSubarr(num1, num2));
	}
	
}
