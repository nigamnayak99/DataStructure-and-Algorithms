package strings;

public class ReverseWordsInAString {
	
	public static String reverse(String s) {
		int sp = s.length() - 1;
		int ep = s.length() - 1;
		int p = s.length() - 1;
		String reverse = "";
		boolean flag = true ;
		while(p >= 0) {
			if(p == 0) {
				reverse = reverse + s.substring(0,ep+1);
				return reverse;
			}
			while(s.charAt(p) == 32) {
				sp = p + 1;
				reverse = reverse + s.substring(sp,ep+1)+" ";
				ep = p -1;
				p--;
			}
			p--;
		}
		return reverse;
	}

}
