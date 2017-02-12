package com.donedeal.randombeer.model;

public enum TypeBeer {
	
	LAGER("Lager"),
	BLONDE("Blonde"),
	AMBER("Amber"),
	PORTER("Porter"),
	STOUT("Stout");
	
	private String typeDescription;
	
	private TypeBeer(String typeDescription){
		this.typeDescription = typeDescription;
	}

	public String getTypeDescription() {
		return typeDescription;
	}
}
