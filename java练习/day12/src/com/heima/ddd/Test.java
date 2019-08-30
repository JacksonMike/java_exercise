package com.heima.ddd;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Worker w = new Worker("Jim",34);
         System.out.println(w.getAge());
         System.out.println(w.getName());
         
         Teacher t = new Teacher("Nacy",12);
         System.out.println(t.getAge());
         System.out.println(t.getName());
	}

}
