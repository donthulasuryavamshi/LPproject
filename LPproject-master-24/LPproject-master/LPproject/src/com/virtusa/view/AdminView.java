package com.virtusa.view;

import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStream;
import java.io.InputStreamReader;
//import java.io.Reader;

public class AdminView {

	public void adminMenuOptions() {
		System.out.println("Hello Admin Welcome back!!");
		System.out.println("choose the options from the below panel.......");
		System.out.println("====================================================");
		System.out.println("1. enroll LP to batch");
		System.out.println("2. view Lp");
		System.out.println("3. view Mentors");
		System.out.println("4. view Training Venues");
		System.out.println("5. logout");
		System.out.println("====================================================");
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
			int option = Integer.parseInt(br.readLine());
			switch(option) {
			
			case 1:
				LpRegisterView lrv = new LpRegisterView();
				lrv.RegisterLP();
				break;
			
			case 2:
				break;
			
			case 3:
				break;
			
			case 4: 
				break;
			case 5:
				LogoutView lov = new LogoutView();
				lov.LogoutMessage();
				break;
			
			default:
				System.out.println(" please enter a valid option!!");
			}
			
		}catch(Exception e) {
			System.out.println(" error in admin view option panel");
			e.printStackTrace();
		}
}

}
