package com.heima.eee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Person p = new Person();
          p.eat();
          new Person().eat();
          
          method(new Person());
          
         Person p1 = method();
         p1.eat();
	}
   public static Person method() {
	  
	   return new Person();
   }
   public static void method(Person p) {
	   p.eat();
   }
}
