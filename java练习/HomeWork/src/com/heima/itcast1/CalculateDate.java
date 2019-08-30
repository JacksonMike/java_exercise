package com.heima.itcast1;
import java.util.Scanner;
public class CalculateDate {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年:");
        int a = sc.nextInt();
        System.out.println("请入月:");
        int b = sc.nextInt();
        System.out.println("请输入日:");
        int c = sc.nextInt();
        int i;
        //n月前的各个月天数总和
        int sum = 0;
        //总天数
        int e;
        if(a%4==0 && a%100!=0){
        	int d[]= {31,29,31,30,31,30,31,31,30,31,30,31};
        	for(i=0;i<b-1;i++) {
        		sum += d[i];
        	}
        	e = sum + c;
            System.out.println("这天是这一年的第" + e + "天");
         }else if(a%400==0){
        	 int m[]= {31,29,31,30,31,30,31,31,30,31,30,31};
        	 for(i=0;i<b-1;i++) {
         		sum += m[i];
         	}
         	e = sum + c;
            System.out.println("这天是这一年的第" + e + "天");
         }else {
        	 int n[]= {31,28,31,30,31,30,31,31,30,31,30,31};
        	 for(i=0;i<b-1;i++) {
         		sum += n[i];
         	}
         	e = sum + c ;
            System.out.println("这天是这一年的第" + e + "天");
         } 
	}
}
