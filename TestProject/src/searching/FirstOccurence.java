package searching;

public class FirstOccurence {
	
	//This function is Lightly modified version of Binary Search
	public int getFirstOccurence(int[] arr,int low, int high, int element) {
		if(low == high) {
			if(arr[low] == element)
				return low;
		}
		if(high < low)
			return -1;
		int mid = (low + high) / 2;
		if(arr[mid] == element) {
			if(arr[mid - 1] == element) {
				return getFirstOccurence(arr,low,mid-1,element);
			}else {
				return mid;
			}
		}else if(arr[mid] > element)
			return getFirstOccurence(arr, low, mid -1, element);
		else 
			return getFirstOccurence(arr, mid + 1, high, element);
	}

}
