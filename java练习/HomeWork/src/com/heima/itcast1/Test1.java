package com.heima.itcast1;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new WindowCylinder();
	}

}
class WindowCylinder extends Frame implements ActionListener {
	Label lb1,output1;
	TextField input1,input2,output;
	Button btn1;
	TextArea ta;
	public WindowCylinder() {
		// TODO Auto-generated constructor stub
		lb1 = new Label("请输入半径和高");
		input1 = new TextField(6);
		input2 = new TextField(6);
		output = new TextField(6);
		output.setVisible(false);
		btn1 = new Button("体积");
		ta = new TextArea();
		ta.setSize(300,300);
		ta.setVisible(true);
		setLayout(new FlowLayout());
		add(lb1);
		add(input1);
		add(input2);
		add(output);
		add(btn1);
		add(ta);
		input1.addActionListener(this);
		input2.addActionListener(this);
		btn1.addActionListener(this);
		setSize(600,300);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == btn1) {
			//半径和高
			double r,h,volume;
			r = Integer.valueOf(input1.getText());
			h = Integer.valueOf(input2.getText());
			Cylinder cy = new Cylinder(r,h);
			volume = cy.getVolume();
			output.setText((volume)+"");
			ta.setText(output.getText());
		}
	}
}
class Cylinder{
	private double r;
	private double h;
	public Cylinder(){};
	public Cylinder(double r, double h) {
		super();
		this.r = r;
		this.h = h;
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	public double getH() {
		return h;
	}
	public void setH(double h) {
		this.h = h;
	}
	public double getVolume() {
		return 3.14*r*r*h;
	}
}
