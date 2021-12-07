package array;

public class MaximumDifferenceWithOrder {
	
	public int findMaxDiffWithOrd(int[] arr) {
		int n = arr.length;
		if(n == 0 || n == 1) {
			return -1;
		}
		int res = arr[1]-arr[0];
		int minVal = arr[0];
		for(int j = 1; j < n ; j++) {
			res = Math.max(res,arr[j]- minVal);
			minVal = Math.min(minVal, arr[j]);
		}
		return res;
	}

}
