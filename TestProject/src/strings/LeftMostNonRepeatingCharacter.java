package strings;

import java.util.Arrays;

public class LeftMostNonRepeatingCharacter {
	
	public static int findLeftMostNonRepeatingCharacter(String s) {
		int length = s.length();
		if(length == 0)
			return -1;
		if(length == 1) {
			return 0;
		}
		int ans = Integer.MAX_VALUE;
		int freq[] = new int[256];
		Arrays.fill(freq, -1);
		for(int i =0 ; i < length;i++) {
			if(freq[s.charAt(i)] == -1)
				freq[s.charAt(i)] = i;
			else 
				freq[s.charAt(i)] = -2;
		}
		for(int i = 0; i < 256; i++) {
			if(freq[i] > 0) {
				ans = Math.min(ans, freq[i]);
			}
		}
		return (ans == Integer.MAX_VALUE) ? -1 : ans;
	}

}
