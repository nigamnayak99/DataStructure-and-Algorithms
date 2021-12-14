package array;

public class HasEquilibriumPoint {
	
	//This is naive apporaoch
	//This method is also missing some of the edge cases
	public boolean test(int[] prefixSum) {
		int n = prefixSum.length;
		if(n == 1 || n == 0) {
			return false;
		}
		boolean ans = false;
		for(int i =1; i < n - 1 ;i++) {
			if(prefixSum[i - 1] == (prefixSum[n - 1] - prefixSum[i])) {
				
				ans = true;
			}
		}
		return ans;
	}
	
	
	//So have to find total sum first.
	// Idea is to calclate left Sum and right sum on the go . 
	
	public boolean hasEquillibriumPoint(int[] arr) {
		int n = arr.length;
		int total_sum = 0;
		for(int i = 0; i < n ; i++) {
			total_sum += arr[i];
		}
		boolean res = false;
		int left_sum  = 0;
		for(int i = 0; i < n ; i++) {
			if(left_sum == (total_sum - arr[i])) {
				res = true;
			}
			left_sum += arr[i];
			total_sum -= arr[i];
		}
		return res;
	}

}
