package com.heima.itcast1;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
 
public class Calculator extends JFrame{
	//主函数
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Calculator();
	}
	JPanel panel;
	JTextField text;
	//0~9四个数字（可写成数组）
	JButton jb0,jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9;
	//加减乘除以及小数点五个符号
	JButton bot,add,sub,mul,div,equ,cle;	
	public Calculator(){
		//窗体大小
		this.setBounds(300, 200, 400, 300);	
		//窗体名称
		this.setTitle("计算器");	
		//设置计算机窗体的布局方式
		this.setLayout(new BorderLayout());	
		//计算区域
		text = new JTextField(15);		
		//新建数字按钮
		jb0 = new JButton("0");
		jb1 = new JButton("1");
		jb2 = new JButton("2");
		jb3 = new JButton("3");
		jb4 = new JButton("4");
		jb5 = new JButton("5");
		jb6 = new JButton("6");
		jb7 = new JButton("7");
		jb8 = new JButton("8");
		jb9 = new JButton("9");
		
		//新建符号按钮
		bot = new JButton(".");
		add = new JButton("+");
		sub = new JButton("-");
		mul = new JButton("*");
		div = new JButton("/");
		equ = new JButton("=");
		//新建计算器数字及符号所在区域面板
		panel = new JPanel();
		//设置面板的布局方式
		panel.setLayout(new GridLayout(4,4));	
		//将各按钮组件放入面板（panel）中
		//第一行
		panel.add(jb7);
		panel.add(jb8);
		panel.add(jb9);
		panel.add(div);
		//第二行
		panel.add(jb4);
		panel.add(jb5);
		panel.add(jb6);
		panel.add(mul);
		//第三行
		panel.add(jb1);
		panel.add(jb2);
		panel.add(jb3);
		panel.add(sub);
		//第四行
		panel.add(bot);
		panel.add(jb0);
		panel.add(equ);
		panel.add(add);
		this.add(text,BorderLayout.NORTH);
		this.add(panel);
		//事件处理
		MyEvent();	
		//设置窗体显示
		this.setVisible(true);	
		//设置窗体可关闭
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	public void MyEvent(){
		Text(jb0);
		Text(jb1);
		Text(jb2);
		Text(jb3);
		Text(jb4);
		Text(jb5);
		Text(jb6);
		Text(jb7);
		Text(jb8);
		Text(jb9);
		Text(bot);
		Text(add);
		Text(sub);
		Text(mul);
		Text(div);
		
		//“=”按钮的事件处理
		equ.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				text.setText(text.getText()+equ.getText());
				if(text.getText().contains("+")){//做加法运算
					StringTokenizer st1 = new StringTokenizer(text.getText(),"+");
					double d1,d2 = 0;
					d1 = Double.parseDouble(st1.nextToken());
					while(st1.hasMoreTokens()){
						StringTokenizer st2 = new StringTokenizer(st1.nextToken(),"=");
//						System.out.println("str2======"+st2.nextToken());
						d2 = Double.parseDouble(st2.nextToken());
					}
					text.setText(text.getText()+" "+(d1+d2));
				}else if(text.getText().contains("-")){//做减法运算
					StringTokenizer st1 = new StringTokenizer(text.getText(),"-");
					double d1,d2 = 0;
					d1 = Double.parseDouble(st1.nextToken());
					while(st1.hasMoreTokens()){
						StringTokenizer st2 = new StringTokenizer(st1.nextToken(),"=");
						d2 = Double.parseDouble(st2.nextToken());
					}
					
					text.setText(text.getText()+" "+(d1-d2));
				}else if(text.getText().contains("*")){//做乘法运算
					StringTokenizer st1 = new StringTokenizer(text.getText(),"*");
					double d1,d2 = 0;
					d1 = Double.parseDouble(st1.nextToken());
					while(st1.hasMoreTokens()){
						StringTokenizer st2 = new StringTokenizer(st1.nextToken(),"=");
						d2 = Double.parseDouble(st2.nextToken());
					}
					
					text.setText(text.getText()+" "+(d1*d2));
				}else if(text.getText().contains("/")){//做除法运算
					StringTokenizer st1 = new StringTokenizer(text.getText(),"/");
					double d1,d2 = 0;
					d1 = Double.parseDouble(st1.nextToken());
					while(st1.hasMoreTokens()){
						StringTokenizer st2 = new StringTokenizer(st1.nextToken(),"=");
						d2 = Double.parseDouble(st2.nextToken());
					}
					text.setText(text.getText()+" "+(d1/d2));	//将运算结果放到text区域
				}
			}
		});
	}
	//各按钮的事件处理方法
	public void Text(JButton button){
		button.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String str = button.getText();
				text.setText(text.getText()+str);
			}
		});
	}
}

