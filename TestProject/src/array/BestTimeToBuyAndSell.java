package array;

public class BestTimeToBuyAndSell {
	
	public int maxProfit(int[] arr) {
		int n = arr.length;
		if(n == 0 || n == 1) {
			return -1;
		}
		int profit = 0;
		int max = arr[0];
		int min = arr[0];
		int subProfit = 0;
		for( int i =0; i < n ; i++) {
			if(arr[i] > max) {
				max = arr[i];
				subProfit = Math.max(max-min, subProfit);
			}
			max = arr[i];
			min = arr[i];
			profit = profit+ subProfit;
			subProfit =0;
		}
		return profit;
	}

}
