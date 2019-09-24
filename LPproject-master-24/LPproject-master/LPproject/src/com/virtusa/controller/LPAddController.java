package com.virtusa.controller;


import com.virtusa.factory.FactoryLpService;
import com.virtusa.models.LPAddModel;
import com.virtusa.sesrvices.LPAddService;

//import com.virtusa.view.LPsViewList;
import com.virtusa.view.LpRegisterView;

public class LPAddController {

	private LPAddService lpAddService;
	
	public LPAddController(){
		
		this.lpAddService=FactoryLpService.createLPServices();
		
	}
	
	public void storeLpDetails(LPAddModel lpAddModel){
		
		boolean result=lpAddService.storeLPDetailsService(lpAddModel);
		LpRegisterView lpregView=new LpRegisterView();
		if(result){
			lpregView.storeSuccessful();
		}else{
			
			lpregView.storeUnSuccessful();
		}
		
	}
}
