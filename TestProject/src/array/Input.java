package array;

import java.util.ArrayList;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] arr = {2,9,1,0,0,0,12,18,0,21,24,5,0};
//		SecondLargest sc = new SecondLargest();
//		System.out.println(sc.find(arr));
		
//		IsSortedNonDecreasingOrder is = new IsSortedNonDecreasingOrder();
//		System.out.println(is.check(arr));
		
//		ReverseArray rev = new ReverseArray();
//		int[] ans = rev.reverse(arr);
//		for(int i = 0; i < arr.length ;i++) {
//			System.out.println(" i :"+i+" ====-------> "+arr[i]);
//		}
		
		
//		RemoveDuplicates rm = new RemoveDuplicates();
//		System.out.println(rm.remove(arr));
		
//		MoveZerosToEnd m = new MoveZerosToEnd();
//		int[] ans = m.move(arr);
//		for(int i = 0; i < ans.length ;i++) {
//		System.out.println(" i :"+i+" ====-------> "+ans[i]);
//		}
		
//		LeftRotateD d = new LeftRotateD();
//		int[] ans = d.leftRotateByD(arr, 4);
//		for(int i = 0; i < ans.length ;i++) {
//		System.out.println(" i :"+i+" ====-------> "+ans[i]);
//		}
		
//		int[] arr = {2,9,1,0,0,0,12,18,0,21,24,5,0};
//		Leaders l = new Leaders();
//		l.find(arr);
		

//		int[] arr = {30,10,8,2};
//		MaximumDifferenceWithOrder om = new MaximumDifferenceWithOrder();
//		System.out.println(om.findMaxDiffWithOrd(arr));
		
//		int[] arr = {7,1,5,3,6,4};
//		BestTimeToBuyAndSell sb = new BestTimeToBuyAndSell();
//		System.out.println(sb.maxProfit(arr));

//		int[] arr = {5,10,20,6,3,8};
//		MaxEvenOddSubArray mx = new MaxEvenOddSubArray();
//		System.out.println(mx.maxEvenOddSubArray(arr));
		

//		int[] arr = {8,8,6,6,6,4,6};
//		MooresVootingMajority m = new MooresVootingMajority();
//		System.out.println(m.findMajority(arr));
		
//		int[] arr = {1,1,0,0,0,1,1,0};
//		MinimumConsecutiveFlips mc = new MinimumConsecutiveFlips();
//		System.out.println(mc.minFlips(arr));
		
//		int[] arr = {1,8,3,9,6,5,4};
//		PrefixSumWithIndex pr = new PrefixSumWithIndex();
//		System.out.println(pr.getPrefixSum(arr, 2, 6));
		
//		int[] arr = {3,4,8,-9,20,6};
//		PrefixSum pr = new PrefixSum();
//		HasEquilibriumPoint hs = new HasEquilibriumPoint();
//		int[] prefixSum = pr.getPrefixSum(arr);
//		System.out.println(hs.test(prefixSum));
		
//		int[] arr = {4,2,-2};
//		HasEquilibriumPoint hs = new HasEquilibriumPoint();
//		System.out.println(hs.hasEquillibriumPoint(arr));
		
//		int[] arr = {2,4,7,8,9,10};
//		WaveArray wv = new WaveArray();
//		int ans[] =  wv.wave(arr, arr.length);
//		for(int i =0; i < arr.length; i++) {
//			System.out.print(ans[i]+",");
//		}
		
		int[] arr = {11,42,49,96,23,20,49,26,26,18,73,2,53,59,34,99,25,2};
		StockBuyAndSell bs = new StockBuyAndSell();
		ArrayList<ArrayList<Integer>> ans = bs.maxProfit(arr, 18);
		for(int i =0; i < ans.size();i++) {
			ArrayList<Integer> sb = ans.get(i);
			for(Integer j : sb) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
		
			
	}

}
