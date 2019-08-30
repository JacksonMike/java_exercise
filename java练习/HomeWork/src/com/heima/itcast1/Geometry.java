package com.heima.itcast1;
//抽象类
abstract class Geometry {
     double PI;
     abstract double getArea();
}
//圆
class Circle extends Geometry  {
	double R;
	void setR(double R) {
		this.R = R;		
	}
	double getArea() {
		return PI*R*R;
	}
}
//直主体
class Pillar extends Circle{
	
	double height;
    Pillar(){};
    Pillar(double PI,double R){
    	this.PI = PI;
    	this.R = R;
    }
    void setHeight(double height) {
    	this.height = height;
    }
    double getVolume() {
    	return height*getArea();
    }
}