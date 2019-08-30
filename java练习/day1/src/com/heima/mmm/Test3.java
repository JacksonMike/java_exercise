package com.heima.mmm;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Flower f =  method();
         f.show();
	}
    public static Flower method() {
    	Flower f = new Rose();
    	return f;
    }
}
