package org.soen387.app.viewHelper;

public class UserHelper implements ViewHelper{

	private String userId;
	
	private String userName;

	private String passWord;
	
	private String status;

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
 
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public String toJson() {
		
		StringBuffer userJson = new StringBuffer();
		userJson.append("{\"id\":");
		userJson.append(userId);
		userJson.append(",\"user\":\"");
		userJson.append(userName);
		userJson.append("\"}");
		return userJson.toString();
	}
}
