package array;

public class HasEquilibriumPoint {
	
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

}
