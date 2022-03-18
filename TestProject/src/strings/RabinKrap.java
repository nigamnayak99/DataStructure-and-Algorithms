package strings;

import java.util.ArrayList;

public class RabinKrap {
	
	static final int d = 256;
	static final int q = 101;
	
	public static ArrayList<Integer> rabinKrapSearch(String text,String pattern){
		int m = pattern.length();
		int n = text.length();
		
		ArrayList<Integer> hitPoints = new ArrayList<Integer>();
		//computing (d^(M -1)) % q for calculating next hash function
		int h = 1;
		for(int i = 1; i <= m-1 ; i++) {
			h = ( h * d) % q;
		}
		

		//compute hash function for first window of text and pattern 
		int p = 0;
		int t = 0;
		for(int i = 0; i < m; i++) {
			p = (p * d + pattern.charAt(i)) % q;
			t = (t * d + text.charAt(i)) % q ;
		}
		
		//Start rolling hash and check for hit in between
		for(int i = 0; i <= (n - m) ; i++) {
			//check for hit 
			if(p == t) {
				boolean flag = true;
				//if hits check by individual character matching
				for(int j = 0; j < m; j++) {
					if(text.charAt(i+j) != pattern.charAt(j)) {
						flag = false;
						break;
					}
				}
				if(flag)
					hitPoints.add(i);
			}
			 
			//compute hash for next window(ti + 1)
			if(i < n -m) {
				t = ((d * (t - text.charAt(i)* h) + text.charAt(i + m))) % q;
				if(t < 0)
					t += q ;
			}
		}
		return hitPoints;
		
	}

}
