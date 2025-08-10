package com.sbms;


public class Space {
	private int unit;
	
	
	public Space() {
		System.out.println("Constructor being executed");
	}

	public int getUnit() {
		return unit;
	}

	public void setUnit(int unit) {
		this.unit = unit;
	}

	@Override
	public String toString() {
		return "Space [unit=" + unit + "]";
	}
	
	
}
