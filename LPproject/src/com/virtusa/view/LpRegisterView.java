package com.virtusa.view;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
//import java.util.Scanner;

import com.virtusa.controller.LPAddController;
import com.virtusa.models.LPAddModel;

public class LpRegisterView {
 
	
	public void RegisterLP() {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		// TODO Auto-generated method stub
		//Scanner scanner=new Scanner(System.in);
		System.out.println("==================================");
		System.out.println("Add onboarding Lp details here:");
		
		System.out.print("LP Id");
		int LP_Id=Integer.parseInt(buffer.readLine());
		
		System.out.print("LP FirstName:");
		String LP_firstName=buffer.readLine();
		
		System.out.print("LP LastName:");
		String LP_lastName=buffer.readLine();
		
		System.out.print("Student Email:");
		String LP_email=buffer.readLine();
		
		System.out.print("LP PhoneNumber:");
		String LP_phoneNumber=buffer.readLine();
				
		LPAddModel lpAddModel=new LPAddModel();
		lpAddModel.setLpId(LP_Id);
		lpAddModel.setLpfirstName(LP_firstName);
		lpAddModel.setLplastName(LP_lastName);
		lpAddModel.setLpemail(LP_email);
		lpAddModel.setLpphoneNumber(LP_phoneNumber);
		
		LPAddController lpAddController=new LPAddController();
		lpAddController.storeLpDetails(lpAddModel);//may happen
		
		AdminView av =new AdminView();
			av.adminMenuOptions();
		
		buffer.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	
		
	}
	public void storeSuccessful(){
		
		System.out.println("LP onboarding details registered successful");
	}
	
    public void storeUnSuccessful(){
		
		System.out.println("Lp onboading details registered unsuccessful");
	}
    
    
    
    public void displayLpDetails(List<LPAddModel> lpAddModel){
    	
    	lpAddModel.forEach(System.out::println);
    
    }
}