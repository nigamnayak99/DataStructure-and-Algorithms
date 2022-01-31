package matrixOR2Darrays;

public class Print2DArray {

	public void printSnakePattern(int arr[][]) {
		for(int i = 0; i < arr.length; i++) {
			int j = 0; 
			if(i % 2 != 0) {
				j = arr[i].length-1;
				while(j >= 0) {
					System.out.print(arr[i][j]+" ");
					j--;
				}
			}else {
				while( j <= arr[i].length - 1) {
					System.out.print(arr[i][j]+" ");
					j++;
				}
			}
			System.out.println();
		}
	}
}
