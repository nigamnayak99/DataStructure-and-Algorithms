package matrixOR2Darrays;

public class SearchInASortedRowAndColumnMatrix {
	
	public static int[] search(int arr[][],int r, int c , int target){
		int startRow = 0;
		int startColumn = c;
		int ans[] = {-1,-1};
		while(startRow < r && startColumn >= 0) {
			System.out.println("Entering");
			if(arr[startRow][startColumn] == target) {
				ans[0] = startRow;
				ans[1] = startColumn;
				break;
			}else if(arr[startRow][startColumn] < target) {
				startRow++;
			}else {
				startColumn--;
			}
		}
		return ans;
	}

}
