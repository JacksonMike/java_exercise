package com.heima.itcast1;
import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Area;
import javax.xml.soap.Text;
public class Phone extends Applet implements ActionListener {
      Label numberPrompt;
      Label passwordPrompt;
      Label balbacePromtp;
      Label connectNumberPrompt;
      TextField numberTfd;
      TextField passwordTfd;
      TextField balanceTfd;
      TextField connectNumberTfd;
      TextArea infoSummary;
      Button createPhoneCardBtn;
      PhoneCard myCard;
      public void init() {
    	  numberPrompt = new Label("卡号");
    	  passwordPrompt = new Label("密码");
    	  balbacePromtp = new Label("余额");
    	  connectNumberPrompt = new Label("接入号码");
    	  numberTfd = new TextField(10);
    	  passwordTfd = new TextField(5);
    	  passwordTfd.setEchoChar('*');
    	  balanceTfd = new TextField(5);
    	  connectNumberTfd = new TextField(5);
    	  infoSummary = new TextArea(8,30);
    	  createPhoneCardBtn = new Button("创建");
    	  add(numberPrompt);
    	  add(numberTfd);
    	  add(passwordPrompt);
    	  add(passwordTfd);
    	  add(balbacePromtp);
    	  add(balanceTfd);
    	  add(connectNumberPrompt);
    	  add(connectNumberTfd);
    	  add(createPhoneCardBtn);
    	  add(infoSummary);
    	  createPhoneCardBtn.addActionListener(this);
      }
      public void actionPerformed(ActionEvent e) {
    	  try {
    		  myCard = new PhoneCard(Long.parseLong(numberTfd.getText()),
    				  Integer.parseInt(passwordTfd.getText()),Double.parseDouble(balanceTfd.getText()),
    				  connectNumberTfd.getText());
    		  infoSummary.setText(myCard.toString());
    	  }catch(NumberFormatException fe){
    		  infoSummary.setText("输入格式有误,请重新输入");
    		  numberTfd.setText("");
    		  passwordTfd.setText("");
    		  balanceTfd.setText("");
    		  connectNumberTfd.setText("");
    	  } 
	  }
}
class PhoneCard{
	  long cardNumber;
	  int password;
	  double balacne;
	  String connectNumber;
	  boolean connected;
	  public PhoneCard(long cn,int pw,double b,String s) {
		cardNumber = cn;
		password = pw;
		if(b>0) {
			balacne = b;
		}else {
			System.exit(1);
		}
		connectNumber = s;
		connected = false;
	}
	boolean performConnection(long cn,int pw){
		if(cn == cardNumber && pw == password) {
			connected = true;
			return true;
		}
		else {
			connected = false;
			return false;
		}
	}
	double getBalacne() {
		if(connected) {
			return balacne;
		}else {
			return -1;
		}
	}
	void performDial() {
		if(connected) {
			balacne -= 0.5;
		}
	}
	public String toString(){
		String s = "电话卡接入号码:"+connectNumber+"\n电话卡卡号:"+cardNumber
				+"\n电话卡密码:"+password+"\n剩余金额:"+balacne;
		if(connected) {
			return (s+"\n电话已经接通");
		}else {
			return (s+"\n电话未接通");
		}		
	}
}    
