//Given an integer array nums, return the length of the longest strictly increasing subsequence.
public class LongestIncreasingSubseq {
	static int lis(int arr[])
    {
		int n = arr.length;
        int lis[] = new int[n];
        int i, j, max = 0;

        for (i = 0; i < n; i++)
            lis[i] = 1;


        for (i = 1; i < n; i++)
            for (j = 0; j < i; j++)
                if (arr[i] > arr[j] && lis[i] < lis[j] + 1)
                    lis[i] = lis[j] + 1;


        for (i = 0; i < n; i++)
            if (max < lis[i])
                max = lis[i];
 
        return max;
    }
 
    public static void main(String args[])
    {
        int arr[] = { 10, 9, 2, 5, 3, 7, 101, 18 };
        System.out.println(lis(arr));
    }
}
