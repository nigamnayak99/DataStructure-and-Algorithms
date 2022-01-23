package sorting;

import java.util.Arrays;
import java.util.Collections;

public class MinimumDifferenceInAnArray {
	public int findMinDifference(int[] arr , int n) {
		if(n <= 1) {
			return Integer.MAX_VALUE;
		}
		Arrays.sort(arr);
		int min = arr[n-1] - arr[n-2];
		for(int i = n-2; i >= 1; i--) {
			min = Math.min(min, arr[i] - arr[i - 1]);
		}
		return min;
	}
}
