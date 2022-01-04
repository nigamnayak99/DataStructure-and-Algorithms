package searching;

public class SortedRoatatedArray {
	
	public static int search(int[] arr, int x) {
		int low = 0;
		int high = arr.length - 1;
		if(high == 0 && arr[0] == x)
			return 0;
		while(low <= high) {
			int mid = (low + high) / 2;
			if(arr[mid] == x)
				return mid ;
			if(arr[low] <= arr[mid]) {
					if(x >= arr[low] && x < arr[mid])
						high = mid - 1;
					else
						low = mid + 1;
			}else {
					if(x >= arr[mid] && x <= arr[mid])
						mid = high + 1;
					else
						low = mid - 1;
			}
		}
		return -1;
	}
	
	
	public int search2(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
    
    while (l <= r) {
        int mid = (l + r) / 2;
        if (nums[mid] == target)
            return mid;
        // nums[left to mid] is sorted
        if (nums[l] <= nums[mid]) {
            if (target >= nums[l] && target < nums[mid])
                r = mid - 1;
            else
                l = mid + 1;
        } 
        // nums[mid to right] is sorted
        else {
            if (target > nums[mid] && target <= nums[r])
                l = mid + 1;
            else
                r = mid - 1;   
        }
    }
    return -1;
}

}
