package com.satishlabs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.satishlabs.entity.Student;
import com.satishlabs.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public Student getStudentById(long id) {
		return studentRepository.findById(id).get();
	}
}
