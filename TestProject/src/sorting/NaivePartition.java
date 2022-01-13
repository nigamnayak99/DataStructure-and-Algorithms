package sorting;

public class NaivePartition {
	
	public int nPartition(int[] arr , int l , int h,int p) {
		int pivot = arr[p];
		int n = (h - l) + 1;
		int[] temp = new int[n];
		int index = 0;
		for(int i =0; i <= h ; i++) {
			if(arr[l+i] < pivot ) {
				temp[index] = arr[l+i];
				index++;
			}
		}
		for(int i =0; i <= h ; i++) {
			if(arr[l+i] == pivot ) {
				temp[index] = arr[l+i];
				index++;
			}
		}
		int res = index + l -1;
		for(int i =0; i <= h ; i++) {
			if(arr[l+i] > pivot ) {
				temp[index] = arr[l+i];
				index++;
			}
		}
		for(int i =0; i <= h ; i++) {
			arr[l+i] = temp[i] ;
		}
		for(int k = l; k <= h;k++) {
			System.out.println(arr[k]);
		}
		return res;
	}

}
