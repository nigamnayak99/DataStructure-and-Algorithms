package strings;

public class IsSubSequence {
	
	public boolean check(String s1, String s2,int m, int n) {
		if(m == 0) 
			return true;
		if(n == 0)
			return false;
		if(s1.charAt(m - 1)== s2.charAt(n - 1)) {
			return check(s1,s2,m-1,n-1);
		}else {
			return check(s1,s2,m,n-1);
		}
	}

}
