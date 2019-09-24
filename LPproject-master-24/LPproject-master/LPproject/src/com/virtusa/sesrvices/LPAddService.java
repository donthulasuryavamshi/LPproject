package com.virtusa.sesrvices;


import com.virtusa.Daos.LpAddinDao;
import com.virtusa.entities.LP;
import com.virtusa.entities.LPDetails;
import com.virtusa.factory.FactoryLpAddDao;
import com.virtusa.models.LPAddModel;

public class LPAddService {

	private LpAddinDao lpAddinDao = null;
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
	
	
}
