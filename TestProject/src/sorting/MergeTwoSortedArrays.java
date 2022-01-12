package sorting;

public class MergeTwoSortedArrays {
	
	public int[] merge(int arr1[] , int arr2[]) {
		int m = arr1.length ;
		int n = arr2.length ;
		int l = m + n;
		System.out.println(m+" "+n+" "+l);
		int arr[] = new int[l];
		int i = 0;
		int j = 0;
		int k = 0;
		while(i < m && j < n) {
			if((arr1[i] <= arr2[j])) {
				arr[k] = arr1[i];
				i++;
				k++;
			}
			else{
				arr[k] = arr2[j];
				k++;
				j++;
			}
		}
		while( i < m && k < l) {
			arr[k] = arr1[i];
			i++;
			k++;
		}
		while(j < n && k < l) {
			arr[k] = arr2[j];
			j++;
			k++;
		}
		return arr;
	}

}
