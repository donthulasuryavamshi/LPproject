package com.virtusa.repository;

import java.util.ArrayList;
import java.util.List;

import com.virtusa.entities.LP;
import com.virtusa.entities.LPDetails;
import com.virtusa.userslogin.Lp;

public class LPDetailsRepository {
	private static List<LPDetails> lpDetails =  new ArrayList<>();
	
	public static boolean add(LP lp) {
		
		return lpDetails.add(lp);		
	}
	
	public static List<LPDetails> get(){
		return lpDetails;
	}
}
