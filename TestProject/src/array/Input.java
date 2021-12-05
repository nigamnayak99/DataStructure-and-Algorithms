package array;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {2,9,1,0,0,0,12,18,0,21,24,5,0};
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
		
		MoveZerosToEnd m = new MoveZerosToEnd();
		int[] ans = m.move(arr);
		for(int i = 0; i < ans.length ;i++) {
		System.out.println(" i :"+i+" ====-------> "+ans[i]);
	}
		
	}

}
