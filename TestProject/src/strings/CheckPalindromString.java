package strings;

public class CheckPalindromString {
	
	public boolean check(String str) {
		if(str.length() < 1) {
			return false;
		}
		int begin = 0;
		int end = str.length() - 1;
		while(begin <= end && str.charAt(begin) == str.charAt(end)) {
			begin++;
			end--;
		}
		if(begin >= end) {
			return true;
		}else {
			return false;
		}
	}

}
