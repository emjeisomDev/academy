package com.emjeisom.academy.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emjeisom.academy.model.Student;

public interface StudentDao extends JpaRepository<Student, Integer> {

}
