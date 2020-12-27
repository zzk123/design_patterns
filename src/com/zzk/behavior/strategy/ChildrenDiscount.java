package com.zzk.behavior.strategy;

public class ChildrenDiscount implements Discount {

	@Override
	public double calculate(double price) {
		System.out.println("儿童票：");
		return price - 10;
	}

}
