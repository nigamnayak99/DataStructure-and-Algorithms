package array;

public class MinimumConsecutiveFlips {
	
	public int minFlips(int[] arr) {
		int n = arr.length;
		if(n == 0)
			return -1;
		if(n == 1) 
			return 0;
		if(n == 2) {
			if(arr[0] == arr[1]) {
				return 0;
			}else {
				return 1;
			}
		}
		int ones = 0;
		int zeros = 0;
		int i = 0;
		int prev = arr[0];
		while(i < n) {
			if(arr[i] == prev ) {
				i++;
			}else {
				if(prev == 0) {
					zeros++;
				}else {
					ones++;
				}
				prev = arr[i];
				i++;
			}
		}
		if(arr[0] != arr[n-1]) {
			if(prev == 0) {
				zeros++;
			}else {
				ones++;
			}
		}
		if(zeros == ones)
			return zeros;
		
		return Math.min(zeros, ones);
	}

}
