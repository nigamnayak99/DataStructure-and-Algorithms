package maths;

public class Factorial {
	public int fact(int n) {
		if(n == 0) {
			return 1;
		}
		return n * fact(n -1);
	}

}
