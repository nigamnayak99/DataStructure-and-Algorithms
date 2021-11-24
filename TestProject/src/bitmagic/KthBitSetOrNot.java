package bitmagic;

public class KthBitSetOrNot {
	
	public boolean check(int n, int k) {
		boolean ans = false ;
		n = n >> (k-1);
		if((n & 1) == 1) {
			return true;
		}
		return ans;
	}

}
