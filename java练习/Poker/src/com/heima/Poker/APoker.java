package com.heima.Poker;

public class APoker implements Comparable<APoker> {
      private int color;
      //花色
      private String colorText;
      //花色值
      private int value;
      //点数
      private String valueText;
      //点数值
	public APoker(int color, String colorText, int value, String valueText) {
		super();
		this.color = color;
		this.colorText = colorText;
		this.value = value;
		this.valueText = valueText;
	}
	//构造器
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
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getValueText() {
		return valueText;
	}
	public void setValueText(String valueText) {
		this.valueText = valueText;
	}
	@Override
	public String toString() {
		return "APoker [color=" + color + ", colorText=" + colorText + ", value=" + value + ", valueText=" + valueText
				+ "]\n";
	}
	//方便打印
	@Override
	//重写比较的方法
	public int compareTo(APoker o) {
		// TODO Auto-generated method stub
		//  先根据花色比较
		int val = this.color - o.color;
		if(val == 0) {
			//如果花色相同使用值比较
			val = this.value - o.value;
		}
		return 0;
	}
      
}
