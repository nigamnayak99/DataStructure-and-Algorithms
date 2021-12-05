package recurssion;

public class RopeCuttingProblem {

	public int findMaxCuts(int n, int a, int b, int c) {
		if(n < 0) {
			return -1 ;
		}
		if( n == 0 ) {
			return 0 ;
		}
		int sub1 = findMaxCuts(n-a,a,b,c);
		int sub2 = findMaxCuts(n-b,a,b,c);
		int sub3 = findMaxCuts(n-c,a,b,c);
		int max = 0;
		if (sub1 >= sub2 && sub1 >= sub3)
	        max = sub1;
	    else if (sub2 >= sub1 && sub2 >= sub3)
	        max = sub2;
	    else
	        max = sub3;
		
		if(max == -1) {
			return -1;
		}else {
			return max + 1;
		}
	}
}
