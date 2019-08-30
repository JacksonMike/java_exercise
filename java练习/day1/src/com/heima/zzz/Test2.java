package com.heima.zzz;

import java.util.Random;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] arr = {"Nancy","Ant","Ken","Ring","Gb","rrrrr","oooooo"};
        for(int i=0;i<arr.length;i++) {
        	System.out.println(arr[i]);
        }
        System.out.println("------------------");
        Random r = new Random();
        int j = r.nextInt(6);
        
        System.out.println(arr[j]);
	}

}
