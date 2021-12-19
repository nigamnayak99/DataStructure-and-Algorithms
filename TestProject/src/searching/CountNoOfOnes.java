package searching;

public class CountNoOfOnes {
	
public static int countOnes(int arr[], int N){
        
        // Your code here
        int low = 0;
		int high = arr.length - 1;
		int lastPos = 0;
		boolean isModified = false ;
		while(low <= high) {
			int mid = (low + high) / 2;
			if(arr[mid] == 0){
			    high = mid - 1;
			}
			else{
				if( mid != N - 1 && arr[mid] != arr[mid + 1]) {
					lastPos = mid;
					break;
				}else if(mid == N - 1) {
					lastPos = mid;
					break;	
				}
				else {
					low = mid + 1;
				}
			}
				

		}
		if((lastPos == 0 )&& (isModified == true)){
		    return 1;
		}else if((lastPos == 0) && (isModified == false)){
		    return 0;
		}else 
		    return lastPos + 1;
        
    }

}
