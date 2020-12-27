package com.zzk.structal.flyWeight.flyweightpattern2;

import com.zzk.structal.flyWeight.flyweightpattern.IgoChessman;
import com.zzk.structal.flyWeight.flyweightpattern.IgoChessmanFactory;

public class Cilent {
	public static void main(String[] args) {
		IgoChessman black1, black2, black3, white1, white2;
		IgoChessmanFactory factory;
		
		//获取享元工厂对象
		factory = IgoChessmanFactory.getInstance();
		
		//通过享元工厂获取3颗黑子
		black1 = factory.getIgoChessman("b");
		black2 = factory.getIgoChessman("b");
		black3 = factory.getIgoChessman("b");
		System.out.println("判断两个黑子是否相同:"+ (black1 == black3));
		
		//通过享元工厂获取两颗棋子
		white1 = factory.getIgoChessman("w");
		white2 = factory.getIgoChessman("w");
		System.out.println("判断两个白子是否相同:"+ (white1 == white2));
		
		//显示棋子
		black1.dispaly(new Coordinates(1, 4));
		black2.dispaly(new Coordinates(3, 3));
		black3.dispaly(new Coordinates(6, 4));
		white1.dispaly(new Coordinates(7, 6));
		white2.dispaly(new Coordinates(8, 7));
	}
}
