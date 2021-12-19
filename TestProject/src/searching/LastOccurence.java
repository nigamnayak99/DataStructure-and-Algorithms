package searching;

public class LastOccurence {
	
	//This is iterative version  of modified binary search .
	public int getLastOccurence(int[] arr,int element) {
		int low = 0;
		int high = arr.length - 1;
		if(high < low)
			return -1 ;
		while(low <= high) {
			int mid = (low + high) / 2;
			if(arr[mid] > element) {
				high = mid - 1;
			}else if(arr[mid] < element) {
				low = mid + 1;
			}else { // if arr[mid] have the element we are checking for
				if(mid == arr.length - 1 ) {
					return mid;
				}
				else if(mid != arr.length - 1 && arr[mid] != arr[mid + 1]) //check if it is the last occurence of element
					return mid; // return it 
				else
					low = mid + 1; 
			}
		}
		return - 1;
	}

}
