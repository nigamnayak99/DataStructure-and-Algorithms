package array;

public class MoveZerosToEnd {
	
	public int[] move(int[] arr) {
		int n = arr.length;
		if(n == 0 || n == 1) {
			return arr;
		}
		int count = 0;
		for(int i = 0; i < n; i++) {
			if(arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[count];
				arr[count] = temp;
				count++;
			}
		}
		return arr;
	}

}
