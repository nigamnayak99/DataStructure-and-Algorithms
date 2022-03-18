package strings;

public class BuildLPSEfficient {
	
	public static int[] findLPS(String s) {
		int n = s.length();
		int lps[] = new int[n];
		lps[0] = 0;// first is always zero 
		int i = 1;
		int len = 0;  // length of the previous longest prefix suffix .
		// the loop calculates lps[i] for i = 1 to M-1
		while(i < n) {
			/*
			 * example "abababca" and i==5, len==3. The longest prefix suffix is "aba", when
			 * pat[i]==pat[len], we get new prefix "abab" and new suffix "abab", so increase
			 * length of current lps by 1 and go to next iteration.
			 */
			if(s.charAt(i) == s.charAt(len)) { 
				   len++;
				   lps[i] = len;
				   i++;
			}else {// (pat[i] != pat[len])
				if(len == 0) {
					// there isn't any lps ends with pat[i], so set lps[i] = 0 and go to next iteration.
					lps[i] = 0;
					i++;
				}
				else {
					/*
					 * if len > 0 This is tricky. Consider the example "ababe......ababc", i is
					 * index of 'c', len==4. The longest prefix suffix is "abab", when
					 * pat[i]!=pat[len], we get new prefix "ababe" and suffix "ababc", which are not
					 * equal. This means we can't increment length of lps based on current lps
					 * "abab" with len==4. We may want to increment it based on the longest prefix
					 * suffix with length < len==4, which by definition is lps of "abab". So we set
					 * len to lps[len-1], which is 2, now the lps is "ab". Then check
					 * pat[i]==pat[len] again due to the while loop, which is also the reason why we
					 * do not increment i here. The iteration of i terminate until len==0 (didn't
					 * find lps ends with pat[i]) or found a lps ends with pat[i].
					 */
					len = lps[len - 1];
				}
			}
		}	
		return lps;
		
	}

}
