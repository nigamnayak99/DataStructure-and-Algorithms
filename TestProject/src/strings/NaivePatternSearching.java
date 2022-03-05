package strings;

import java.util.ArrayList;
import java.util.List;

public class NaivePatternSearching {

	public static ArrayList<Integer> findPatternPos(String text, String pattern) {
		int m = pattern.length();
		int n = text.length();
		ArrayList<Integer> answer = new ArrayList<Integer>();
		for(int i = 0; i <= n - m  ; i++) {
			int j = i;
			for(int k = 0; k < m; k++) {
				if(pattern.charAt(k) != text.charAt(j))
					break;
				j++;
				if(k == m - 1)
					answer.add(i);  
			}
			
		}
		return answer;
	}
}
