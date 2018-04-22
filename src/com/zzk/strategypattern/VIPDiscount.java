package com.zzk.strategypattern;

public class VIPDiscount implements Discount {

	public double calculate(double price) {
		System.out.println("VIP票");
		System.out.println("增加积分");
		return price * 0.5;
	}

}
