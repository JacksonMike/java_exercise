package com.heima.bbb;

public class Person {
    private int age;
    private String name;
    public void setAge(int a) {
    	if(a>100 || a <0) {
    		System.out.println("There is no exsist");
    		return;
    	}
    	age = a;
    }
    public void setName(String name) {
    	this.name = name;
    }
     public void show() {
    	 System.out.println("name=" + name + "age=" + age);
     }
     
}
