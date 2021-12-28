package searching;

public class FindRepeatingElementInContinuesArray {
	
	
	//MostEfficient approach
	//This will work if it starts from 0
	public static int findRepeatingElement(int[] arr) {
		int n = arr.length;
		if(n <=1) {
			return -1;
		}
		int sum = 0;
		int actualSum = 0;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++) {
			if(arr[i] > max)
				max = arr[i];
			sum = sum + arr[i];
		}
		if(sum == 0)
			return 0;
		actualSum =( max * (max+ 1) )/ 2;
		return (sum - actualSum) / ((n -1) - max) ;
	}
	
	//Efficient  Approach with extra space 
	public static int findRepeatingElementUsing(int[] arr) {
		int n = arr.length;
		if(n <=1) {
			return -1;
		}
		boolean[] visited = new boolean[n];
		for(int i = 0; i < n; i++) {
			if(visited[arr[i]])
				return arr[i];
			visited[arr[i]] = true;
		}
		return -1;
	}

}
