package com.uwyo.dao;

import java.util.ArrayList;

import com.uwyo.model.StudentEntity;

public interface StudentDAO {
	
	public ArrayList<StudentEntity> getStudentList();
	
	public StudentEntity getStudentById(int id);
	
	public int setStudent(StudentEntity student);

}
