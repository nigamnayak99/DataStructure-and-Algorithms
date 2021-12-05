package recurssion;

import java.util.ArrayList;

public class PrintKeyPadCombination {
	
	public static ArrayList<String> print(String[] str ,int[] arr, int curr, int length){
		ArrayList<String> baseStringList = new ArrayList<String>();
		if(curr == length) {
			  String baseString = str[arr[curr]];
			  for(int i = 0; i < baseString.length() ; i++) {
				  baseStringList.add(Character.toString(baseString.charAt(i)));
			  }
			  return baseStringList;
		}
		ArrayList<String> ans = new ArrayList<String>();
		ArrayList<String> subAns = print(str,arr,curr+1,length);
		String intem = str[arr[curr]];
		for(int i = 0; i < intem.length();i++) {
			char subChar = intem.charAt(i);
			for( int j =0; j < subAns.size(); j++) {
				ans.add(subChar+subAns.get(j));
				if(curr == 0) {
					System.out.print(subChar+subAns.get(j)+" ");
				}
			}
			if(curr == 0) {
				System.out.println();
			}

		}
		return ans;
	}
	

}
