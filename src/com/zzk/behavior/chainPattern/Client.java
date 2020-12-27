package com.zzk.behavior.chainPattern;

public class Client {
	public static void main(String[] args) {
		Approver wjzhang, gyang, jguo, meeting;
		wjzhang = new Director("张无忌");
		gyang = new VicePresident("杨过");
		jguo = new President("郭靖");
		meeting = new Congress("董事会");
		
		//创建职责链
		wjzhang.setSuccessor(gyang);
		gyang.setSuccessor(jguo);
		jguo.setSuccessor(meeting);
		
		//创建采购单
		PurchaseRequest pr1 = new PurchaseRequest(45000, 10001, "购买倚天剑");
		wjzhang.processRequest(pr1);
		
		PurchaseRequest pr2 = new PurchaseRequest(60000, 10002, "购买屠龙刀");
		wjzhang.processRequest(pr2);
		
		PurchaseRequest pr3 = new PurchaseRequest(160000, 10003, "购买九阳真经");
		wjzhang.processRequest(pr3);
		
		PurchaseRequest pr4 = new PurchaseRequest(8000000, 10001, "购买桃花岛");
		wjzhang.processRequest(pr4);
	}
}
