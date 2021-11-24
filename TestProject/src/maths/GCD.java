package maths;

public class GCD {
	
	//This is Naive Euclidian Algorithm
	public int gcdNaive(int a , int b) {
		while(a != b) {
			if(a > b) {
				a = a - b;
			}else {
				b = b - a;
			}
		}
		return a;
	}
	
	//Optimized eucledian algorithm
	public int gcdEuclid(int a, int b) {
		if(b == 0) {
			return a;
		}else {
			return gcdEuclid(b, a % b);
		}
	}

}
