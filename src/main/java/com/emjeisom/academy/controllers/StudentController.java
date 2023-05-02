package com.emjeisom.academy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.emjeisom.academy.dao.StudentDao;
import com.emjeisom.academy.model.Student;

@Controller
public class StudentController {
	
	@Autowired
	private StudentDao studentRepository;
	
	@GetMapping("/insert-students")
	public ModelAndView getStudents(Student student) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("student/form-student");
		mv.addObject("student", new Student());
		return mv;
	}
	
	@PostMapping("/insert-students")
	public ModelAndView postStudents(Student student) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect:/student/list-students");
		studentRepository.save(student);
		return mv;
	}
	
	
}
