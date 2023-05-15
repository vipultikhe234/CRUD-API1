package com.alpha.service;

import java.util.List;

import com.alpha.dao.StudentDao;
import com.alpha.entity.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	@Autowired
	StudentDao dao;

	public List<Student> getStudentRecord() {
		return dao.getStudentRecord();
	}

	public String insertStudent(List<Student> al) {
		String msg = dao.insertStudent(al);
		return msg;
	}

	public List<Student> getStudentByID(int roll) {
		return dao.getStudentByID(roll);
	}

}
