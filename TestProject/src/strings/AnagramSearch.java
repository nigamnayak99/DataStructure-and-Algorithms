package strings;

import java.util.ArrayList;

public class AnagramSearch {
	
	public static final int CHAR = 256;
	
	public static ArrayList<Integer> anagramSearchEfficient(String text,String pattern) {
		int m = pattern.length();
		int n = text.length();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int txt[] = new int[CHAR];
		int pat[] = new int[CHAR];
		for(int i = 0; i < m; i++) {
			System.out.println((int)pattern.charAt(i));
			pat[pattern.charAt(i)]++;
			System.out.println((int)text.charAt(i));
			txt[text.charAt(i)]++;
		}
		for(int i = m; i < n ; i++) {
			if(areEqual(pat,txt) == true) {
				System.out.println("Pattern matching");
				System.out.println(i);
			}
				System.out.println("Pattern not matching");
				System.out.println((int)text.charAt(i));
				txt[text.charAt(i)]--;
				System.out.println((int)text.charAt(i-m));
				txt[text.charAt(i-m)]++;
		}
		return ans;
		
	}
	
	public static boolean areEqual(int[] pat, int[] txt) {
		for(int i = 0; i < 256;i++) {
			if(pat[i] != txt[i] )
				return false;
		}
		return true;
	}

}
