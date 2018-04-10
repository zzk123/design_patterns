package com.zzk.commandpattern;

import java.util.ArrayList;
//功能键设置窗口类
public class FBSettingWindow {
	private String title;
	private ArrayList<FunctionButton> functionButtons = new ArrayList<FunctionButton>();
	
	public FBSettingWindow(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public ArrayList<FunctionButton> getFunctionButtons() {
		return functionButtons;
	}

	public void setFunctionButtons(ArrayList<FunctionButton> functionButtons) {
		this.functionButtons = functionButtons;
	}
	
	public void addFunctionButton(FunctionButton fb) {
		functionButtons.add(fb);
	}
	
	public void removeFunctionButton(FunctionButton fb) {
		functionButtons.remove(fb);
	}
	public void display() {
		System.out.println("显示窗口：" + this.title);
		System.out.println("显示功能键:");
		for(Object obj : functionButtons) {
			System.out.println(((FunctionButton)obj).getName());
		}
		System.out.println("------------------------------");
	}
}
