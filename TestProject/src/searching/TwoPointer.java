package searching;

public class TwoPointer {
	public static int[] findPairInSortedArray(int[] arr, int target) {
		int[] ans = new int[2];
		int low = 0;
		int high = arr.length - 1;
		while(low <= high) {
			int sum = arr[low] + arr[high];
			if(sum == target) {
				ans[0] = low;
				ans[1] = high;
				return ans ;
			}
			else if(sum > target) {
				high -= 1;
			}else {
				low += 1;
			}
		}
		return ans;
	}

}
