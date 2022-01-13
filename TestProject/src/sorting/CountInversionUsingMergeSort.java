package sorting;

public class CountInversionUsingMergeSort {
	
	public int count(int[] arr, int l , int r) {
		int res = 0;
		if(r > l) {
			int mid = l + (r - l) / 2;
			res = res +count(arr,l,mid);
			res = res +count(arr,mid+1,r);
			res = res +countInversion(arr,l,mid,r);
		}
		return res;
	}
	
	public int countInversion(int[] arr, int left, int mid, int right) {
		int m = (mid - left) + 1;
		int n = (right - mid);
		int[] leftArr = new int[m];
		int[] rightArr = new int[n];
		for(int i = 0; i < m ; i++) {
			leftArr[i] = arr[left+i];
		}
		for(int i = 0; i < n ; i++) {
			rightArr[i] =arr[mid+i+1];
		}
		int res = 0;
		int i =0;
		int j =0;
		int k =left;
		while( i < m && j < n) {
			if(leftArr[i] < rightArr[j]) {
				arr[k] = leftArr[i];
				i++;
			}else {
				arr[k] = rightArr[j];
				res += (m - i);
				j++;
			}
			k++;
		}
		while(i < m) {
			arr[k] = leftArr[i];
			i++;
			k++;
		}
		while(j < n) {
			arr[k] = rightArr[j];
			j++;
			k++;
		}
		return res;
		
	}

}
