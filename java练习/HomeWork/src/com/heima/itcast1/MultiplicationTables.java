package com.heima.itcast1;

public class MultiplicationTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
        int sum;
        for(i=1;i<=9;i++){
        	for(j=1;j<=i;j++){
        		sum = i*j;
        		System.out.print(j+"*"+i+"="+sum+" ");
        	}
        	System.out.println();
        }
	}

}
