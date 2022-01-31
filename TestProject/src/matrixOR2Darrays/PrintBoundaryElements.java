package matrixOR2Darrays;

public class PrintBoundaryElements {

	public void print(int arr[][]) {
		
		int rows = arr.length;
		int columns = arr[0].length;
		
		if(rows == 1) {
			for(int i =0; i < arr.length;i++) {
				System.out.println(arr[0][i]+"");
			}
		}else if(columns == 1) {
			for(int i = 0; i < arr.length;i++) {
				System.out.println(arr[i][0]+" ");
			}
		}else {
			for(int i =0; i< columns;i++) {
				System.out.print(arr[0][i]+" ");
			}
			System.out.println();
			for(int i = 1;i < rows ; i++) {
				System.out.print(arr[i][columns - 1]+" ");
			}
			for(int i = columns - 2 ; i >= 0;i--) {
				System.out.print(arr[rows - 1][i]+" ");
			}
			for(int i = rows - 2; i >= 1;i--) {
				System.out.print(arr[i][0]+" ");
			}
		}
		
	}
}
