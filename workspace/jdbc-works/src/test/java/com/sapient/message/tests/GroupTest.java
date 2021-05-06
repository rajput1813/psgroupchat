package com.sapient.message.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.sapient.dao.GroupDAO;
import com.sapient.entity.Group;
import com.sapient.interfaces.IGroupDAO;

public class GroupTest {
	private Group g = null;
	private IGroupDAO  dao = null;
	
	@Before
	public  void setUp() {
		g= new Group();
		dao = new GroupDAO() ;

		g.setGroup_id(7);
	    //g.setCreated_at("12-04-2021");
	    //g.setUpdated_at("12-04-2022");
		g.setGroup_name("pod7");
		g.setCreated_by(3);
		g.setGroup_description("all well");
		
	}
	
	
	@Test
	public void groupPostTest() {
		// expecting vs actuals 
		
		//assertEquals(true, dao.saveGroup(g));
	}

	
	
	@Test
	public void groupGetAllTest() {
		assertEquals(11, dao.getAllGroups().size());
	}
	



}
