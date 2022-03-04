package strings;

import java.util.Arrays;

public class LeftMostRepeatingCharacter {
	
	
	public static int findLeftRepeatCharNaive(String s) {
		int length = s.length();
		if(length <= 1) {			//Can't find a repeating character is size is less than 1;
			return -1;
		}
		int ans = -1;
		int freq[] = new int[256];
		for(int i = 0; i < length;i++) {
			freq[(int)s.charAt(i)] += 1;
		}
		for(int i = 0; i < length; i++) {
			if(freq[s.charAt(i)] > 1) {
				return i;
			}
		}
		return -1;
	}
	
	
	public static int findLeftMostRepeatingCharEff1(String s) {
		int length = s.length();
		if(length <= 1) {			//Can't find a repeating character is size is less than 1;
			return -1;
		}
		int ans = Integer.MAX_VALUE;
		int freq[] = new int[256];
		Arrays.fill(freq, -1);
		for(int i = 0; i < length; i++) {
			int fi = freq[s.charAt(i)];
			if(fi == -1) 
				freq[s.charAt(i)] = i;
			else
				ans = Math.min(ans, fi);
		}
		return (ans == Integer.MAX_VALUE) ? -1:ans;
	}
	
	public static int findLeftMostRepeatingCharMostEfficient(String s) {
		int length = s.length();
		if(length <= 1) {			//Can't find a repeating character is size is less than 1;
			return -1;
		}
		boolean visited[] = new boolean[256];
		int ans = -1;
		for(int i = length - 1; i >= 0; i--) {
			if(visited[s.charAt(i)])
				ans = i;
			else
				visited[s.charAt(i)] = true;
		}
		
		return ans;
	}
	

	

}
