package com.emjeisom.academy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.emjeisom.academy.model.Student;

@Controller
public class StudentController {
	
	@GetMapping("/insert-students")
	public ModelAndView insertStudents(Student student) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("student/form-student");
		mv.addObject("student", new Student());
		return mv;
	}
	
	
}
