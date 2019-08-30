package com.heima.aaa;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Calculator extends JFrame implements ActionListener {
	JTextField jtf1, jtf2, jtf3;
    JButton jbAdd, jbLeave,jbClear,jbReduce,jbMultiply,jbDivide;
    public Calculator() {
    	JPanel jp1 = new JPanel(); 
        jtf1 = new JTextField(8);
        JLabel jl1 = new JLabel("?");
        jtf2 = new JTextField(8);
        JLabel jl2 = new JLabel("=");
        jtf3 = new JTextField(8);
        //设置选项不可用
        jtf3.setEditable(false);
        jp1.add(jtf1);
        jp1.add(jl1);
        jp1.add(jtf2);
        jp1.add(jl2);
        jp1.add(jtf3);
        JPanel jp2 = new JPanel();
        jbAdd = new JButton("相加");
        jbAdd.addActionListener(this);
        jbReduce = new JButton("相减");
        jbReduce.addActionListener(this);
        jbMultiply = new JButton("相乘");
        jbMultiply.addActionListener(this);
        jbDivide = new JButton("相除");
        jbDivide.addActionListener(this);
        jbClear = new JButton("清空");
        jbClear.addActionListener(this);
        jbLeave = new JButton("退出");
        jbLeave.addActionListener(this);
        jp2.add(jbAdd);
        jp2.add(jbReduce);
        jp2.add(jbMultiply);
        jp2.add(jbDivide);
        jp2.add(jbClear);
        jp2.add(jbLeave);
        add(jp1);
        add(jp2);
        //设置格式
        setLayout(new FlowLayout());
        setTitle("计算器");
        setSize(502, 100);
        //窗口中央
        setLocationRelativeTo(null);
        //窗口关闭
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Calculator().setVisible(true);
    }
    private void clearText() {
        jtf1.setText("");
        jtf2.setText("");
        jtf3.setText("");
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jbAdd) {
            double d1, d2 = 0;
            d1 = Double.parseDouble(jtf1.getText().trim());
            d2 = Double.parseDouble(jtf2.getText().trim());
            //确定
            jtf3.setText((d1 + d2) + "");
            
        } 
        if(e.getSource() == jbReduce) {
        	double d1, d2 = 0;
            d1 = Double.parseDouble(jtf1.getText().trim());
            d2 = Double.parseDouble(jtf2.getText().trim());
            jtf3.setText((d1 - d2) + "");
            
        }
        if(e.getSource() == jbMultiply) {
        	double d1, d2 = 0;
            d1 = Double.parseDouble(jtf1.getText().trim());
            d2 = Double.parseDouble(jtf2.getText().trim());
            jtf3.setText((d1 * d2) + "");
           
        }
        if(e.getSource() == jbDivide) {
        	double d1, d2 = 0;
            d1 = Double.parseDouble(jtf1.getText().trim());
            d2 = Double.parseDouble(jtf2.getText().trim());
            if(d2 == 0) {
            	clearText();
            }
            jtf3.setText((d2 / d2) + "");
            
        }
        if (e.getSource() == jbLeave) {
            System.exit(0);
        }
        if (e.getSource() == jbClear) {
        	clearText();
        }
    }
}
