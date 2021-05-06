package com.sapient.interfaces;

import java.util.List;

import com.sapient.entity.GroupUserRelation;

public interface IGroupUserRelationDAO {
public boolean saveGroupUserRelation (GroupUserRelation  groupUser); 
	
	// get message
	public GroupUserRelation getGroupUserRelation (int groupId,int userId); 
	
	// get all messages
	public List<GroupUserRelation > getAllGroupUserRelation (); 

}
