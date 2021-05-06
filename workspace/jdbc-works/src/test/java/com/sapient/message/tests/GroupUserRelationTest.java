package com.sapient.message.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.sapient.dao.GroupUserRelationDAO;
import com.sapient.entity.GroupUserRelation;
import com.sapient.interfaces.IGroupUserRelationDAO;

public class GroupUserRelationTest {

	private GroupUserRelation gu = null;
	private IGroupUserRelationDAO dao = null;
	
	@Before
	public  void setUp() {
		gu= new GroupUserRelation();
		dao = new GroupUserRelationDAO() ;

		gu.setGroup_id(8);
	    //g.setCreated_at("12-04-2021");
	    //g.setUpdated_at("12-04-2022");
		gu.setUser_id(3);
		gu.setIsAdmin(true);
		
		
	}
	
	
	


	@Test
	public void groupuserRelationPostTest() {
		// expecting vs actuals 
		
		//assertEquals(true, dao.saveGroupUserRelation(gu));
	}

	
	
	@Test
	public void groupGetAllTest() {
		assertEquals(8, dao.getAllGroupUserRelation().size());
	}
}
