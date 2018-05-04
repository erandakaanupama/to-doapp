package com.webapp.jee;

public class UserValidationService {

	public boolean isValidUser(String name, String password) {
		
		if(name.equals("eab")&& password.equals("123")) {
			return true;
		}
		return false;
	}
	
	
}
