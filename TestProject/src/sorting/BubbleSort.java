package sorting;

public class BubbleSort {
	
	public int[] naiveBubbleSort(int[] arr) {
		int n = arr.length;
		for(int i = 0 ; i < n-1; i++) {
			for(int j = 0; j < n - 1; j++) {
				if(arr[j] > arr[j+1]) {
					swap(arr,j,j+1);
				}
			}
		}
		return arr;
	}
	
	public int[] bubbleSort(int[] arr) {
		int n = arr.length;
		for(int i = 0 ; i < n-1; i++) {
			for(int j = 0; j < n - i - 1; j++) {
				if(arr[j] > arr[j+1]) {
					swap(arr,j,j+1);
				}
			}
		}
		return arr;
	}
	
	public int[] optimizedBubbleSort(int[] arr) {
		boolean isSwapped = false;
		int n = arr.length;
		for(int i = 0 ; i < n-1; i++) {
			for(int j = 0; j < n - i - 1; j++) {
				if(arr[j] > arr[j+1]) {
					swap(arr,j,j+1);
					isSwapped = true;
				}
			}
			if(!isSwapped) {
				break;
			}
		}
		return arr;
	}
	
	
	
	
	public static int[] swap(int[] arr, int start, int end) {
		int temp = arr[end];
		arr[end] = arr[start];
		arr[start] = temp;
		return arr;
	}

}
