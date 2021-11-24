package bitmagic;

public class CountSetBits {
	
	//Naive method
	public int countNaive(int n) {
		int res = 0;
		while(n > 0) {
			if((n & 1) == 1) {
				res += 1;
				
			}
			n = n >> 1;
		}
		return res;
	}
	
	
	//Brain Kananman's algorithm
	public int countUsingKernighanAlgo(int n) {
		int res = 0;
		if(n == 0) {
			return 0;
		}
		while( n > 0) {
			res = res + 1;
			n = n & ( n -1 );
		}
		return res;
	}
	
	//Using Lookuptable Method
	public int countUsingLookUpTableMethod(int n) {
		int res = 0;
		int table[] = new int[256];
		table[0] = 0;
		for(int i = 1; i < 256; i++) {
			table[i] = ( i & 1) + table[i / 2];
		}
		res =res + table[n & 0xff];
		n >>= 8 ;
		res =res + table[n & 0xff];
		n >>= 8 ;
		res =res + table[n & 0xff];
		n >>= 8 ;
		res =res + table[n & 0xff];
		return res;
	}
}
