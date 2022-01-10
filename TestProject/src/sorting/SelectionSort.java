package sorting;

public class SelectionSort {
	
	public int[] sort(int[] arr) {
		int n = arr.length;
		for(int i = 0; i< n ; i++) {
			int from = i;
			int to = i;
			for(int j = i+1; j < n ; j++) {
				if(arr[to] > arr[j]) {
					to = j;
				}
				if(from != to) {
					swap(arr,from,to);
				}
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
