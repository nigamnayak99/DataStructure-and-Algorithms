package searching;

public class PeakElement {
	
	public int findPeak(int[] arr) {
		int high = arr.length - 1;
		int low = 0;
		while(low <= high) {
			System.out.println(low+" :: "+high);
			int mid = (low + high) / 2;
			if((mid == 0 || arr[mid] >= arr[mid - 1]) &&
					(mid == arr.length - 1 || arr[mid] >= arr[mid+1]))
				return mid ;
			if(mid > 0 && arr[mid + 1] >= arr[mid])
				low = mid +1;
			else
				high = mid - 1;
		}
		return -1;
	}

}
