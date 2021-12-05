package array;

public class RemoveDuplicates {
	
	public int remove(int[] arr) {
		int n = arr.length;
		if(n == 0 || n == 1) {
			return n;
		}
		int low = 0;
		int mid = 1;
		while( mid < n) {
			if(arr[low] == arr[mid])
				mid++;
			else {
				arr[++low] = arr[mid];
				mid++;
			}
		}
		return low+1;
	}

}
