package com.virtusa.view;

import java.util.List;
import java.util.Scanner;

import com.virtusa.controller.LPAddController;
import com.virtusa.models.LPAddModel;

public class LpRegisterView {
 
	
	public void RegisterLP() {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("==================================");
		System.out.println("Add onboarding Lp details here:");
		
		System.out.print("LP Id");
		int LP_Id=scanner.nextInt();
		
		System.out.print("LP FirstName:");
		String LP_firstName=scanner.next();
		
		System.out.print("LP LastName:");
		String LP_lastName=scanner.next();
		
		System.out.print("Student Email:");
		String LP_email=scanner.next();
		
		System.out.print("LP PhoneNumber:");
		String LP_phoneNumber=scanner.next();
				
		LPAddModel lpAddModel=new LPAddModel();
		lpAddModel.setLpId(LP_Id);
		lpAddModel.setLpfirstName(LP_firstName);
		lpAddModel.setLplastName(LP_lastName);
		lpAddModel.setLpemail(LP_email);
		lpAddModel.setLpphoneNumber(LP_phoneNumber);
		
		LPAddController lpAddController=new LPAddController();
		lpAddController.storeLpDetails(lpAddModel);//may happen
		//mainMenu();
		scanner.close();
	
		
	}
	public void storeSuccessful(){
		
		System.out.println("Student registered successful");
	}
	
    public void storeUnSuccessful(){
		
		System.out.println("Student registered unsuccessful");
	}
    
    
    
    public void displayStudentDetails(List<LPAddModel> studentModel){
    	
    	studentModel.forEach(System.out::println);
    }
}
