package com.tas.test.control.model.entity;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	
	public Student(String fullName, Date dateOfBirth, String address, String school) {
		super();
		this.fullName = fullName;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.school = school;
	}
	private int  id;
	private String fullName;
	private Date dateOfBirth;
	private String address;
	private String school;
	public StudentWapper toWapper() {
	return new StudentWapper(fullName,this.dateOfBirth.getYear()+"-"+this.dateOfBirth.getMonth()+"-"+this.dateOfBirth.getDay(), address, school);
	}
}
