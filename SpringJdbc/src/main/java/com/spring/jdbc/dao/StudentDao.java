package com.spring.jdbc.dao;

import com.spring.jdbc.entities.Student;

public interface StudentDao {
	public int insert(Student student);  // Inserting Method
	public int change(Student student);  // update Method
	public int delete(int studentID);    // delete method 
}
