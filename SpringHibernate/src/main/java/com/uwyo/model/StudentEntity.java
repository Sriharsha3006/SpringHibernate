package com.uwyo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;




@Entity
@Table(name="STUDENT")
public class StudentEntity implements Serializable {
	
	private static final long serialVersionUID = 6722751360969002992L;
	
	public StudentEntity(int studentId) {
		// TODO Auto-generated constructor stub
		this.studentId = studentId;
	}
	public StudentEntity() {
		
	}
	
	protected int studentId;
	
	@Column(name ="STUDENTNAME")
	protected String studentName;
	
	@Column(name ="GPA")
	private float gpa;
	
	@Transient
	private String advisor;
	
	@Id
	@Column(name ="STUDENTID")
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public float getGpa() {
		return gpa;
	}

	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
	

}
