package com.heima.ggg;

public class Outer {
     int i = 2;
     class Inner{
    	 int i = 9;
    	 public void inner() {
    		 int i = 1;
    		 System.out.println(Outer.this.i);
    	 }
     }
}
