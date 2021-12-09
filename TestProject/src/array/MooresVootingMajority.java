package array;

public class MooresVootingMajority {
	
	public int findMajority(int[] arr) {
		int n = arr.length;
		int res = 0;
		int count = 1;
		//This Half find the potential candidate to be a majority element 
		for(int i =1; i < n; i++) {
			if(arr[res] == arr[i]) {
				count++;
			}
			else {
				count --;
			}
			if(count == 0) {
				res = i;
				count = 1;
			}
		}
		count = 0;
		
		//This Half Checks weather the candidate is actually a majority element or not .
		for(int i = 0; i < n; i++) {
			if(arr[res] == arr[i]) {
				count++;
			}
		}
		if(count > n / 2) {
			return res;
		}
		return -1;
		
	}

}
