package com.satishlabs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.satishlabs.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
