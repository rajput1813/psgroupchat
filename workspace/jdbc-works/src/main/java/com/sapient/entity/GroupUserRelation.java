package com.sapient.entity;


public class GroupUserRelation{
    int group_id;
    int user_id;
    boolean isAdmin;
   

    public GroupUserRelation() {
		
	}

	public GroupUserRelation(int group_id, int user_id, boolean isAdmin) {
		super();
		this.group_id = group_id;
		this.user_id = user_id;
		this.isAdmin = isAdmin;
	}

	public int getGroup_id() {
        return this.group_id;
    }

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }

    public int getUser_id() {
        return this.user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public boolean isIsAdmin() {
        return this.isAdmin;
    }

    public boolean getIsAdmin() {
        return this.isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
    @Override
	public String toString() {
		return  "group_id="+group_id+ "user_id="+ user_id+ "isAdmin= " + isAdmin;
	}
}