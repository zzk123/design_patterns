package com.zzk.interpreterpattern;

public class DistanceNode extends AbstractNode {

	private String distance;
	
	public DistanceNode(String distance) {
		this.distance = distance;
	}
	
	//距离表达式的解释操作
	public String interpret() {
		return this.distance;
	}

}
