package com.heima.itcast1;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo2 extends Applet implements ActionListener {
    Label nubmerPrompt;
    TextField numberTfd,buttonTfd;
    TextArea inToSummary;
    Button createPhoneCardBtn;
    PhoneCard pc;
    public void init() {
    	nubmerPrompt = new Label("卡号");
    	numberTfd = new TextField(10);
    	buttonTfd = new TextField(10);
    	inToSummary = new TextArea(10,30);
    	createPhoneCardBtn = new Button("创建");
    	add(nubmerPrompt);
    	add(numberTfd);
    	add(buttonTfd);
    	add(inToSummary);
    	add(createPhoneCardBtn);
    	createPhoneCardBtn.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
    	pc = new PhoneCard();
    }
}
class PhoneCard{
	long cardNumber;
}
