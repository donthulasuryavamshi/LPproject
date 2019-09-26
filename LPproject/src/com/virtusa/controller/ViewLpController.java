package com.virtusa.controller;

//import java.util.ArrayList;
import java.util.List;

import com.virtusa.models.LPAddModel;
import com.virtusa.sesrvices.LPAddService;
//import java.util.List;
//import com.virtusa.models.LPAddModel;
import com.virtusa.sesrvices.LpDetailsRetrieval;
//import com.virtusa.view.LPDetailsList;

public class ViewLpController {
private LPAddService lpAddService;
	//private ViewLpController() {
		//ViewLpController.displayStudentDetails()
	//}
	//LpDetailsRetrieval lpDetailsRetrieval = new LpDetailsRetrieval();

	//public void viewLP(){
		
		//List<LPAddModel> lpAddModelList = lpDetailsRetrieval.retrieveLpDetailsService();
		//LPDetailsList lpView=new LPDetailsList();
		//lpView.displayLPDetails(lpAddModelList);
	//}
	
	//public void displayLps() {
		//LpDetailsRetrieval lpDetailsRetrieval = new LpDetailsRetrieval();
		//lpDetailsRetrieval.retrieveLpDetailsService();
	//}

	public void displayStudentDetails(){
    	
    	List<LPAddModel> lpAddModel =lpAddService.retrieveLpDetailsService() ; 
    	LpDetailsRetrieval ldr = new LpDetailsRetrieval();
    	ldr.retrieveLpDetailsService();
    }

}
