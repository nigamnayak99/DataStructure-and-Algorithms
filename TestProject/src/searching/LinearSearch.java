package searching;

public class LinearSearch {
	
	//Searching an element in an array .
	public int linearSearch(int[] arr, int x){
		if(arr.length == 0)
			return -1;
		if(arr.length == 1) 
			return arr[0] == x ? 0 : -1;
		for( int i = 0; i < arr.length; i++) {
			if(arr[i] == x) {
				return i+1;
			}
		}
		return -1;
		
	}

}
