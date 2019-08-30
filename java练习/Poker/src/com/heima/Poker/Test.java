package com.heima.Poker;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建一副扑克对象
         Pokers p = new Pokers();
         //创建扑克牌中的扑克
         List<APoker> alist = p.createPoker();
//         System.out.println(alist);
//         List<APoker> alist1 = p.shufflePoker();
//         System.out.println(alist1);
         //随机抽一张
//        APoker ap =  p.getRandomPoker();
//         System.out.println(ap );
//         List<APoker> alist2 = p.sortPoker();
//         System.out.println(alist2);
         List<ColorGroup> cgList = p.sortGroup();
         System.out.println(cgList);
	}

}
