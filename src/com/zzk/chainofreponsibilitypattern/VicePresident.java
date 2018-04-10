package com.zzk.chainofreponsibilitypattern;
//副董事长类：具体处理者
public class VicePresident extends Approver {

	public VicePresident(String name) {
		super(name);
	}

	//具体请求处理方法
	public void processRequest(PurchaseRequest request) {
		if(request.getAmount() < 10000) {
			System.out.println("副董事长" + this.name + "审批采购单：" + request.getNumber()
			+ "金额:" + request.getAmount() + "元，采购目的:" + request.getPurpose() + "");
		}else {
			this.successor.processRequest(request);
		}
	}

}
