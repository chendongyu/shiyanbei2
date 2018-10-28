package org.soen387.app.rdg;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserRDG extends BaseRDG {

	private String userName;

	private String passWord;

	public List<UserRDG> findAll() {
		List<UserRDG> userList = new ArrayList<UserRDG>();
		try {
			ResultSet resultSet = excuteSql("SELECT USER.USER_NAME,USER.USER_PASSWORD FROM USER");
			while (resultSet.next()) {
				UserRDG userRDG = new UserRDG();
				userRDG.setUserName(resultSet.getString(1));
				userRDG.setPassWord(resultSet.getString(2));
				userList.add(userRDG);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userList;

	}
	
	public UserRDG getUserByPwd(String password) {
		
		UserRDG userRDG = new UserRDG();
		try {
			ResultSet resultSet = excuteSql("SELECT USER.USER_NAME,USER.USER_PASSWORD FROM USER WHERE USER.USER_PASSWORD = ?");
			if (resultSet.next()) {
				userRDG.setUserName(resultSet.getString(1));
				userRDG.setPassWord(resultSet.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userRDG;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
}
