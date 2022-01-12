package sorting;

public class SelectionSort {
	
//	public int[] sort(int[] arr) {
//		int n = arr.length;
//		for(int i = 0; i< n ; i++) {
//			int from = i;
//			int to = i;
//			for(int j = i+1; j < n ; j++) {
//				if(arr[to] > arr[j]) {
//					to = j;
//				}
//				if(from != to) {
//					swap(arr,from,to);
//				}
//			}
//		}
//		return arr;
//	}
//	
//	public static int[] swap(int[] arr, int start, int end) {
//		int temp = arr[end];
//		arr[end] = arr[start];
//		arr[start] = temp;
//		return arr;
//	}
	
	public int[] sort(int[] arr) {
		int n = arr.length;
		if(n == 1 || n == 0) {
			return arr;
		}
		for(int i = 0; i < n; i++) {
			int minPos = i;
			for(int j = i+1; j < n ;j++) {
				if(arr[j] < arr[minPos]) {
					minPos = j;
				}
			}
			if(minPos != i)
				swap(arr,i,minPos);
		}
		return arr;
	}
	
	public void swap(int[] arr, int target, int from) {
		int temp = arr[from];
		arr[from] = arr[target];
		arr[target] = temp;
	}


}
