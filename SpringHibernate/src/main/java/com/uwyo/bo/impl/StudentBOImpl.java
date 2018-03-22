package com.uwyo.bo.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uwyo.bo.StudentBO;
import com.uwyo.dao.StudentDAO;
import com.uwyo.model.StudentEntity;

@Service
public class StudentBOImpl implements StudentBO {
	
	@Autowired
	StudentDAO studentDAO;

	public ArrayList<StudentEntity> getListBo() {
		System.out.println("I am in StudentBOImpl getListBo");
		return studentDAO.getStudentList();
	}

	@Override
	public StudentEntity getStudentByIdBo(int id) {
		
		return studentDAO.getStudentById(id);
	}

	@Override
	public int setStudent(StudentEntity student) {
		
		return studentDAO.setStudent(student);
	}
	

}
