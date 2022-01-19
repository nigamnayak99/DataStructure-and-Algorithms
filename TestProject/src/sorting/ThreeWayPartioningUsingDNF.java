package sorting;

public class ThreeWayPartioningUsingDNF {

	public int[] sort(int[] arr, int n) {
		int low = 0;
		int high = n -1;
		int mid = 0;
		while(mid <= high) {
			if(arr[mid] == 0) {
				swap(arr,mid,low);
				low++;
				mid++;
			}else if(arr[mid] == 1) {
				mid++;
			}
			else{
				swap(arr,mid,high);
				high--;
			}
		}
		return arr;
	}
	
	public void swap(int[] arr, int source , int target) {
		int temp = arr[source];
		arr[source] = arr[target];
		arr[target] = temp;
	}
}
