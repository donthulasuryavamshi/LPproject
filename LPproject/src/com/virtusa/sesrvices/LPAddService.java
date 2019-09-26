package com.virtusa.sesrvices;


import java.util.ArrayList;
import java.util.List;

import com.virtusa.Daos.LpAddinDao;
import com.virtusa.entities.LP;
import com.virtusa.entities.LPDetails;
import com.virtusa.factory.FactoryLpAddDao;
import com.virtusa.models.LPAddModel;

public class LPAddService {

	private LpAddinDao lpAddinDao;
	public LPAddService(){
	
		this.lpAddinDao=FactoryLpAddDao.createLpListDao();
	}
	public boolean storeLPDetailsService(LPAddModel lpAddmodel) {
		// TODO Auto-generated method stub
		
		LP lp = new LP();
		//lp.setLpId(lpAddmodel.getLpId());
		
		
		LPDetails lpDetails=new LPDetails();
		lpDetails.setLPId(lpAddmodel.getLpId());
		lpDetails.setLPfirstName(lpAddmodel.getLpfirstName());
		lpDetails.setLPlastName(lpAddmodel.getLplastName());
		lpDetails.setLPemail(lpAddmodel.getLpemail());
		lpDetails.setLPphoneNumber(lpAddmodel.getLpphoneNumber());
		
		lp.setLPDetails(lpDetails);
		//Course course=new Course();
		//course.setCourseId(studentmodel.getCourseId());
		
		//student.setCourse(course);
		
		return lpAddinDao.addingLpDetails(lpDetails);	
	}
	
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
