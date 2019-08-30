package com.heima.hhh;

public class Pocket {
     
	private int age;
     private String name;
    
     Pocket(String name,int age){
    	 this.name = name;
    	 this.age = age;
     }
     
     public void work() {
    	 System.out.println(this.name + this.age );
     }
}
