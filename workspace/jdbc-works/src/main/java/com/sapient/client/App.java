package com.sapient.client;

import com.sapient.dao.GroupDAO;
import com.sapient.dao.GroupUserRelationDAO;
import com.sapient.entity.Group;
import com.sapient.entity.GroupUserRelation;
import com.sapient.interfaces.IGroupDAO;


public class App {
	public static void main(String[] args) {
//		Message m = new Message(); 
//		m.setmId(101);
//		m.setSenderId(123);
//		m.setRecevrId(333);
//		m.setMessage("Hello How Are You");
//		m.setIsAccepted("Y");
//		
//		IMessageDAO dao = new MessageDAO(); 
//		
////		System.out.println(dao.saveMessage(m) ? "Inserted":"Not Inserted");
//		
//		
////		System.out.println(dao.getMessage(101));
//		
//		for(Message mm : dao.getAllMessages()) {
//			System.out.println(mm);
//		}
		
		
//		Group g=new Group();
//		g.setGroup_id(1);
//		g.setCreated_at("12-04-2021");
//		g.setUpdated_at("12-04-2022");
//		g.setGroup_name("pod6");
//		g.setCreated_by(2);
//		g.setGroup_description("sleep well");
//		IGroupDAO dao = new GroupDAO();
//    //System.out.println(dao.saveGroup(g) ? "Created group success": "failed to create new group");
//    //System.out.println(dao.getGroup(4));
//    for(Group mm : dao.getAllGroups()) {
//		System.out.println(mm);
//	}

		GroupUserRelation gu= new GroupUserRelation();
		gu.setGroup_id(3);
		gu.setUser_id(2);
		gu.setIsAdmin(true);
		GroupUserRelationDAO dao = new GroupUserRelationDAO();
	System.out.println(dao.saveGroupUserRelation(gu) ? "Created groupuser success": "failed to create new groupuser");
	    //System.out.println(dao.getGroupUserRelation(1,2));
//	    for(GroupUserRelation mm : dao.getAllGroupUserRelation()) {
//		System.out.println(mm);
//		}
	}
}
