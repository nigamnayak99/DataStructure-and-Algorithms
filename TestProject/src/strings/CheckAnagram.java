package strings;

public class CheckAnagram {
	
	static final int CHAR = 256;
	
	public static boolean checkAnagram(String s1 , String s2) {
		
		int count[] = new int[256];
		for(int i = 0; i < s1.length();i++) {
			count[(int)s1.charAt(i)]++;
		}
		for(int i = 0; i < s2.length();i++) {
			count[(int)s2.charAt(i)]--;
		}
		
		for(int i =0; i < CHAR; i++) {
			if(count[i] != 0) {
				return false;
			}
		}
		return true;
		
	}
	
	public static boolean check(String s1, String s2) {
		int count1[] = new int[256];
		int count2[] = new int[256];
		for(int i = 0; i < s1.length();i++) {
			count1[(int)s1.charAt(i)]++;
		}
		for(int i = 0; i < s2.length();i++) {
			count2[(int)s2.charAt(i)]++;
		}
		
		for(int i = 0; i < 256;i++) {
			if(count1[i] >= 0 && count1[i] == count2[i]) {
				continue;
			}else {
				return false;
			}
		}
		
		for(int i =0; i < 256; i++) {
			if(count2[i] >= 0 && count2[i] == count1[i]) {
				continue;
			}else {
				return false;
			}
		}
		
		return true;
	}

}
