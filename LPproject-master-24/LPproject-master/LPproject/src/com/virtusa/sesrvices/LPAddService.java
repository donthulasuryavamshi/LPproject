package com.virtusa.sesrvices;

import java.util.List;

import com.virtusa.Daos.LpAddinDao;
import com.virtusa.entities.LP;
import com.virtusa.entities.LPDetails;
import com.virtusa.factory.FactoryLpAddDao;
import com.virtusa.models.LPAddModel;

public class LPAddService {

	private LpAddinDao lpAddinDAO=null;
	public LPAddService(){
	
		this.lpAddinDAO=FactoryLpAddDao.createLpListDao();
	}
	public boolean storeLPDetailsService(LPAddModel lpAddmodel) {
		// TODO Auto-generated method stub
		
		//LP lp=new LP();
		//lp.setLpId(lpAddmodel.getLpId());
		
		LPDetails lpDetails=new LPDetails();
		lpDetails.setLPId(lpAddmodel.getLpId());
		lpDetails.setLPfirstName(lpAddmodel.getLpfirstName());
		lpDetails.setLPlastName(lpAddmodel.getLplastName());
		//lpDetails.setStudentDetailsId(1);
		lpDetails.setLPemail(lpAddmodel.getLpemail());
		lpDetails.setLPphoneNumber(lpAddmodel.getLpphoneNumber());
		
		LP.setLPDetails(lpDetails);
		//Course course=new Course();
		//course.setCourseId(studentmodel.getCourseId());
		
		//student.setCourse(course);
		
		return lpAddinDAO.lpDisplay(lpDetails);	
	}
	
	public List<lpAddModel> fetchingLPDetails(){
		
	}
	
	
}
