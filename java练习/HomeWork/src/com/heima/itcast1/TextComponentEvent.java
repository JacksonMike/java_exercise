package com.heima.itcast1;

import java.applet.Applet;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class TextComponentEvent extends Applet implements TextListener,ActionListener {
	TextField tf;
	TextArea ta;
	public void init() {
		tf = new TextField(45);
		ta = new TextArea(5,45);
		add(tf);
		add(ta);
		tf.addActionListener(this);
		tf.addTextListener(this);
	}
	public void textValueChanged(TextEvent e) {
		if(e.getSource() == tf) {
			ta.setText(((TextField)e.getSource()).getText());
		}
	}
	public void acitonPerformed(ActionEvent e) {
		if(e.getSource() == tf) {
			ta.setText("");
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
