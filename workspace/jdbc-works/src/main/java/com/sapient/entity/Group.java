package com.sapient.entity;
public class Group {
	private int  group_id;
	private  String  Created_at ; 
	private String  Updated_at; 
	private String  group_name; 
	private int  Created_by;
	private String group_description;
	
	public Group() {
	}

	public Group(int group_id, String  Created_at,String  Updated_at, String  group_name, int Created_by,String group_description) {
		super();
		this.group_id = group_id;
		this.Created_at = Created_at;
		this.Updated_at = Updated_at;
		this.group_name = group_name;
		this.Created_by= Created_by;
		this.group_description= group_description;
		
	}

	public int getGroup_id() {
		return group_id;
	}
	public void setGroup_id(int group_id) {
		this.group_id = group_id;
	}
	public String getCreated_at() {
		return Created_at;
	}
	public void setCreated_at(String created_at) {
		Created_at = created_at;
	}
	public String getUpdated_at() {
		return Updated_at;
	}
	public void setUpdated_at(String updated_at) {
		Updated_at = updated_at;
	}
	public String getGroup_name() {
		return group_name;
	}
	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}
	public int getCreated_by() {
		return Created_by;
	}
	public void setCreated_by(int created_by) {
		Created_by = created_by;
	}
	public String getGroup_description() {
		return group_description;
	}
	public void setGroup_description(String group_description) {
		this.group_description = group_description;
	}
	@Override
	public String toString() {
		return  "group_id="+group_id+ "group_name="+ group_name;
	}
	
}
