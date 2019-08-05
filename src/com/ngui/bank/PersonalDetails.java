package com.ngui.bank;

import java.util.Collection;

public interface PersonalDetails {

	public String getUserName ( String firstName , String lastName);
	
	public Long getMobileNumber();
	
	public Integer getEmployeeId();
	
	public Collection<String> getAddress();
}
