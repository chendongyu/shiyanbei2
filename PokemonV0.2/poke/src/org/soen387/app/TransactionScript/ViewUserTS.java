package org.soen387.app.TransactionScript;

import org.soen387.app.common.CommonUtil;
import org.soen387.app.rdg.UserRDG;
import org.soen387.app.viewHelper.UserHelper;

public class ViewUserTS{

	public static boolean exceute(UserHelper viewHelper,String userName) {

		if(CommonUtil.isEmpty(userName)) {
			return false;
		}

		//TODO
		//check if there's an existing userName
		UserRDG userRDG = UserRDG.find(userName);

		//if the user's password is null then return false
		if(CommonUtil.isEmpty(userRDG.getPassWord())) { 
			return false;
		}else {
			viewHelper.setUserName(userRDG.getUserName());  //if the test is passed, then set the parameter of viewhelper to help find it 
			viewHelper.setPassWord(userRDG.getPassWord());
			return true;
		}
		
	}
}
