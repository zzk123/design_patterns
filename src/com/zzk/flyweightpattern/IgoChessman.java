package com.zzk.flyweightpattern;

import com.zzk.flyweightpattern2.Coordinates;

//围棋棋子类：抽象享元类
public abstract class IgoChessman {
	public abstract String getColor();
	
	public void dispaly() {
		System.out.println("棋子颜色：" + this.getColor());
	}
	
	public void dispaly(Coordinates coord) {
		System.out.println("棋子颜色：" + this.getColor()+",棋子的位置：" + coord.getX()
		 + "," + coord.getY());
	}
}
