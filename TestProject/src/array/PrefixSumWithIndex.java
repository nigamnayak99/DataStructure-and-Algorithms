package array;

public class PrefixSumWithIndex {
	
	public int getPrefixSum(int[] arr, int left, int right) {
		int n = arr.length;
		int[] prefix = new int[n];
		//PreProcess ing the array , We may take O(n) for Preprocessing
		// But Query must be returned in O(1) time .
		prefix[0] = arr[0];
		for(int i = 1; i < n; i++) {
			prefix[i] = prefix[i-1] + arr[i];
		}
		int ans = 0;
		if(left == 0) {
			ans = prefix[right];
			return ans ;
		}
		ans = prefix[right] - prefix[left - 1];
		return ans;
	}

}
