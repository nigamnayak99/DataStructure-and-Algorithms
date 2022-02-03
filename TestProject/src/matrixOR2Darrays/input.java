package matrixOR2Darrays;

public class input {

	public static void main(String args[]) {
		
//		//Snake Pattern : Print2DArray
//		int array[][] = {{1,2,3,4,5},{6,7,8,9,10}};
//		Print2DArray pr = new Print2DArray();
//		pr.printSnakePattern(array); 
		
//		int array[][] = {{1,2,3,4,5},{6,7,8,9,10}};
//		PrintBoundaryElements pr = new PrintBoundaryElements();
//		pr.print(array);
		
//		int array[][] = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
//		TransposeAndPrint trp = new TransposeAndPrint();
//		trp.transpose(array);
		
//		int array[][] = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
//		PrintSpiralMatrrix prs = new PrintSpiralMatrrix();
//		int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
//		prs.print(array, array.length, array[0].length);
//		prs.print(arr, 3, 4);
		
		
		int array[][] = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		SearchInASortedRowAndColumnMatrix srp = new SearchInASortedRowAndColumnMatrix();
		int ans[] = srp.search(array, 4,4 , 55);
		System.out.println(ans[0]+", "+ans[1]);
	}
}
