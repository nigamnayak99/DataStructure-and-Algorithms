package searching;

public class BinarySearch {
	
	//Recurssive BinarySearch
	static int bSearch(int arr[], int low, int high, int x)
	{
		if(low > high)
			return -1;

		int mid = (low + high) / 2;

		if(arr[mid] == x)
			return mid;

		else if(arr[mid] > x)
			return bSearch(arr, low, mid - 1, x);

		else
			return bSearch(arr, mid + 1, high, x);
	}
	
	//Iterative BinarySearch
	static int bSearchIterative(int[] arr, int x) {
		int low = 0;
		int high = arr.length - 1;
		while(low <= high) {
			int mid = (low + high) / 2;
			if(arr[mid] == x)
				return mid;
			else if(arr[mid] > x)
				high = mid - 1;
			else
				low = mid + 1;
		}
		return -1;
	}

}
