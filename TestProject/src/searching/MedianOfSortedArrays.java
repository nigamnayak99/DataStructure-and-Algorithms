package searching;

public class MedianOfSortedArrays {
	
	public int[] mergeTwoSortedArrays(int[] arr1, int[] arr2) {
		int n1 = arr1.length;
		int n2 = arr2.length;
		int n3 = n1 + n2;
		int[] ans = new int[n3];
		int i =0;
		int a1 = 0;
		int a2 = 0;
		while(a1 < n1 && a2 < n2) {
			if(arr1[a1] < arr2[a2]) {
				ans[i] = arr1[a1];
			}else {
				ans[i] = arr2[a2];
			}
		}
		while(a1 < n1 ) {
			ans[i] = arr1[a1];
			a1++;
			i++;
		}
		while(a2 < n2) {
			ans[i] = arr2[a2];
			a2++;
			i++;
		}
		return ans;
	}

}
