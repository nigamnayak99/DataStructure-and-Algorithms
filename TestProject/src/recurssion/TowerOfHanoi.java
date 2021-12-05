package recurssion;

public class TowerOfHanoi {

	public void findSteps(int n, char a, char b , char c) {
		if(n == 1) {
			System.out.println("Move Disc 1 from "+a +" to "+c);
			return;
		}
		findSteps(n-1,a,c,b);
		System.out.println("Move Disc "+n+" from "+a+" to "+c);
		findSteps(n-1,b,a,c);
	}
}
