package com.heima.aaa;

import java.util.Random;
import java.util.Scanner;

public class GuessNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Random r = new Random();
        int i = r.nextInt(100) + 1; 
        Scanner sc = new Scanner(System.in);
        
        while(true) {
        	int j = sc.nextInt();
        	if(j > i)
        		System.out.println("big");
        	       
        	if(j < i)
        		System.out.println(" small");
        	     
           if(j == i) {
        	   System.out.println("right");
        	   break;
           }
        } 
	}
}
