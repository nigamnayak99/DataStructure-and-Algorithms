package recurssion;

public class GenerateSubsetString {

	public void generate(String s , String curr, int i) {
		
		if( i == s.length()) {
			System.out.println(curr);
			return ;
		}
		generate(s,curr,i+1);
		generate(s,curr+s.charAt(i),i+1);
		
	}
}
