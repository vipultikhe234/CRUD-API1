package com.alpha.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	private int roll;
	private String name;
	private String grade;
	private String dep;
	
	@Id
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", grade=" + grade + ", dep=" + dep + "]";
	}

}
