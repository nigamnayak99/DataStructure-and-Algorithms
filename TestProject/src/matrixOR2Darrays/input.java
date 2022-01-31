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
		
		int array[][] = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		TransposeAndPrint trp = new TransposeAndPrint();
		trp.transpose(array);
		
	}
}
