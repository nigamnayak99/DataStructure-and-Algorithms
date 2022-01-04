package searching;

public class MedianUsingBinarySearch {
	
	public double findMedian(int[] arr1, int arr2[]) {
		int m = arr1.length;
		int n = arr2.length;
		int start = 0;
		int end = m - 1;
		while( start <= end) {
			System.out.println("Start :"+start+"  End:"+end);
			int i1 = (start + end) / 2;
			int i2 = ((m+n+1) / 2) - i1;
			System.out.println("I1 :"+i1+" I2:"+i2);
			int max1 = (i1 == m) ? Integer.MAX_VALUE : arr1[i1];
			int min1 = (i1 == 0) ? Integer.MIN_VALUE :  arr1[i1 - 1];
			int max2 = (i2 == n ) ? Integer.MAX_VALUE: arr2[i2];
			int min2 = (i2 == 0) ? Integer.MIN_VALUE  : arr2[i2 - 1];
			
			//Now check if left sets are less than right set completeley 
			if(max2 <= min1 && max1 <= min2) {
				System.out.println("max1 :"+max1);
				if((m + n) % 2 == 0) {  
					double max = Math.min(max2, max1);
					double min = Math.max(min1, min2);
					return (max + min) / 2;
				}else {
					return Math.max(max2, max1);
				}
				
			}
			if(max1 > min2) {
				end  = i1 -1;
			}else {
				start =  i1 + 1;
			}
		}
		return -1;
	}
	
	public double getMedian(int[] arr1, int[] arr2) {
		int m = arr1.length;
		int n = arr2.length;
		if(m > n) {
			return findMedian(arr2,arr1);
		}else {
		return findMedian(arr1,arr2);
		} 
	}

	

}
