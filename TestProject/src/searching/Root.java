package searching;

public class Root {
	
	public int findSqrt(int x) {
		if( x == 0)
			return -1;
		if(x == 1)
			return 1;
		int low = 1;
		int high = x;
		int ans = -1;
		while( low <= high) {
			int mid = (low + high) / 2;
			if(mid * mid == x) {
				ans = mid ; 
				break;
			}else if(mid * mid > x) {
				if((mid - 1)* (mid - 1) < x) {
					ans = mid - 1;
					break;
				}
				high = mid - 1;
			}else {
				if((mid + 1) * (mid + 1) > x) {
					ans = mid ;
					break;
				}
				low = mid + 1;
			}
		}
		return ans;
	}

}
