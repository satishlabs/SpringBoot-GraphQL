package com.satishlabs.query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.satishlabs.request.SampleRequest;
import com.satishlabs.response.StudentReponse;
import com.satishlabs.service.StudentService;

@Component
public class Query implements GraphQLQueryResolver{
	
	@Autowired
	private StudentService studentService;
		
	public String firstQuery() {
		return "First Query";
	}
	
	public String secondQuery() {
		return "Second Query";
	}
	
	public String fullName(String firstName,String lastName) {
		return firstName+" "+lastName;
	}
	
	public String fullName1(SampleRequest sampleRequest) {
		return sampleRequest.getFirstName()+" "+sampleRequest.getLastName();
	}
	
	public StudentReponse getStudent(long id) {
		return new StudentReponse(studentService.getStudentById(id));
	}
}
