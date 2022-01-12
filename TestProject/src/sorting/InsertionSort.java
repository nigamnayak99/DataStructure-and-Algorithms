package sorting;

public class InsertionSort {
	
	//My Intuitive approach
	public int[] sort(int arr[]) {
		int n = arr.length;
		for(int i = 1 ; i < n ; i++) {
			if(arr[i - 1] > arr[i])
				placeToSortedArray(arr,0,i-1,i,n);
		}
		return arr;
		
	}


	public void placeToSortedArray(int arr[], int start, int end, int target, int length) {
	// TODO Auto-generated method stub
		for(int i = start; i <= end; i++) {
			if(arr[i] <= arr[target]) {
				continue;
			}else {
				int temp = arr[target];
				int j = target;
				while(j >= i + 1) {
					arr[j] = arr[j-1];
					j--;
				}
				arr[i] = temp;
			}
		}
	}
	
	
	//Optimized approach
	//adds element to sorted part while traversing 
//	public int[] insertionSort(int arr[]) {
////		int n = arr.length;
////		for(int i = 0;i < length; i++) {
////			
////		}
//	}

}
