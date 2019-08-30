package com.heima.itcast1;
import java.util.Scanner;
public class CommonDivisor {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("请输入两个整数a,b(a<b)");
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       int i ;
       for(i=b;i>=1;i--){
    	   if(a%i==0 && b%i==0){
    		   System.out.println("最大公约数:"+i);
    		   System.out.println("是否使用1继续,0结束:");
    		   int c = sc.nextInt();
    		   if(c == 1){
    			   System.out.println("最大公约数:"+i);
    			   break;
    		   }
    		   if(c == 0){
    			   System.out.println("谢谢使用");
    			   break;
    		   }
    	   }
       }
	}

}
