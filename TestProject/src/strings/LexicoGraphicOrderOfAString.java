package strings;

import maths.Factorial;

public class LexicoGraphicOrderOfAString {
	
	static final int CHAR = 256 ;
	
	
	public int findOrder(String str) {
		int res = 1;
		int n = str.length();
		Factorial f = new Factorial();
		int mul = f.fact(n);//finding factorial for length ;
		int count[] = new int[CHAR];
		//finding count of each character .
		for(int i = 0; i < n; i++) {
			count[str.charAt(i)] += 1;
		}
		//finding cummelative count .
		for(int i = 1; i < CHAR ; i++) {
			count[i] += count[i - 1];
		}
		for(int i = 0; i < n ; i++) {
			mul = mul / (n - i);
			res = res +( mul * count[str.charAt(i)  - 1]);
			for(int j = str.charAt(i);j < CHAR ; j++) {
				count[j]--;
			}
		}
		return res ;
	}

}
