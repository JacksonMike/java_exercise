package com.heima.itcast1;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a,b;
         if(args.length < 2) {
        	 System.out.println("运行本程序命令行应该提供的两个参数a,b(a<b):");
        	 System.exit(0);
         }
         a = Integer.parseInt(args[0]);
         b = Integer.parseInt(args[1]);
         int i;
         for(i=a;i<=b;i++) {
        	 int j;
        	 int sum=0;
        	 for(j=1;j<i;j++) {
        		 if(i%j==0) {
        			 sum += j;
        		 }
        	 }
        	 if(sum == i) {
        		 System.out.println("在"+a+"与"+b+"之间"+j+"是完全数");
        	 }
         }
	}
}
