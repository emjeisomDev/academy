package com.emjeisom.academy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("/list-students")
	public ModelAndView getStudentsList() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("student/list-students");
		mv.addObject("studentList", studentRepository.findAll());
		return mv;
	}
	
	@GetMapping("/update/{id}")
	public ModelAndView update(@PathVariable("id") Integer id) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("student/update");
		Student student = studentRepository.getReferenceById(id);
		mv.addObject("student", student);
		return mv;
	}
	
	@GetMapping("/delete/{id}")
	public String deleteStudent(@PathVariable("id") Integer id) {
		studentRepository.deleteById(id);
		String url = "redirect:/list-students";
		return url;
	}
	
	@PostMapping("/insert-students")
	public ModelAndView postStudents(Student student) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect:/list-students");
		studentRepository.save(student);
		return mv;
	}
	
	@PostMapping("/update")
	public ModelAndView update(Student student) {
		ModelAndView mv = new ModelAndView();
		studentRepository.save(student);
		mv.setViewName("redirect:/list-students");
		return mv;
	}
	
	
}
