package sorting;

public class FindUnionOFTwoSortedArrays {
	
	public void findUnion(int[] a, int[] b) {
		int m = a.length;
		int n = b.length;
		int i = 0;
		int j = 0;
		while(i < m && j < n) {
			if(i > 0 && a[i] == a[i-1]) {
				i++;
				continue;
			}
			if(j > 0 && b[j] == b[j-1]) {
				j++;
				continue;
			}
			if(a[i] < b[j] ) {
				System.out.println(a[i]);
				i++;
			}else if(a[i] > b[j]) {
				System.out.println(b[j]);
				j++;
			}else {
				System.out.println(a[i]);
				i++;
				j++;
			}
		}
		while(i < m) {
			System.out.println(a[i]);
			i++;
		}
		while(j < n) {
			System.out.println(b[j]);
			j++;
		}
	}

}
