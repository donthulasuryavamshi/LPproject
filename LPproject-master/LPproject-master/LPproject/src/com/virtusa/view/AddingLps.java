package com.virtusa.view;

import com.virtusa.Daos.LpAddinDao;
import com.virtusa.factory.FactoryLpAddDao;

public class AddingLps {

	private LpAddinDao lpAddDao=null;
	
	public boolean LpAddService(){
		this.lpAddDao=FactoryLpAddDao.createLpListDao();
		
	}
	public boolean storeStudentSevice(StudentModel studentmodel) {
			// TODO Auto-generated method stub
		
		Student student=new Student();
		student.setRollNo(studentmodel.getRollNo());
			
		StudentDetails studentDetails=new StudentDetails();
		studentDetails.setFirstName(studentmodel.getFirstName());
		studentDetails.setLastName(studentmodel.getLastName());
		studentDetails.setStudentDetailsId(1);
		studentDetails.setEmail(studentmodel.getEmail());
		studentDetails.setPhoneNumber(studentmodel.getPhoneNumber());
		
		student.setStudentDetails(studentDetails);
		Course course=new Course();
		course.setCourseId(studentmodel.getCourseId());
			
		student.setCourse(course);
			
		return studentDAO.persistStudent(student);
			
			
			
			
		}
}
