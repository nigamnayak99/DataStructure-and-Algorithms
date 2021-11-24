package maths;

public class LCM {
	
	//Naive Solution for LCM 
	public int lcmNaive(int a , int b) {
		int max = Math.max(a, b);
		while(true) {
			if(max % a == 0 && max % b == 0) {
				return max;
			}
			max++;
		}
	}
	
	//LCM optimized using euclidean algo
	
	public int lcmEuclid(int a, int b) {
		GCD gcd = new GCD();
		return (a * b)/gcd.gcdEuclid(a, b);
	}

}
