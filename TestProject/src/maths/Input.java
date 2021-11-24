package maths;


import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
//		int T = sc.nextInt();
//		while(T > 0) {
//			System.out.println("Input TestCase No :"+T);
//			int n = sc.nextInt();
//			Factorial fa = new Factorial();
//			System.out.println(fa.fact(n));
//			T--;
//		}
		
		
//		GCD gcd = new GCD();
//		System.out.println(gcd.gcdNaive(12, 15));
//		System.out.println(gcd.gcdEuclid(12, 15));
		
//		LCM lcm = new LCM();
//		System.out.println(lcm.lcmNaive(12, 15));
//		System.out.println(lcm.lcmEuclid(12, 15));

		Prime p = new Prime();
		System.out.println(p.isPrimeNaive(131));
		System.out.println(p.isPrimeOptimized(131));
		System.out.println(p.isPrimeMostOptimized(91));
		p.findPrimeFactors(21);
	}

}
