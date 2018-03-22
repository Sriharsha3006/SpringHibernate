package com.uwyo.bo;

import java.util.ArrayList;

import com.uwyo.model.StudentEntity;

public interface StudentBO {
	
	public ArrayList<StudentEntity> getListBo();
	
	public StudentEntity getStudentByIdBo(int id);
	
	public int setStudent(StudentEntity student);

}
