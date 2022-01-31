package matrixOR2Darrays;

public class TransposeAndPrint {

	public void transpose(int arr[][]) {
		print(arr);
		int rows = arr.length;
		int columns = arr[0].length;
		for(int i = 0 ; i < rows / 2; i++) {
			for(int j = 0; j < columns; j++) {
				swap(arr,i,j);
			}
		}
		print(arr);
	}
	
	private void swap(int[][] arr, int i, int j) {
		// TODO Auto-generated method stub
		//System.out.println(arr[i][j]);
		int ti = j;
		int tj = i;
		int temp = arr[ti][tj];
		System.out.println(temp+"<---"+arr[i][j]);
		arr[ti][tj] = arr[i][j];
		arr[i][j] = temp;
	}

	public void print(int arr[][]) {
		for(int i =0; i < arr.length; i++) {
			for(int j =0; j < arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
