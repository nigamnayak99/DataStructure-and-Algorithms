package sorting;

public class QuickSortUsingLomutoPartition {
	
	LomutoPartiton lp = new LomutoPartiton();
	
	//Using Lomuto Partition for quick sort
	public int[] sort(int[] arr, int low,int high) {
		if(low < high) {
			int p = lp.lPartition(arr, low, high);
			sort(arr,low,p-1);
			sort(arr,p+1,high);
		}
		return arr;
	}

}
