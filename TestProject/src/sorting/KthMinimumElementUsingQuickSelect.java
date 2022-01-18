package sorting;

public class KthMinimumElementUsingQuickSelect {

	LomutoPartiton lp = new LomutoPartiton();
	
	public int quickSelect(int[] arr, int l, int r, int k) {
		if(r > l) {
			int p = lp.lPartition(arr, l, r);
			if(p == k -1) {
				return arr[p];
			}
			else if(p > k - 1) {
				return quickSelect(arr,l,p-1,k);
			}
			else {
				return quickSelect(arr,p+1,r,k);
			}
		}
		return arr[k-1];
	}
}
