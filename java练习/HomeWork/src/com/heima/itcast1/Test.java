package com.heima.itcast1;

import java.io.IOException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
         ComplexNumber c1 = new ComplexNumber(1,2);
         Scanner sc = new Scanner(System.in);
         System.out.println("您想输入一个复数还是实数 1:复数,2:实数:");
         int x = sc.nextInt();
         if(x == 1) {
        	 System.out.println("请输入复数的实部");
        	 double a = sc.nextDouble();
        	 System.out.println("请输入复数的虚部");
        	 double b = sc.nextDouble();
        	 System.out.println("请输入运算符号");
        	 char c=(char)System.in.read(); 
        	 ComplexNumber c2 = new ComplexNumber(a,b);
        	 if (c == '+') {
        	 	 System.out.println(c1.complexAdd(c2).toString());
        	 }
        	 if(c == '-') {
        	 	 System.out.println(c1.complexMinus(c2).toString());
        	 }
        	 if(c == '*') {
        	 	 System.out.println(c1.complexMulti(c2).toString());
        	 }
        	 if(c == '/') {
        	 	 System.out.println(c1.complexDiv(c2).toString());
        	 }
        	 
         }
         if(x == 2) {
        	 System.out.println("请输入实数");
        	 double y = sc.nextDouble();
        	 System.out.println("请输入运算符号");
        	 char c=(char)System.in.read(); 
        	 if(c == '+') {
        		 System.out.println(c1.complexAdd(y));
        	 }
        	 if(c == '-') {
        		 System.out.println(c1.complexMinux(y));
        	 }
        	 if(c == '*') {
        		 System.out.println(c1.complexMulti(y));
        	 }
        	 if(c == '/') {
        		 System.out.println(c1.complexDiv(y));
        	 }
         }
	}
}
class ComplexNumber{
	private double realPart;
	private double imaginPart;
	public ComplexNumber() {
		//实部
		this.realPart = 0.0;
		//虚部
		this.imaginPart = 0.0;
	}
	public ComplexNumber(double r,double i) {
		this.realPart = r;
		this.imaginPart = i;
		
	}
	public double getRealPart() {
		return realPart;
	}
	public void setRealPart(double d) {
		this.realPart = d;
	}
	public double getImaginaryPart() {
		return imaginPart;
	}
	public void setImaginaryPart(double d) {
		this.imaginPart = d;
	}
	//相加
	public ComplexNumber complexAdd(ComplexNumber c) {
		return new ComplexNumber(this.realPart + c.getRealPart() ,this.imaginPart + c.getImaginaryPart());
	}
	public ComplexNumber complexAdd(double c) {
		return new ComplexNumber(this.realPart + c,this.imaginPart + 0);
	}
	//相减
	public ComplexNumber complexMinus(ComplexNumber c) {
		return new ComplexNumber(this.realPart - c.getRealPart() ,this.imaginPart - c.getImaginaryPart());
	}
	public ComplexNumber complexMinux(double c) {
		return new ComplexNumber(this.realPart - c,this.imaginPart - 0);
	}
	//相乘
	public ComplexNumber complexMulti(ComplexNumber c) {
		return new ComplexNumber((this.realPart * c.getRealPart() - this.imaginPart*c.getImaginaryPart()),
				(this.realPart * c.getImaginaryPart() + this.imaginPart * c.getRealPart()));
	}
	public ComplexNumber complexMulti(double c) {
		return new ComplexNumber(this.realPart *c,this.imaginPart*c);
	}
	//相除
	public ComplexNumber complexDiv(ComplexNumber c) {
		if(c.getRealPart() == 0 && c.getImaginaryPart() == 0) {
			System.out.println("除数不能为0");
			return new ComplexNumber();
		}
		double m = this.realPart;
		double n = this.imaginPart;
		double x = c.getRealPart();
		double y = c.getImaginaryPart();
		return new ComplexNumber(((m*x + y*n)/(x*x + y*y)),(n*x-m*y)/(x*x + y*y));
	}
	public ComplexNumber complexDiv(double c) {
		if (c == 0) {
			System.out.println("除数不能为0");
			return new ComplexNumber();
		}
		return new ComplexNumber(this.realPart /c,this.imaginPart/c);
	}
    public String toString() {
    	String s = realPart + "+" + imaginPart + "i";
    	return s;
    }
}
