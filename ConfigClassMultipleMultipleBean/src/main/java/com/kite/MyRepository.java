package com.kite;

public class MyRepository {
	private String code;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "MyRepository [code=" + code + "]";
	}
	
}
