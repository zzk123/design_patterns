package com.zzk.builderpattern;

public class Client {
	public static void main(String[] args) {
		ActorBuilder ab;						//针对抽象建造者编程
		ab = (ActorBuilder) XMLUtil.getBean();	//反射生成具体建造者对象
				
		ActorController ac = new ActorController(); //通过指挥者创建完整的建造者对象
		Actor actor;
		actor = ac.construct(ab);
		
		String type = actor.getType();
	}
}
