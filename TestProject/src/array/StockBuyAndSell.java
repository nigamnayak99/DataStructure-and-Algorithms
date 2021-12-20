package array;

import java.util.ArrayList;

public class StockBuyAndSell {
	
	public ArrayList<ArrayList<Integer>> maxProfit(int[] arr, int n){
        // code here
        ArrayList<ArrayList<Integer>> big = new ArrayList<>();
        ArrayList<Integer> small = new ArrayList<>();
        
        small.add(0);
        for(int i=1;i<n;i++){
            if(arr[i] > arr[i-1]){
                if(small.size() == 1){
                    small.add(i);
                }
                else{
                    small.set(1,i);
                }
            }else if(arr[i] < arr[i-1]){
                if(small.size() == 2){
                    big.add(small);
                    small = new ArrayList<>();
                    small.add(i);
                }else{
                    small.set(0,i);
                }
                
            }
        }
        if(small.size() == 2){
            big.add(small);
        }
        return big;
	}
}
