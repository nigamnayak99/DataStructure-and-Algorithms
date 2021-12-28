package searching;

public class MedianOfSortedArrays {
	
	public int mergeTwoSortedArrays(int[] arr1, int[] arr2) {
		int m = arr1.length;
		int n = arr2.length;
		int l = m + n ;
		int[] ans = new int[l];
		int i =0;
		int j = 0;
		int k = 0;
		while(i < m && j < n) {
			if(arr1[i] <= arr2[j]) {
				ans[k] = arr1[i];
				i++;
				k++;
			}else {
				ans[k] = arr2[j];
				j++;
				k++;
			}
		}
		while(i < m) {
			ans[k++] = arr1[i++];
		}
		while(j < n) {
			ans[k++] = arr2[j++];
		}
		if( l % 2 == 0) {
			int t1 = l / 2;
			int t2 = (l / 2) + 1;
			return (ans[t1]+ans[t2]) / 2;
		}
		return ans[l / 2];
	}

	private void printArray(int[] ans) {
		// TODO Auto-generated method stub
		for(int i =0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
	}

}
