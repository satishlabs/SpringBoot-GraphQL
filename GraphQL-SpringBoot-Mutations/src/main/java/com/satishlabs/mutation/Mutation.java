package com.satishlabs.mutation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.satishlabs.response.StudentReponse;
import com.satishlabs.service.StudentService;

@Service
public class Mutation implements GraphQLMutationResolver {

	@Autowired
	private StudentService studentService;

	public StudentReponse creatStudent(CreateStu) {

	}
}
