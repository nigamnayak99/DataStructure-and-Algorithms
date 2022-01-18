package sorting;

public class QuickSortUsingHoarePartiton {

	HoarePartition hp = new HoarePartition();
	
	//QuickSort using Hoare's partiton;
	public int[] sort(int[] arr , int low,int high) {
		if(low < high) {
			System.out.println(arr[low]+" : "+arr[high]);
			int p = hp.hPartition(arr, low, high);
			System.out.println("P :"+p);
			sort(arr,low,p);
			sort(arr,p+1,high);
		}
		return arr;
	}
}
