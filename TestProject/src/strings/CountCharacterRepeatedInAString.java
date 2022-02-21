package strings;

public class CountCharacterRepeatedInAString {
	
	public  void count(String s) {
		int arr[] = new int[26];
		for(int i = 0; i < s.length();i++) {
			arr[s.charAt(i) - 'a']++;
		}
		print(arr);
	}
	
	public  void print(int[] arr) {
		for(int i = 0; i < arr.length;i++) {
			if(arr[i] > 0) {
				System.out.print((char)(i+'a'));
				System.out.print(" "+arr[i]);
				System.out.println();
			}
		}
	}

}
