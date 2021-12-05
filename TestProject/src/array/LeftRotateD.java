package array;

public class LeftRotateD {
	
	public int[] leftRotateByD(int[] arr,int d) {
		int n = arr.length;
		if(n == 0 || n == 1) {
			return arr;
		}
		reverse(arr,0,d-1);
		reverse(arr,d,n-1);
		reverse(arr,0,n-1);
		return arr;
	}
	
	public int[] reverse(int[] arr , int low, int high) {
		int n = arr.length;
		if(n == 0 || n == 1) {
			return arr;
		}
		while( low <= high) {
			int temp = arr[high];
			arr[high] = arr[low];
			arr[low] = temp;
			low++;
			high--;
		}
		return arr;
	}

}
