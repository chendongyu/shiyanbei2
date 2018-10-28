package org.soen387.app.TransactionScript;

import org.soen387.app.common.CommonUtil;
import org.soen387.app.rdg.UserRDG;
import org.soen387.app.viewHelper.UserHelper;

public class ViewUserTS{

	private static UserRDG userRDG;
	
	public static boolean exceute(UserHelper viewHelper,String userName) {
		
		if(userRDG == null) {
			userRDG = new UserRDG(userName,null);
		}
		UserRDG userByName = userRDG.getUserByName();
		
		if(userByName == null || CommonUtil.isEmpty(userByName.getUserName())) {	
			return false;
		}else {
			viewHelper.setUserName(userByName.getUserName());
			viewHelper.setPassWord(userByName.getPassWord());
			return true;
		}
		
	}
}
