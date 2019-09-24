package com.virtusa.Daos;

import java.util.List;

import com.virtusa.models.LPAddModel;
import com.virtusa.sesrvices.LpDetailsRetrieval;
import com.virtusa.view.LPDetailsList;

//import java.util.List;

//import com.virtusa.entities.LP;
//import com.virtusa.models.LPAddModel;

public class DisplayLPs {
	private LpDetailsRetrieval lpDetailsRetrieval;
	//private List<LPAddModel> list;
	//public static DisplayLpDetails() {
		
		
	//}

	public void viewLP(){
		
		List<LPAddModel> lpAddModelList = lpDetailsRetrieval.retrieveLpDetailsService();
		LPDetailsList lpView=new LPDetailsList();
		lpView.displayLPDetails(lpAddModelList);
	}
}
