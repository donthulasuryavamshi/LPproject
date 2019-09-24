package com.virtusa.repository;

import java.util.ArrayList;
import java.util.List;

import com.virtusa.entities.Admin;
import com.virtusa.entities.users;

public class UserAuth {
	
	private static List<users> UserAuth = new ArrayList<users>();
	static {
	
		Admin admin = new Admin();
		admin.setUserName("admin");
		admin.setPassword("admin");
		UserAuth.add(admin);
	}
	public static List<users> getUserAuth(){
	
		return UserAuth;
	}
}
