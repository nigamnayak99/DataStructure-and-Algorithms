package array;

public class SecondLargest {
	
	public int find(int[] arr) {
		int n = arr.length;
		if( n == 0 || n == 1) {
			return -1;
		}
		int l1 = Integer.MIN_VALUE;
		int l2 = Integer.MIN_VALUE;
		for(int i =0; i < n ; i++) {
			int temp = l1;
			if(arr[i] > l1) {
			
				l1 = arr[i];
			}
			if(temp != l1 && temp > l2) {
		
				l2 = temp;
			}
			if(temp == l1 && arr[i] > l2) {
				System.out.println(2);
				l2 = arr[i];
			}
		}
		
		if( l2 == Integer.MIN_VALUE || l1 == l2)
			return -1;
		
		return l2;
	}

}
