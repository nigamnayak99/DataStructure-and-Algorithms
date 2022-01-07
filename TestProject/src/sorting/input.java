 package sorting;

public class input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Input For BubbleSort
		BubbleSort bs = new BubbleSort();
		int arr[] = {2,5,7,8,20};
		int[] ans = bs.optimizedBubbleSort(arr);
		for(int i = 0 ; i < ans.length; i++) {
			System.out.println(ans[i]);
		}

	}

}
