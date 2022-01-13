package sorting;

public class HoarePartition {
	
	int hPartition(int[] arr, int l ,int h) {
		int i = l - 1;
		int j = h + 1;
		int pivot = arr[l];
		while(true) {
			do {
				i++;
			}while(arr[i] > pivot);
			do {
				j--;
			}while(arr[j] < pivot);
			if(i >= j)
				return j;
			swap(arr,i,j);
		}
	}
	
	public void swap(int[] arr, int source , int target) {
		int temp = arr[source];
		arr[source] = arr[target];
		arr[target] = temp;
	}

}
