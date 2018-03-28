package com.zzk.proxypattern2;
//具体UserDAO类：真实角色
public class UserDAO implements AbstractUserDAO {

	public Boolean findUserById(String userId) {
		if(userId.equalsIgnoreCase("张无忌")) {
			System.out.println("查询ID为"+ userId + "的用户信息成功");
			return true;
		}else {
			System.out.println("查询ID为"+ userId + "的用户信息成功");
			return false;
		}
	}

}
