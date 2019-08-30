package com.heima.iii;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new Animal() {
        	public void sleep() {
        		System.out.println("sleep late");
        	}
        	public void work() {
        		System.out.println("work hard");
        	}
        }.sleep();
	}
}
