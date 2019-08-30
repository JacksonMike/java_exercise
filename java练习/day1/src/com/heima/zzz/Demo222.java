package com.heima.zzz;

public class Demo222 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = {11,22,33,44,55};
        int i = HalfFind(arr, 11);
        System.out.println(i);
	}
    public static int HalfFind(int[] arr,int key) {
    	int min = 0;
    	int max = arr.length-1;
    	int mid = 0;
    	while(min<=max) {
    		mid = (min + max)/2;
    		if(key>arr[mid]) {
    			min = mid + 1;
    		}
    		if(key<arr[mid]) {
    			max = mid - 1;
    		}
    		if(key==arr[mid]) {
    			return mid;
    		}
    	}
    	return -1;
    }
    
}
