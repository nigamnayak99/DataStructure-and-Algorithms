package sorting;

public class SortArrayWithTwoTypes {
	
	public static void sort(int[] arr, int n) {
		
		int i=-1,j=n;
        while(true)
        {
            do{i++;}while(arr[i]<0);
            do{j--;}while(arr[j]>=0);
            if(i>=j)return;
            
            //swapping arr[i] & arr[j]
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            
        }		
	}

}
