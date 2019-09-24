package com.virtusa.repository;

import java.util.ArrayList;
import java.util.List;

import com.virtusa.entities.LPDetails;

public class LPDetailsRepository {
	private static List<LPDetails> lpDetails =  new ArrayList<>();
	
	public static boolean add(LPDetails lpDetail) {
		
		return lpDetails.add(lpDetail);		
	}
	
	public static List<LPDetails> get(){
		return lpDetails;
	}

	
}
