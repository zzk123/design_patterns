package com.zzk.statepattern;
//抽象状态类
public abstract class AccountState {
	protected Account acc;
	//存款
	public abstract void deposit(double amount);
	//取款
	public abstract void withdraw(double amount);
	//显示所属状态
	public abstract void computeInterest();
	//状态装换
	public abstract void stateCheck();
}
