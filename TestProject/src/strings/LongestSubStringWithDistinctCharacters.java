package strings;

import java.util.Arrays;

public class LongestSubStringWithDistinctCharacters {
	
	public static final int CHAR = 256;
	
	public static int findLength(String str) {
		int n = str.length();
		int res = 0;
		int prev[] = new int[CHAR];
		Arrays.fill(prev,-1); // filling the array with -1;
		int i =0; // to find the starting index of window;
		for(int j = 0; j < n;j++) { // to traverse the string as last index of window;
			i = Math.max(i, prev[str.charAt(j)]+1); //finding starting index of window.
			int maxEnd = j - i +1;// finding length currnt window , ending with j having distinct chars;
			res = Math.max(maxEnd, res);
			prev[str.charAt(j)] = j; // Updating the prev value where j appeared .
		}
		return res;
	}

}
