package com.atos.startup.model;

public enum RealEstate {
	HOTEL(32), HOUSE(12);
	
	private final Integer number;
	
	private RealEstate(Integer number) {
		this.number = number;
	}
	
	public Integer getNumber() {
		return number;
	}
}
