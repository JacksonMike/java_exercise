package com.heima.ppp;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Person p1 = new Person();
       p1.setName("Jim");
       p1.setAge(12);
       System.out.println(p1.getName());
       System.out.println(p1.getAge());
       
       Person p2 = new Person("Tom",111);
       System.out.println(p2.getName());
       System.out.println(p2.getAge());
	}

}
