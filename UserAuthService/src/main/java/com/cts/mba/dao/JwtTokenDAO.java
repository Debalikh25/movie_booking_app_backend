package com.cts.mba.dao;
public class JwtTokenDAO {
	
	private String token;
	
	private String type;
	
	public JwtTokenDAO(String tkn){
		this.token = tkn;
	}
	
	public void setToken(String tkn){
		this.token = tkn;
	}
	
	public String getToken(){
		return this.token;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}