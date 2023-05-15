package com.alpha.controller;

import java.util.List;

import com.alpha.entity.Student;
import com.alpha.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@Autowired
	StudentService service;

	@GetMapping("/all")
	public List<Student> getStudentRecord() {
		return service.getStudentRecord();
	}

	@PostMapping("/add")
	public String insertStudent(@RequestBody List<Student> al) {

		System.out.println("comming students = " + al);
		String msg = service.insertStudent(al);
		return msg;
	}

	@GetMapping("/byid/{roll}")
	public List<Student> getStudentByID(@PathVariable int roll) {

		List<Student> list = service.getStudentByID(roll);
		return list;
	}
}
