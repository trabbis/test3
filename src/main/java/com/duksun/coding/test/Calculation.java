package com.duksun.coding.test;

public class Calculation {
	
	public static int findMax(int arr[]){

		if (arr.length < 1) {
			return 0;
		}
        int max=arr[0];
        for(int i=0;i<arr.length;i++){  
            if(max<arr[i]) { 
                max=arr[i];  
            }
        }  
        return max;  
    }  
	
	

}
