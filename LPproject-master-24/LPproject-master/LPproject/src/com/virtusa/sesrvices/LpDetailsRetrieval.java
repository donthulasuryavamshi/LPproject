package com.virtusa.sesrvices;

import java.util.ArrayList;
import java.util.List;

import com.virtusa.Daos.LpAddinDao;
import com.virtusa.entities.LP;
import com.virtusa.models.LPAddModel;

public class LpDetailsRetrieval {
	private LpAddinDao lpAddinDao = null;
	public List<LPAddModel> retrieveLpDetailsService() {
		// TODO Auto-generated method stub
		List<LP> lpList=lpAddinDao.viewLPs();
		
		List<LPAddModel> lpDetailsList=new ArrayList<>();
		
		for(LP lp : lpList){
			
			LPAddModel lpDetails = new LPAddModel();
			lpDetails.setLpId(lp.getLPDetails().getLPId());
			//lpDetails.setCourseId(stud.getCourse().getCourseId());
			lpDetails.setLpfirstName(lp.getLPDetails().getLPfirstName());
			lpDetails.setLplastName(lp.getLPDetails().getLPlastName());
			lpDetails.setLpemail(lp.getLPDetails().getLPemail());
			lpDetails.setLpphoneNumber(lp.getLPDetails().getLPphoneNumber());
			lpDetailsList.add(lpDetails);
		}
		return lpDetailsList;
	}
}
