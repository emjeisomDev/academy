package com.emjeisom.academy.enums;

public enum Course {
	
	ADMINISTRATION("Administration"),
	COMPUTING("Computing"),
	ACCOUNTING("Accounting"),
	PROGRAMMING("Programming"),
	NURSING("Nursing");
	
	private String course;

	private Course(String course) {
		this.course = course;
	}
	
}
