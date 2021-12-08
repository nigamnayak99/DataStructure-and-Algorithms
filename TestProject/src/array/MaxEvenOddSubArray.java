package array;

public class MaxEvenOddSubArray {
	
	
	public int maxEvenOddSubArray(int[] arr) {
		int n = arr.length;
		if(n == 0 || n == 1)
			return n;
		int max_Even_Odd = 1;
		int sub_max_Even_Odd = 1;
		boolean prev = false;
		if(arr[0] % 2 == 0)
			prev = true;
		
		for( int i = 1; i < n; i++) {
			if((arr[i] % 2 == 0) != prev) {
				sub_max_Even_Odd++;
				prev = !prev;
				max_Even_Odd = Math.max(max_Even_Odd, sub_max_Even_Odd);
			}
			else {
				sub_max_Even_Odd = 1;
				max_Even_Odd = Math.max(max_Even_Odd, sub_max_Even_Odd);
			}
		}
		
		return max_Even_Odd;
	}

}
