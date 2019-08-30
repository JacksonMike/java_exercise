package com.heima.itcast1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Circle c = new Circle(1,2,3);
        System.out.println(c.getArea());
	}

}
class Circle{
	private double x;
	private double y;
	private double r;
	Circle(){};
	Circle(double x,double y,double r){
		this.x = x;
		this.y = y;
		this.r = r;
	}
	public double getX(double x) {
		return x;
	}
	public void setX() {
		this.x = x;
	}
	public double getY(double y) {
		return y;
	}
	public void getY() {
		this.y = y;
	}
	public double getR(double r) {
		return r;
	}
	public void setR() {
		this.r = r;
	}
	public double getArea() {
		return 3.14*r*r;
	}
	public void setLocation() {
		this.x = x;
		this.y = y;
	}
	
}
