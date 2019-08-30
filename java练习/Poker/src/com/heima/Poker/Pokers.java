package com.heima.Poker;

import java.io.LineNumberInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Pokers {
      private int pokerCount;
      //扑克张数
      private int colorCount;
      //扑克数量
      private List<APoker> aList;
      //扑克集合
      private List<ColorGroup> cgList;
      //存储组的集合
	public int getPokerCount() {
		return pokerCount;
	}

	public void setPokerCount(int pokerCount) {
		this.pokerCount = pokerCount;
	}

	public int getColorCount() {
		return colorCount;
	}

	public void setColorCount(int colorCount) {
		this.colorCount = colorCount;
	}

	public List<APoker> getaList() {
		return aList;
	}

	public void setaList(List<APoker> aList) {
		this.aList = aList;
	}
	//创建扑克
    public List<APoker> createPoker(){
    	//初始化扑克数量
    	pokerCount = 54;
    	//初始化花色数量
    	colorCount = 5;
    	//创建扑克集合
    	aList = new ArrayList<APoker>(); 
    	//循环非王花色
    	for(int i=2;i<=5;i++) {
    		//循环非王花色值
    		for(int j=1;j<=13;j++) {
    			String colorText = null;
    			String valueText = null;
    			//给花色赋值符号
    			colorText = findColorText(i);
    			//给扑克的值赋符号
    			valueText = findValueText(j);
    			//创建一张扑克对象
    			APoker ap = new APoker(i, colorText, j, valueText);
    			//把每一张扑克对象放进扑克盒
    			aList.add(ap);
    		}
    	}
    	//创建大小王
		APoker ap1 = new APoker(1, "🐯️", 14, "小王");
		APoker ap2 = new APoker(1, "🐯️", 15, "大王");
		aList.add(ap2);
		aList.add(ap1);
    	return aList;
    }
    //洗牌
    public List<APoker> shufflePoker(){
    	Collections.shuffle(aList);
    	return  aList;
    }
    //抽一张牌
    public APoker getRandomPoker() {
     	Random r = new Random();
     	//获取随机索引
     	int index = r.nextInt(this.pokerCount);
    	return aList.get(index);
    }
    //排序
    public List<APoker> sortPoker(){
    	Collections.sort(aList);
    	return aList;
    }
    //分组
    public List<ColorGroup> sortGroup(){
    	//创建大集合
        cgList = new ArrayList<ColorGroup>();
        // 遍历扑克牌
        for(APoker ap:aList) {
        	//获得扑克花色
        	int color = ap.getColor();
        	ColorGroup cg = this.findGroup(color);
        	if(cg == null) {
        		// 创建一个组
        		ColorGroup cGroup = new ColorGroup();
        		cGroup.setColor(color);
        		//设置花色符号
        		cGroup.setColorText(findColorText(color));
        		//把扑克加到组中
        		cGroup.getApList().add(ap);
        		//把组加入组集合
        		cgList.add(cGroup);
        	}else {
        		cg.getApList().add(ap);
        	}
        }
        //获得扑克组中的扑克牌数量
        for(ColorGroup cg2:cgList)
        	cg2.setPokerCount(cg2.getApList().size());
		Collections.sort(cgList);
    	return cgList;
    }
    //根据花色找组
    public ColorGroup findGroup(int color) {
    	//定义一个组的对象
    	ColorGroup cg1 = null;
    	//遍历组集合
    	for (ColorGroup cg:cgList) {
			//如果传递过来的花色与其中一个花色匹配
			if(color == cg.getColor()) {
				cg1 = cg;
				break;
			}
		}
    	return cg1;
    }
    // 根据花色值找花色符号
    public static String findColorText(int color) {
    	String colorText = null;
    	switch (color) {
    	case 1:
    		colorText = "🐯";
    		break;
		case 2:
			colorText = "♥️";
			break;
		case 3:
			colorText = "🌟";
			break;
		case 4:
			colorText = "♣️";
			break;
		case 5:
			colorText = "♦️";
			break;
		}
    	return colorText;
    }
    //根据花色值找值
    public static String findValueText(int value) {
    	String valueText = null;
    	switch (value) {
		case 1:
			valueText = "A";
			break;
		case 11:
			valueText = "J";
			break;
		case 12:
			valueText = "Q";
			break;
		case 13:
			valueText = "K";
			break;
		default:
			valueText = value + "";
			break;
		}
    	return valueText;
    }
}
