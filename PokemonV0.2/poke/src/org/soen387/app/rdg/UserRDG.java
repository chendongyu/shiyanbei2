package org.soen387.app.rdg;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.soen387.app.common.CommonUtil;

public class UserRDG extends BaseRDG {

	private String userName;

	private String passWord;
	
	public UserRDG() {
		super();
	}

	public UserRDG(String userName,String passWord) {
		
		this.userName = userName;
		this.passWord = passWord;
	}
	
	public static List<UserRDG> findAll() {
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
	public static UserRDG find(String userName) {
		//check if there is an already used user name(in case of duplicate)
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
	
	public static UserRDG find(String userName, String passWord) {
		
		UserRDG userRDG = null;
		try {
			ResultSet resultSet = excuteSelSql("SELECT USER.USER_NAME,"    //using base class method
					+ "USER.USER_PASSWORD FROM USER WHERE USER.USER_NAME = ? AND USER.USER_PASSWORD = ?",userName,passWord);
			if (resultSet.next()) {          //check if is end of file
				userRDG = new UserRDG(resultSet.getString(1),resultSet.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userRDG;
	}
	
	public static int insert(UserRDG userRDG) {
		
		if(userRDG == null || CommonUtil.isEmpty(userRDG.getPassWord())//using the method isEmpty, if it is null
				|| CommonUtil.isEmpty(userRDG.getUserName())) {
			return 0;
		}
		
		int num = 0;
		try {
			num = excuteInsertSql("INSERT INTO USER(USER.USER_NAME,"
					+ "USER.USER_PASSWORD) VALUES( ?, ?)",userRDG.getUserName(),userRDG.getPassWord());
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
	
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
}
