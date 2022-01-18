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
		
//		FindIntersectionOfTwoSortedArrays fi = new FindIntersectionOfTwoSortedArrays();
//		int a[] = {3,5,10,10,10,10,15,15,20};
//		int b[] = {5,10,10,15,30};
//		fi.findIntersection(a, b);
		
//		FindUnionOFTwoSortedArrays fu = new FindUnionOFTwoSortedArrays();
//		int a[] = {3,5,8,8,8,10,12};
//		int b[] = {2,8,8,9,10,15};
//		fu.findUnion(a, b);
		
//		CountInversionUsingMergeSort ci = new CountInversionUsingMergeSort();
//		int arr[] = {2,5,8,11,3,6,9,13};
//		int ans = ci.count(arr, 0, arr.length - 1);
//		System.out.println(ans);
		
		
//		int arr[] = {5,3,8,4,2,7,1,10};
//		HoarePartition hp = new HoarePartition();
//		int ans = hp.hPartition(arr, 0, arr.length - 1);
//		System.out.println(ans);
		
		
//		int arr[] = {10,80,30,90,40,50,70};
//		LomutoPartiton lp = new LomutoPartiton();
//		int ans = lp.lPartition(arr, 0, arr.length - 1);
//		System.out.println(ans);
		
//		int arr[] = {3,8,6,12,10,7};
//		NaivePartition nv = new NaivePartition();
//		int ans = nv.nPartition(arr, 0, arr.length - 1, 5);
//		System.out.println(ans);
		
//		int arr[] = {5,3,8,4,2,7,1,10};
//		QuickSortUsingLomutoPartition qlp = new QuickSortUsingLomutoPartition();
//		int[] ans = qlp.sort(arr, 0, arr.length-1);
//		for(int i =0; i < arr.length; i++) {
//			System.out.println(ans[i]);
//		}
		
//		int arr[] = {5,3,8,4,2,7,1,10};
//		QuickSortUsingHoarePartiton qhp = new QuickSortUsingHoarePartiton();
//		int[] ans = qhp.sort(arr, 0, arr.length-1);
//		for(int i =0; i < arr.length; i++) {
//			System.out.println(ans[i]);
//		}
		
//		int arr[] = {3,5,4,2,9};
//		KthMinimumElementUsingQuickSelect ksp = new KthMinimumElementUsingQuickSelect();
//		System.out.println(ksp.quickSelect(arr, 0, arr.length - 1, 3));
		
		int arr[] = {7,3,2,4,9,12,56};
		ChocolateDistributionProblem cd = new ChocolateDistributionProblem();
		System.out.println(cd.findMinimum(arr, 0, arr.length - 1, 3));
	}

}
