package com.satishlabs.resolver;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.satishlabs.entity.Subject;
import com.satishlabs.enums.SubjectNameFilter;
import com.satishlabs.response.StudentReponse;
import com.satishlabs.response.SubjectResponse;

@Service
public class StudentResponseResolver implements GraphQLResolver<StudentReponse> {

	public List<SubjectResponse> getLearningSubjects(StudentReponse studentReponse,SubjectNameFilter subjectNameFilter) {

		List<SubjectResponse> learningSubjects = new ArrayList<SubjectResponse>();

		if (studentReponse.getStudent().getLearningSubjects() != null) {
			for (Subject subject : studentReponse.getStudent().getLearningSubjects()) {
				if(subjectNameFilter.name().equalsIgnoreCase("ALL")) {
					learningSubjects.add(new SubjectResponse(subject));
				}else if(subjectNameFilter.name().equalsIgnoreCase(subject.getSubjectName())) {
					learningSubjects.add(new SubjectResponse(subject));
				}
				
			}
		}
		return learningSubjects;
	}
	
	public String getFullName(StudentReponse studentReponse) {
		return studentReponse.getFirstName()+" "+studentReponse.getLastName();
	}
}
