package com.uwyo.test;

import static org.junit.Assert.*;

import java.util.ArrayList;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.uwyo.bo.StudentBO;
import com.uwyo.model.StudentEntity;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:uwyo-test.xml" })
public class TestStudentBO {
	
	@Autowired
	StudentBO studentBo;

	@Test
	public void testGetList() {
		ArrayList<StudentEntity> actualList = studentBo.getListBo();
		String name = actualList.get(0).getStudentName();
		assertEquals("HARSHA", name);
	}
	
	@Test
	public void testSave() {
		StudentEntity st = new StudentEntity();
		st.setStudentId(45);
		st.setStudentName("Pepo");
		st.setGpa(3.5f);
		studentBo.setStudent(st);
	}

}
