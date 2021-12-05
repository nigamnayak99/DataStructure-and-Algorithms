package array;

public class ReverseArray {
	
	public static int[] reverse(int[] arr) {
		if(arr.length == 0 || arr.length == 1)
			return arr;
		int low = 0;
		int high = arr.length - 1;
		while(low <= high) {
			swap(arr,low,high);
			low += 1;
			high -= 1;
		}
		return arr;
	}
	
	public static int[] swap(int[] arr,int low, int high) {
		int temp = arr[high];
		arr[high] = arr[low];
		arr[low] = temp;
		return arr;
	}

}
