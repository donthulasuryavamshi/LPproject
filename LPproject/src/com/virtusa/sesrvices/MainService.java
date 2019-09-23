package com.virtusa.sesrvices;

import com.virtusa.Daos.UsersLoginDao;
import com.virtusa.factory.UserLoginFactory;
import com.virtusa.models.UserLoginModel;

public class MainService{ // implements LoginServiceInterface{

	private UsersLoginDao userLoginDao = null;
	
	
	public MainService() {
		// TODO Auto-generated constructor stub
	
		this.userLoginDao = UserLoginFactory.createUserLoginDAO();
	}
	//@Override
	public String userAuthenticationService(UserLoginModel userModel) {
		// TODO Auto-generated method stub
		
		return null;
	}
}
