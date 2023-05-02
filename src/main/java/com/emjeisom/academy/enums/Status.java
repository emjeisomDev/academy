package com.emjeisom.academy.enums;

public enum Status {
	
	ACTIVE("Active"),
	INACTIVE("Inactive"),
	LEAVE_OF_ABSENCE("Leave_of_absence"),
	CANCELLED("Cancelled");
	
	private String status;
	
	private Status(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}
	
}
