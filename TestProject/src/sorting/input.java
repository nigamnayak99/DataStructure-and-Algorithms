 package sorting;

public class input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		//Input For BubbleSort
//		BubbleSort bs = new BubbleSort();
//		int arr[] = {2,5,7,8,20};
//		int[] ans = bs.optimizedBubbleSort(arr);
//		for(int i = 0 ; i < ans.length; i++) {
//			System.out.println(ans[i]);
//		}
		
//		SelectionSort sc = new SelectionSort();
//		int arr[] = {};
//		int[] ans = sc.sort(arr);
//		for(int i = 0 ; i < ans.length; i++) {
//			System.out.println(ans[i]);
//		}
		
		InsertionSort is = new InsertionSort();
		int arr[] = {2,3,5,90,11,23,18};
		int ans[] = is.sort(arr);
		for(int i = 0 ; i < ans.length; i++) {
			System.out.println(ans[i]);
		}

	}

}
