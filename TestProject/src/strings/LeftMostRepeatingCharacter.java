package strings;

public class LeftMostRepeatingCharacter {
	
	
	public static int find(String str) {
		int arr[] = new int[256];
		int ans = -1;
		for(int i = 0; i < str.length();i++) {
			if(arr[(int)str.charAt(i)] == 0) {
				arr[(int)str.charAt(i)] = i + 1;
			}else {
				ans = arr[(int)str.charAt(i)] - 1;
				break;
			}
		}
		return ans;
	}
	
//	public int findLeftMost(String str) {
//		int pos = -1;
//		int count[] = new int[256];
//		for(int i = 0; i < str.length();i++) {
//			if(count[(int)str.charAt(i)] > 0) {
//				if(pos < 0) {
//					pos = 
//				}
//				//pos = pos < 0 ? count[(int)str.charAt(i)] : (pos < count[(int)str.charAt(i)] ? pos : count[(int)str.charAt(i)]);
//			}else {
//				count[(int)str.charAt(i)] = i+1;
//			}
//		}
//		
//		return pos;
//	}
	

}
