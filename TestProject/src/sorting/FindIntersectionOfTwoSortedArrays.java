package sorting;

public class FindIntersectionOfTwoSortedArrays {
	
	public void findIntersection(int[] a, int[] b) {
		int m = a.length;
		int n = b.length;
			int i = 0;
			int j =0;
			while(i < m && j < n) {
				if(i > 0 && a[i] == a[i-1]) {
					i++;
				}
				else if(a[i] == b[j]) {
					System.out.println(a[i]);
					i++;
					j++;
				}else if(a[i] < b[j]) {
					i++;
				}else {
					j++;
				}
			}
	}

}
