
package com.heima.java;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
public class ApplicationGraphicsInOut {
	public static void main(String args[] ) {
		// TODO Auto-generated method stub
           new FrameInOut();   
	}
}
class FrameInOut extends Frame implements ActionListener
	{    
		Label prompt,prompt1,prompt2;
        TextField input,input1,input3,output;
        Button btn,btn1;
		FrameInOut()
		    {
		    	super("图形界面的Java Application程序");
	        	prompt=new Label("请输入两个数：");
	        	input=new TextField(6);
	        	prompt1=new Label ("+");
	        	input1=new TextField(6);
	        	prompt2=new Label ("=");
	        	output=new TextField(6);
	        	btn = new Button("加");
	        	btn1 = new Button("退出");
	        	setLayout(new FlowLayout());
	        	add(prompt);
	        	add(input);
	        	add(prompt1);
	        	add(input1);
	        	add(prompt2);
	        	add(output);
	        	add(btn);
	        	add(btn1);
	        	input.addActionListener(this);
	        	input1.addActionListener(this);
		    	btn.addActionListener(this);
		    	btn1.addActionListener(this);
		    	setSize(600,300);
		    	setVisible(true);
		    }
			public void actionPerformed(ActionEvent e) {
			
				// TODO Auto-generated method stub
				int a,b,c;
				a = Integer.valueOf(input.getText());
        		b = Integer.valueOf(input1.getText());
        	    
        	    if(e.getSource() == btn) {
        	    	output.setText(((a + b)) + "");
        	    
        	    }
        	    else {
        	    	dispose();
        	    	System.exit(0);
        	    }
			}
	}