package com.virtusa.view;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.virtusa.controller.MainController;

public class LoginView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		InputStreamReader reader=new InputStreamReader(System.in);
		BufferedReader buffer=new BufferedReader(reader);
		System.out.println("welcome to the login portal!!");
		System.out.println("entre your credentials to login:");
		System.out.println("username:");
		String Username = buffer.readLine();
		System.out.println("password");
		String Password = buffer.readLine();
		MainController mainControl = new MainController();
		mainControl.Authenticate(Username,Password);
		}catch(Exception e) {
			System.out.println("check exeception at login page!!");
		}
	}

}
