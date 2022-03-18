package strings;

import org.w3c.dom.css.CSSCharsetRule;

public class Input {
	
	public static void main(String[] args) {
		
//		CountCharacterRepeatedInAString csr = new CountCharacterRepeatedInAString();
//		csr.count("geekforgeeks");
		
//		IsSubSequence ss = new IsSubSequence();
//		System.out.println(ss.check("", "ABC",0, 3));
		
		
//		CheckPalindromString cps = new CheckPalindromString();
//		System.out.println(cps.check("A"));
		
//		CheckAnagram ca = new CheckAnagram();
//		System.out.println(ca.check("aab","bab"));
		
		//Left Most Repeating Character
//		LeftMostRepeatingCharacter lems = new LeftMostRepeatingCharacter();
//		System.out.println(lems.findLeftRepeatCharNaive("abbc"));
//		System.out.println(lems.findLeftMostRepeatingCharEff1("abbc"));
//		System.out.println(lems.findLeftMostRepeatingCharMostEfficient("abbc"));
		
		//LeftMost Non Repeating Character
//		LeftMostNonRepeatingCharacter lmns = new LeftMostNonRepeatingCharacter();
//		System.out.println(lmns.findLeftMostNonRepeatingCharacter("hello"));
		
//		ReverseWordsInAString rev = new ReverseWordsInAString();
//		System.out.println(rev.reverse("its like it very much"));
		
//		NaivePatternSearching nps = new NaivePatternSearching();
//		System.out.println(nps.findPatternPos("GEEKSFORGEEKS", "EKS"));
		
//		RabinKrap rk = new RabinKrap();
//		System.out.println(rk.rabinKrapSearch("GEEKSFORGEEKS", "EEKS"));
        
        System.out.println();
        BuildLPSNaive lpsn = new BuildLPSNaive();
        int[] l = lpsn.fillLPS("abacabad");
        for(int i=0;i<8;i++){
            System.out.print(l[i]+" ");
        } 

	}
	

}
