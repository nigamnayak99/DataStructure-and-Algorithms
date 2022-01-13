package sorting;

public class LomutoPartiton {
	//We have to return pivot element position
	int lPartition(int[] arr, int l,int h) {
		int pivot = arr[h]; // if pivot element is given and it's other than last element then 
							//swap given position with last element .
		int i = l - 1;
		for(int j = l ; j <= h -1 ; j++) {
			if(arr[j] < pivot) {
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,h,i+1);
		
		
		for(int k = l; k <= h;k++) {
			System.out.println(arr[k]);
		}
		return i+1;
	}
	
	public void swap(int[] arr, int source , int target) {
		int temp = arr[source];
		arr[source] = arr[target];
		arr[target] = temp;
	}

}
