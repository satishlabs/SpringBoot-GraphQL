package com.satishlabs.response;

import java.util.List;

import com.satishlabs.entity.Student;

import lombok.Data;

@Data
public class StudentReponse {
	private long id;
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private String street;
	
	private String city;
	
	private List<SubjectResponse> learningSubjects;
	
	//this is for internal use , DO NOT PUT IN SCHEMA
	private Student student;
	
	private String fullName;
	
	public StudentReponse (Student student) {
		this.student = student;
		this.id = student.getId();
		this.firstName = student.getFirstName();
		this.lastName = student.getLastName();
		this.email = student.getEmail();
		this.street = student.getAddress().getStreet();
		this.city = student.getAddress().getCity();
		/*
		if(student.getLearningSubjects() != null) {
			learningSubjects = new ArrayList<SubjectResponse>();
			for(Subject subject : student.getLearningSubjects()) {
				learningSubjects.add(new SubjectResponse(subject));
			}
		} */
	}
}
