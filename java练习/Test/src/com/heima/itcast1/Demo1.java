package com.heima.itcast1;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User.a = 1;
		System.out.println(User.a);
		User u = new User();
		u.a = 2;
		System.out.println(u.a);
	}

}
class User{
	public static int a;
}