package searching;

public class SortedRotatedArray {
	
	public static int search(int[] arr, int element) {
		if(arr.length == 0)
			return -1;
		if(arr.length == 1)
			return arr[0]== element ? 0 : -1;
		int ans = -1;
		int low = 0;
		int high = arr.length -1;
		while(low <= high) {
			System.out.println(low+","+high);
			int mid = (low + high) / 2;
			if((arr[mid] > element && element > arr[high]) ||(arr[mid] < element && element > arr[high]) ){
				high = mid - 1;
			}else if((arr[mid] > element && element < arr[high]) || (element > arr[mid] && element > arr[low]) ){
				low = mid + 1;
			}else {
				ans = mid;
				break;
			}
		}
		return ans;
	}

}
