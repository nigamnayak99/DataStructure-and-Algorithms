package strings;

public class BuildLPSNaive {
	
	//This method will calculate lps value
	private static int longestPrefixSuffix(String pattern, int n) {
		/*
		 * For i = 0, lps[0] always . We are finding lps value till the current position
		 * in a string . So it can't be greater or equal to current position . It will
		 * always be less than current position . e.g for position i = 4 , it can't be
		 * greater than or equal to 4 ,it will be always lps[i] < i. for position 4 ,
		 * lps[i] can be 3,2,1,0 . So len represents possible length of lps , and we are
		 * traversing in decreasing order .
		 */
		for(int len = n -1 ; len > 0; len--) { 
			boolean flag = true;
			// we are comparing characters of possible prefix and suffix of particular length .
			for(int i = 0; i < len ; i++) {
				//Comparing Prefixes with suffixes for a particular len .
				if(pattern.charAt(i) != pattern.charAt(n - len + i)) // relation between corresponding characters of possible prefix and suffix of a particular length .
					flag = false;
			}
			//if all the character matches .
			if(flag == true) {
				return len;
			}
		}
		return 0;
	}
	
	/*
	 * We are going to fill corresponding lps string length, For Every Character in
	 * a String .
	 */
	public static int[] fillLPS(String s) {
		int n = s.length();
		int lps[] = new int[n];
		for(int i = 0; i < n ; i++) {
			lps[i] = longestPrefixSuffix(s,i+1);
		}
		return lps;
	}


}
