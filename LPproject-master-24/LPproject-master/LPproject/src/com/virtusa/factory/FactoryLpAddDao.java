package com.virtusa.factory;


import com.virtusa.Daos.LpAddinDao;

public class FactoryLpAddDao {

	public LpAddinDao createLpListDao() {
		LpAddinDao lpAddinDao = new LpAddinDao();
		return lpAddinDao;
	}
}
