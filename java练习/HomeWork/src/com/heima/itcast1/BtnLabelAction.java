package com.heima.itcast1;

import java.applet.*;
import java.awt.Button;
import java.awt.Desktop.Action;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BtnLabelAction extends Applet implements ActionListener   {
	Label prompt;
	Button btn;
    public void init() {
    	prompt = new Label("你好");
    	btn = new Button("操作");
    	add(prompt);
    	add(btn);
    	btn.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
    	if(e.getSource() == btn) {
    		if(prompt.getText() == "你好") {
    			prompt.setText("拜拜");
    		}else {
    			prompt.setText("你好");
    		}
    	}
    }
}
