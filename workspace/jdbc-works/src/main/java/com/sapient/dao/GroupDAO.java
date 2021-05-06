package com.sapient.dao;



import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sapient.entity.Group;

import com.sapient.interfaces.IGroupDAO;

import com.sapient.utils.GetConnection;

public class GroupDAO implements IGroupDAO {
 @Override
	public boolean saveGroup(Group group) {
		String sql = "Insert into group_details(group_name,Created_by,Group_description) values(?,?,?);";

		try {
			PreparedStatement ps = GetConnection.getMySQLConn().prepareStatement(sql);
			//ps.setInt(1, group.getGroup_id());
			//ps.setString(2, group. getCreated_at());
			//ps.setString(3, group.getUpdated_at());
			ps.setString(1, group.getGroup_name());
			ps.setInt(2, group.getCreated_by());
			ps.setString(3, group.getGroup_description());

			return ps.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		  return false;
	}
 @Override
	public Group getGroup(int gid) {

		String sql = "select group_id,group_name,group_description" + " from group_details where group_id = ?";

		try {
			PreparedStatement ps = GetConnection.getMySQLConn().prepareStatement(sql);
			ps.setInt(1, gid);
			// CTRL + 2 + L
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {

//				Message message = new Message();
//				message.setmId(rs.getInt(1));
//				message.setSenderId(rs.getInt(2));
//				message.setRecevrId(rs.getInt(3));
//				message.setMessage(rs.getString(4));
//				message.setIsAccepted(rs.getString(5));
				Group g =  new Group();
        g.setGroup_id(rs.getInt(1));
        g.setGroup_name(rs.getString(2));
        g.setGroup_description(rs.getString(3));

				return g;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;

	}
 @Override
	public List<Group> getAllGroups() {
		String sql = "select group_id,group_name" + " from group_details";
		List<Group> list = null;
		try {
			PreparedStatement ps = GetConnection.getMySQLConn().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			list = new ArrayList<Group>();
			while (rs.next()) {
				Group g = new Group();
        g.setGroup_id(rs.getInt(1));
        g.setGroup_name(rs.getString(2));
				list.add(g);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

	

}
