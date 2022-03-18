package strings;

public class KMP {
	
	public  void search(String text, String pattern) {
		int n = text.length();
		int m = pattern.length();
		int lps[] ;
		lps = BuildLPSEfficient.findLPS(pattern);
		int i = 0;
		int j = 0;
		while(i < n) {
			if(pattern.charAt(j) == text.charAt(i)) {
				i++;
				j++;
			}
			if(j == m) { //if we have already found a match of pattern .
				System.out.println(i - j);
				j = lps[j -1];
			}
			//We have not still found a match
			else if(i < n && pattern.charAt(j) != text.charAt(i)) {
				if(j == 0) {
					i++;
				}else {
					j = lps[j - 1];
				}
			}
		}
		
	}

}
