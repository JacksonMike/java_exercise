package com.heima.itcast1;
import java.util.Scanner;
public class CalculateWage {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.println("请输入您的工资:");
       double a = sc.nextDouble();
       double b;
       if(a <= 5000) {
    	   System.out.println("不用缴税");   
       }else if(a <= 800) {
    	   b = (a-5000)*0.03;
    	   System.out.println("应缴税为"+b);
       }else if(a <= 17000) {
    	   b = 3000*0.03 + (a-8000)*0.1;
    	   System.out.println("应缴税为"+b); 
       }else if(a <= 30000) {
    	   b = 3000*0.03 + 9000*0.1 + (a-17000)*0.2;
    	   System.out.println("应缴税为"+b);  
       }else if(a <= 40000) {
    	   b = 3000*0.03 + 9000*0.1 + 13000*0.2 + (a-30000)*0.25;
    	   System.out.println("应缴税为"+b);
       }else if(a <= 60000) {
    	   b = 3000*0.03 + 9000*0.1 + 13000*0.2 + 10000*0.25 + (a-40000)*0.3;
    	   System.out.println("应缴税为"+b);
       }else if(a <= 85000) {
    	   b = 3000*0.03 + 9000*0.1 + 13000*0.2 + 10000*0.25 + 20000*0.3 + (a-60000)*0.35;
    	   System.out.println("应缴税为"+b);
       }else {
    	   b = 3000*0.03 + 9000*0.1 + 13000*0.2 + 10000*0.25 + 20000*0.3 + 25000*0.35 + (a-85000)*0.45;
    	   System.out.println("应缴税为"+b);
       }
	}
}
