package com.heima.zzz;

public class Demo1111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] arr = {11,22,33,44,55};
      Change(arr);
      for(int i=0;i<=arr.length - 1;i++) {
    	  System.out.println(arr[i]);
      }
	  
	  
	}
	public static void Change(int[] arr) {
		for(int min=0,max=arr.length - 1;min<=max;min++,max--) {
		int temp;
		temp = arr[min];
		arr[min] = arr[max];
		arr[max] = temp;
		}
	}
}
