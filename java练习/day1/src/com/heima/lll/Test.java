package com.heima.lll;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        method(new Bob());
	}
    public static void method(Bob b) {
    	b.eat();
    }
    //参数传递
    public static Bob getBob() {
    	return new Bob();
    			
    }
    //返回值类型
    
}
