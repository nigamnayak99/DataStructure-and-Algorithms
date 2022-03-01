package strings;

public class CheckPalindromString {
	
	public boolean check(String str) {
		if(str.length() < 1) {
			return false;
		}
		int start = 0;
		int end = str.length() - 1 ;
		while(start <= end) {
			if(str.charAt(start) == str.charAt(end)) {
				start++;
				end--;
				continue;
			}else {
				return false;
			}
		}
		return true;
	}

}
