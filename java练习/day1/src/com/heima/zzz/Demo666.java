package com.heima.zzz;

public class Demo666 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = {11,22,55,33,77};
        MaoPao(arr);
        for(int i=0;i<=arr.length-1;i++) {
        	System.out.println(arr[i]);
        }
	}
    
    	public static void MaoPao(int[] arr) {
    		for(int i=0;i<arr.length-1;i++) {
    			for(int j=0;j<arr.length-i-1;j++) {
    				if(arr[j] > arr[j+1]) {
    					int temp = arr[j];
    					arr[j] = arr[j+1];
    					arr[j+1] = temp;
    				}
    			}
    		}
    }
}
