package com.alpha.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.alpha.entity.Student;



@Repository
public class StudentDao {

	@Autowired
	SessionFactory sf;

	public List<Student> getStudentRecord() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Student.class);
		return criteria.list();
	}

	public String insertStudent(List<Student> al) {

		System.out.println("In dao : " + al);
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		for (Student student : al) {
			session.save(student);
		}
		tr.commit();
		return "Student saved success..!!!";
	}

	public List<Student> getStudentByID(int roll) {

		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Student.class);
		cr.add(Restrictions.eq("roll", roll));
		List<Student> list = cr.list();
		return list;
	}

}
