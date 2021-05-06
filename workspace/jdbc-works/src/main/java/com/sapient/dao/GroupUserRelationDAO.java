package com.sapient.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.sapient.entity.GroupUserRelation;
import com.sapient.interfaces.IGroupUserRelationDAO;
import com.sapient.utils.GetConnection;

public class GroupUserRelationDAO implements IGroupUserRelationDAO {

	@Override
	public boolean saveGroupUserRelation(GroupUserRelation groupUser) {
		String sql = "Insert into group_user_relation(group_id,user_id,is_admin) values(?,?,?);";

		try {
			PreparedStatement ps = GetConnection.getMySQLConn().prepareStatement(sql);
			//ps.setInt(1, group.getGroup_id());
			//ps.setString(2, group. getCreated_at());
			//ps.setString(3, group.getUpdated_at());
			ps.setInt(1, groupUser.getGroup_id());
			ps.setInt(2, groupUser.getUser_id() );
			ps.setBoolean(3, groupUser.getIsAdmin());

			return ps.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public GroupUserRelation getGroupUserRelation(int groupId, int userId) {
		String sql = "select group_id,user_id,is_admin" + " from group_user_relation where group_id  =  ? and user_id =? ";

		try {
			PreparedStatement ps = GetConnection.getMySQLConn().prepareStatement(sql);
			ps.setInt(1, groupId);
			ps.setInt(2, userId);
			
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {


				GroupUserRelation gu =  new GroupUserRelation();
        gu.setGroup_id(rs.getInt(1));
        gu.setUser_id(rs.getInt(2));
        gu.setIsAdmin(rs.getBoolean(3));

				return gu;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		return null;
	}

	@Override
	public List<GroupUserRelation> getAllGroupUserRelation() {
		String sql = "select group_id,user_id,is_admin" + " from group_user_relation";
		List<GroupUserRelation> list = null;
		try {
			PreparedStatement ps = GetConnection.getMySQLConn().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			list = new ArrayList<GroupUserRelation>();
			while (rs.next()) {
				GroupUserRelation gu = new GroupUserRelation();
        gu.setGroup_id(rs.getInt(1));
        gu.setUser_id(rs.getInt(2));
        gu.setIsAdmin(rs.getBoolean(3));
				list.add(gu);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

}
