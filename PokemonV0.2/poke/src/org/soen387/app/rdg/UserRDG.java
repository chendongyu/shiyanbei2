package org.soen387.app.rdg;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserRDG extends BaseRDG {

	private String userName;

	private String passWord;

	public UserRDG(String userName,String passWord) {
		
		this.userName = userName;
		this.passWord = passWord;
	}
	
	public List<UserRDG> findAll() {
		List<UserRDG> userList = new ArrayList<UserRDG>();
		try {
			ResultSet resultSet = excuteSelSql("SELECT USER.USER_NAME,USER.USER_PASSWORD FROM USER");
			while (resultSet.next()) {
				userList.add(new UserRDG(resultSet.getString(1),resultSet.getString(2)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userList;

	}
	
	public UserRDG getUserByName() {
		
		UserRDG userRDG = null;
		try {
			ResultSet resultSet = excuteSelSql("SELECT USER.USER_NAME,"
					+ "USER.USER_PASSWORD FROM USER WHERE USER.USER_NAME = ?",userName);
			if (resultSet.next()) {
				userRDG = new UserRDG(resultSet.getString(1),resultSet.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userRDG;
	}
	
	public int insert() {
		
		int num = 0;
		try {
			num = excuteInsertSql("INSERT INTO USER(USER.USER_NAME,"
					+ "USER.USER_PASSWORD,USER.USER_PLAYER_ID) VALUES( ?, ?, ?)",userName,passWord,0);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return num;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassWord() {
		return passWord;
	}
}
