package array;

public class PrefixSum {
	
	public int[] getPrefixSum(int[] arr) {
		int n = arr.length;
		int[]  sum= new int[n];
		if(n == 1) {
			return arr;
		}
		sum[0] = arr[0];
		for(int i =1;i < n;i++) {
			sum[i] = arr[i] + sum[i - 1];
		}
		return sum;
	}

}
