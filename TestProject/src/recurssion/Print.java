package recurssion;

public class Print {

	
	public static void print1ToN(int n) {
		if( n == 0) {
			return ;
		}
		print1ToN(n - 1);
		System.out.print(n+" ");
	}
	
	public static void printToN(int n) {
		if(n == 0)
			return;
		
		System.out.print(n+" ");
		printToN(n - 1);
	}
}
