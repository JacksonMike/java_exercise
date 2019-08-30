package com.heima.zzz;

public class Demo22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int z;
           z = getArea(3,4);
           int m=3,n=8;
           getJZ(3,8);
//           System.out.println(z);
	}
    public static int getArea(int x,int y) {
    	int z = x * y;
    	return z;
    }
    
    public static void getJZ(int m,int n) {
    	int j,i;
    	for( i=1;i<=m;i++) {
    		System.out.println("&");
    	   for( j=1;j<=n;j++) { 
    		 System.out.print("&");
    	   }
    	   
    	}
    }
}
