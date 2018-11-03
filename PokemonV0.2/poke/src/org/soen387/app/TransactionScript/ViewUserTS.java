package org.soen387.app.TransactionScript;

import org.soen387.app.common.CommonUtil;
import org.soen387.app.rdg.UserRDG;
import org.soen387.app.viewHelper.UserHelper;

public class ViewUserTS{

	public static boolean exceute(UserHelper viewHelper,String userName) {

		if(CommonUtil.isEmpty(userName)) {
			return false;
		}

		UserRDG userRDG = UserRDG.find(userName);

		if(CommonUtil.isEmpty(userRDG.getPassWord())) {
			return false;
		}else {
			viewHelper.setUserName(userRDG.getUserName());
			viewHelper.setPassWord(userRDG.getPassWord());
			return true;
		}
		
	}
}
