package maths;

public class Prime {
	
	//Check for naive Prime method
	public boolean isPrimeNaive(int n) {
		if( n == 1) {
			return false;
		}
		for( int i = 2 ; i < n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	
	
	//Check by Optimized Prime
	public boolean isPrimeOptimized(int n) {
		if(n == 1) {
			return false;
		}
		for(int i = 2; i * i < n;i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	//check mostOptimized prime
	public boolean isPrimeMostOptimized(int n) {
		if(n == 1)
			return false;
		if(n % 2 == 0 || n % 3 == 0 ) {
			return false;
		}
		for(int i = 5 ; i*i < n; i = i+ 6) {
			if(n % i == 0 || n % (i+2) == 0 ) {
				return  false;
			}
		}
		return true;
	}
	
	//find all Prime factors of a give no
	public void findPrimeFactors(int n) {
		if(n <= 1) {
			System.out.println("No prime factor Exists");
		}
		for(int i = 2;i * i < n; i++) {
			while(n % i == 0) {
				System.out.print(i+",");
				n = n / i;
			}
		}
		System.out.print(n);
	}

}
