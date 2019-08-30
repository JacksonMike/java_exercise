package com.heima.itcast1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入a:");
        int a = sc.nextInt();
        System.out.println("请输入b(b>a):");
        int b = sc.nextInt();
        int i,j;
        for(i=a;i<=b;i++) {
        	j=2;
        	while(i%j != 0) {
        		j ++;
        	}
        	if(j==i) {
        		System.out.println("素数为:"+i);
        	}
        }
        
	}

}
