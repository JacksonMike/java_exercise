package com.heima.hhh;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Jack j1 = new Over();
          j1.eat();
          
          Over o = (Over)j1;
          o.run();
          
          
          Jack j = new Park();
          j.eat();
          
          Park p = (Park)j;
          p.jump();
	}

}
