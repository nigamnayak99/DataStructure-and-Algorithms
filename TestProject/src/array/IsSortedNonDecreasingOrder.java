package array;

public class IsSortedNonDecreasingOrder {

	public boolean check(int[] arr) {
		int n = arr.length;
		if( n == 0)
			return false;
		if( n == 1)
			return true;

		for(int i =0 ; i < n - 1; i++) {
			if(arr[i] > arr[i+1]) {
				return false;
			}
		}
		return true;
	}
}
