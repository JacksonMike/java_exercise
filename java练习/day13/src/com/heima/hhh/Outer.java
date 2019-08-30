package com.heima.hhh;

public class Outer {
      public void out() {
    	  class Inner{
    		  public void inner() {
    			  System.out.println("局部内部类");
    		  }
    	  }
    	 Inner in = new Inner();
    	 in.inner(); 
      }
}
