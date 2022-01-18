package sorting;

import java.util.Arrays;

public class ChocolateDistributionProblem {
	
	public static int findMinimum(int[] arr,int l ,int r , int k) {
		Arrays.sort(arr);
		int res = arr[k - 1] - arr[0];
		for(int i = 1; i+k-1 < arr.length ;i++) {
			res = Math.min(res ,arr[i+k-1] - arr[i]);
		}
		return res;
	}

}
