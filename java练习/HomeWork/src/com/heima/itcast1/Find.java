package com.heima.itcast1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr = new String[]{"hello","world","java","hi","some"};
		System.out.println("原数组为:");
		for(int i=0;i<arr.length;i++) {
	        System.out.print(arr[i]+"	");
	    }
		Arrays.sort(arr);
        System.out.println("排序后的数组:");
        for(int i=0;i<arr.length;i++) {
        	System.out.print(arr[i]+"	");
        }
        List<String> list = new ArrayList<String>();
        for(String str : arr){
            list.add(str);
        }
    
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入字符串:");
        String s = sc.next();
        list.add(s);
  
        String[] arr1 = new String[list.size()];
        for(int i = 0; i < list.size();i++){
            arr1[i] = list.get(i);
        }
        Arrays.sort(arr1);
        System.out.println("添加新元素排序后的数组:");
        for(int i=0;i<arr1.length;i++) {
        	System.out.print(arr1[i]+"	");
        }
	}
   
}
