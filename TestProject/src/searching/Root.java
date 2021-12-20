package searching;

public class Root {
	
	public int findSqrt(int x) {
		if( x == 0)
			return -1;
		if(x == 1)
			return 1;
		int low = 1;
		int high = x;
		while( low <= high) {
			System.out.println("low :"+low+"high :"+high);
			int mid = (low + high) / 2;
			if(mid * mid > x) {
				System.out.println(mid*mid+"Greater than "+x);
				high = mid / 2;
			}
			else if(mid * mid < x){
				System.out.println(mid*mid+"Less than "+x);
				int s =  mid + 1;
				if(s * s > x) {
					return mid;
				}else if(s * s == x) {
					return s;
				}else
					mid = mid + mid / 2;
			}else
				return mid ;
		}
		return -1;
	}

}
