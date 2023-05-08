package com.emjeisom.academy.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.emjeisom.academy.model.Student;

public interface StudentDao extends JpaRepository<Student, Integer> {
	
	@Query("select j from student j where j.status = 0 ")
	public List<Student> findByStatusActive(); 
}
