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
//		int arr[] = {2,3,5,90,11,23,18};
//		int[] ans = sc.sort(arr);
//		for(int i = 0 ; i < ans.length; i++) {
//			System.out.println(ans[i]);
//		}
		
//		InsertionSort is = new InsertionSort();
//		int arr[] = {2,3,5,90,11,23,18};
//		int ans[] = is.sort(arr);
//		for(int i = 0 ; i < ans.length; i++) {
//			System.out.println(ans[i]);
//		}
		
		
//		MergeTwoSortedArrays mta = new MergeTwoSortedArrays();
//		int arr1[] = {10,15,20};
//		int arr2[] = {5,6,6,15};
//		int ans[] = mta.merge(arr1,arr2);
//		for(int i = 0 ; i < ans.length; i++) {
//			System.out.println(ans[i]);
//		}
		
		FindIntersectionOfTwoSortedArrays fi = new FindIntersectionOfTwoSortedArrays();
		int a[] = {3,5,10,10,10,10,15,15,20};
		int b[] = {5,10,10,15,30};
		fi.findIntersection(a, b);

	}

}
