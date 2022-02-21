package strings;

import org.w3c.dom.css.CSSCharsetRule;

public class Input {
	
	public static void main(String[] args) {
		
//		CountCharacterRepeatedInAString csr = new CountCharacterRepeatedInAString();
//		csr.count("geekforgeeks");
		
//		CheckPalindromString cps = new CheckPalindromString();
//		System.out.println(cps.check("ASSD"));
		
		CheckAnagram ca = new CheckAnagram();
		System.out.println(ca.check("aab","bab"));
		
	}
	

}
