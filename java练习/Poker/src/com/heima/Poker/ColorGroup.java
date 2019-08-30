package com.heima.Poker;

import java.util.ArrayList;
import java.util.List;

public class ColorGroup implements Comparable<ColorGroup> {
     //组内扑克数
	private int pokerCount;
	//组的花色
	private int color;
	//花色符号
	private String colorText;
	//组内扑克
	private List<APoker> apList = new ArrayList<APoker>();
	//存储组的集合
	public int getPokerCount() {
		return pokerCount;
	}
	public void setPokerCount(int pokerCount) {
		this.pokerCount = pokerCount;
	}
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}
	public String getColorText() {
		return colorText;
	}
	public void setColorText(String colorText) {
		this.colorText = colorText;
	}
	public List<APoker> getApList() {
		return apList;
	}
	public void setApList(List<APoker> apList) {
		this.apList = apList;
	}
	@Override
	public int compareTo(ColorGroup o) {
		// TODO Auto-generated method stub
		return this.getColor() - o.getColor();
	}
	@Override
	public String toString() {
		return "ColorGroup [pokerCount=" + pokerCount + ", color=" + color + ", colorText=" + colorText + ", apList="
				+ apList + "]\n";
	}
	
}
