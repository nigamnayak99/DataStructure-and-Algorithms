package recurssion;

import java.util.ArrayList;

public class RecurssionInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Print p = new Print();
//		p.print1ToN(9);
//		System.out.println();
//		p.printToN(8);
		
//		GenerateSubsetString s = new GenerateSubsetString();
//		s.generate("ABC", "", 0);
		
//		RopeCuttingProblem rp = new RopeCuttingProblem();
//		System.out.println(rp.findMaxCuts(5, 3, 2, 1));
//		System.out.println(rp.findMaxCuts(23, 11, 9, 12));
		
//		TowerOfHanoi th = new TowerOfHanoi();
//		th.findSteps(3, 'a', 'b', 'c');
//		String s = "abbcbba";
//		PallindromicString ps = new PallindromicString();
//		System.out.println(ps.check(s, 0, s.length() - 1));
		
		
		
		
		String[] str = {"","_","ABC","DEF","GHI","JKL","MNOP","QRS","TUV","WXYZ"};
		int[] arr = {6,4,5,5};
		PrintKeyPadCombination pk = new PrintKeyPadCombination();
		int curr = 0;
		int length = arr.length - 1;
		ArrayList<String> ans = pk.print(str,arr,curr,length);
		
	}

}
