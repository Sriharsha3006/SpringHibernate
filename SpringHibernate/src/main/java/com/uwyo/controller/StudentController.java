package com.uwyo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.uwyo.bo.StudentBO;
import com.uwyo.model.StudentEntity;

@RestController
@RequestMapping(value="/do")
public class StudentController {
	
	@Autowired
	StudentBO studentBO;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public ArrayList<StudentEntity> listStudents(){
		ArrayList<StudentEntity> studentList = studentBO.getListBo();
		return studentList;
	}
	
	@RequestMapping(value="/studentById/{id}", method=RequestMethod.GET, produces={MediaType.APPLICATION_JSON_VALUE})
	public StudentEntity  getStudentByIdController(@PathVariable(value="id") int id){
		StudentEntity student = studentBO.getStudentByIdBo(id);
		//HttpStatus status = student!=null ? HttpStatus.OK : HttpStatus.NOT_FOUND;
		//return new ResponseEntity<StudentEntity>(student, status);
		return student;
	}
	
	@RequestMapping(value="/setStudent", method=RequestMethod.POST, consumes={MediaType.APPLICATION_JSON_VALUE})
	public String setStudent(@RequestBody StudentEntity student){
		int res = studentBO.setStudent(student);
		if(res==1){
			return "Succesfully Inserted";
		}
		else return "Not Inserted";
	}

}
