package array;

public class WaveArray {
	
	public static int[] wave(int arr[],int n) {
		int i = 0;
		while(i < n - 1) {
			reverse(arr, i , i+1);
			i += 2;
		}
		return arr;
	}
	
	public static void reverse(int arr[], int start, int end) {
		int temp = arr[end];
		arr[end] = arr[start];
		arr[start] = temp;
	}

}
