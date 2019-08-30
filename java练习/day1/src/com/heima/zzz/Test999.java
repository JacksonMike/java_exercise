package com.heima.zzz;

public class Test999 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = {4,34,2,49,1,0,48};
        SelectSort(arr);
        for(int i =0;i<=arr.length - 1;i++) {
        	System.out.println(arr[i]);
        }
	}
    public static void SelectSort(int[] arr) {
    	for(int i=0;i<arr.length - 1;i++) {
    		for(int j=i+1;j<arr.length - 1;j++) {
    			if(arr[i]>arr[j]) {
    				int temp = arr[i];
    				arr[i] = arr[j];
    				arr[j] = temp;
    			}
    		}
    	}
    }
}
