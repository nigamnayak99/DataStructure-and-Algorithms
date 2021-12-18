package searching;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		BinarySearch bs = new BinarySearch();
//		int[] arr = {1,2,3,4,4,5,6,7,8};
//		System.out.println(bs.bSearch(arr, 0, arr.length -1 , 5));
//		System.out.println(bs.bSearchIterative(arr, 5));
		
//		int[] arr = {1};
//		LinearSearch ls = new LinearSearch();
//		System.out.println(ls.linearSearch(arr, 0));
		
		int[] arr = {5,5,5};
		FirstOccurence fs = new FirstOccurence();
		System.out.println(fs.getFirstOccurence(arr, 0, arr.length - 1, 5) + 1);
		
		
		
	}

}
