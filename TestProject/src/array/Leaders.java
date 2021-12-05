package array;

public class Leaders {
	
	public void find(int[] arr) {
		int n = arr.length;
		if(n == 0)
			System.out.println(-1);
		if(n == 1)
			System.out.println(arr[0]);
		int curr_leader = arr[n-1];
		System.out.println(curr_leader);
		for(int i = n - 2;i >= 0;i--) {
			if(arr[i] > curr_leader) {
				curr_leader = arr[i];
				System.out.println(curr_leader);
			}
		}
	}

}
