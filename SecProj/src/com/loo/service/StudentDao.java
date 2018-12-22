package com.loo.service;

import java.util.List;

import com.loo.javabean.Student;

public interface StudentDao {
	public List<Student> queryAllStudents();
	public Student queryStudentById(String sid);
	
	public boolean addStudent(Student student);
	
	public boolean updataStudent(Student student);
	
	public boolean deleteStudent(String sid);
	
	public String getNewSid();
	

}
