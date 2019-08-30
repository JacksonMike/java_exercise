package com.heima.jjj;

public  class Worker extends Person {
      public  Worker(String name,int age) {
    	 super(name,age);
     }
      public void work() {
    	  System.out.println(this.getName() + this.getAge());
      }
}
