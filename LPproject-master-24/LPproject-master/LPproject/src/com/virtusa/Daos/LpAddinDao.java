package com.virtusa.Daos;

import java.util.List;

import com.virtusa.entities.LP;
import com.virtusa.entities.LPDetails;
import com.virtusa.repository.LPDetailsRepository;

public class LpAddinDao {

	public boolean addingLpDetails(LPDetails lpDetails) {
		
		return LPDetailsRepository.add(lpDetails);
		
	}
	public List<LP> viewLPs() {
		// TODO Auto-generated method stub
		return LPRepository.get();
	}
}
