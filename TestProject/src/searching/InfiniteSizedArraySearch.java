package searching;

public class InfiniteSizedArraySearch {
	
	private static long unboundedBinarySearch(long[] arr, int i, int j, long x) {
		long ans = -1;
		if(j  < i)
			return -1;
		while(i <= j) {
			int mid = (i + j)/2;
			if(arr[mid] == x) {
				ans = mid;
				break;
			}
			else if(arr[mid] > x)
				j = mid -1;
			else 
				i = mid + 1;
		}
		return ans;
	}
	
	public static long search(long[] arr, long x) {
		if(x < arr[0]) {
			return -1;
		}
		if(x == arr[0])
			return 0;
		long ans = -1;
		int start = 1;
		while(arr[start] <= x) {
			if(arr[start] == x)
				ans= start * 2;
			start *= 2;
		}
		
		if(arr[start] == x)
			ans = start;
		else 
			ans = unboundedBinarySearch(arr,start/2,start,x);
		return ans;
	}


}
