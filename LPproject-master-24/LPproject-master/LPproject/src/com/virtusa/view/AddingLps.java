package com.virtusa.view;

import com.virtusa.Daos.LpAddinDao;
import com.virtusa.entities.LPDetails;
import com.virtusa.factory.FactoryLpAddDao;
import com.virtusa.models.LPAddModel;

public class AddingLps {

	private LpAddinDao lpAddDao=null;
	
	public AddingLps(){
		this.lpAddDao=FactoryLpAddDao.createLpListDao();
		
	}
	public boolean storeStudentSevice(LPAddModel lpAddmodel) {
			// TODO Auto-generated method stub
		
		//L p l p=new L p();
		//lp.setLpId(lpAddmodel.getLpId());
			
		LPDetails lpDetails=new LPDetails();
		lpDetails.setLPId(lpAddmodel.getLpId());
		lpDetails.setLPfirstName(lpAddmodel.getLpfirstName());
		lpDetails.setLPlastName(lpAddmodel.getLplastName());
		//lpDetails.setStudentDetailsId(1);
		lpDetails.setLPemail(lpAddmodel.getLpemail());
		lpDetails.setLPphoneNumber(lpAddmodel.getLpphoneNumber());
		
		//lpDetails.setDetails(lpDetails);
		//Course course=new Course();
		//course.setCourseId(studentmodel.getCourseId());
			
		//student.setCourse(course);
			
		return lpAddDao.addingLpDetails(lpDetails);
				
		}
	
	
}
