package matrixOR2Darrays;

import java.util.ArrayList;

public class PrintSpiralMatrrix {
	
	public void print(int arr[][] , int R , int C) {
		int top = 0;
		int left = 0;
		int right = C - 1 ;
		int bottom = R - 1;
		
		ArrayList<Integer> ans = new ArrayList<Integer>();
		while(left <= right && top <= bottom) {
			
			//Printing top row from left to right
			for(int i = left ; i <= right ; i++) {
				ans.add(arr[top][i]);
			}
			top++;
			//Printing right coloumn from top to bottom 
			for(int i = top ; i <= bottom ; i++) {
				ans.add(arr[i][right]);
			}
			right--;
			//Printing bottom row from right to left
			if(top <= bottom) {
				for(int i = right; i >= left;i--) {
					ans.add(arr[bottom][i]);
				}
				bottom--;	
			}
			//printing left column from bottom to top;
			if(left <= right) {
				for(int i = bottom ; i>= top ; i--) {
					ans.add(arr[i][left]);
				}
				left++;
			}
		}
		
		System.out.println(ans);
		System.out.println(ans.size());
	}

}
