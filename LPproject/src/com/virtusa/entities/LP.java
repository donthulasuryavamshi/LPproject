package com.virtusa.entities;

public class LP {
	
	private LPDetails lpDetails;

	public LPDetails getLPDetails() {
		return lpDetails;
	}

	public void setLPDetails(LPDetails lpDetails) {
		this.lpDetails = lpDetails;
	}

	@Override
	public String toString() {
		return "LP [lpDetails=" + lpDetails + "]";
	}
	
}