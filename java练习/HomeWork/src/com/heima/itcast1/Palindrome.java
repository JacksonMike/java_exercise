package com.heima.itcast1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String str = null;
        System.out.println("请输入字符串:");
        str = sc.next();
        int a= str.length();;
        if(a%2 != 0) {
        	int b = (a-1)/2;
        	String s = str.substring(0,b);
        	String t = str.substring(b+1,a);
        	StringBuffer sb = new StringBuffer(t);
        	String v = sb.reverse().toString();
       	    int c = v.compareTo(s);
       	    if(c == 0) {
       	    	System.out.println("该字符串是回文串");
       	    }else {
       	    	System.out.println("该字符串不是回文串");
       	    }
       	    
        }else {
        	int b = a/2;
        	String s = str.substring(0,b);
        	String t = str.substring(b,a);
        	StringBuffer sb = new StringBuffer(t);
        	String v = sb.reverse().toString();
       	    int c = v.compareTo(s);
       	    if(c == 0) {
       	    	System.out.println("该字符串是回文串");
       	    }else {
       	    	System.out.println("该字符串不是回文串");
       	    }
        }
	}
}
