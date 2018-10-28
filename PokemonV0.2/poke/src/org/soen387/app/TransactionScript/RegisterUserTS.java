package org.soen387.app.TransactionScript;

import org.soen387.app.rdg.UserRDG;

public class RegisterUserTS {

	private static UserRDG userRDG;
	
	public static boolean exceute(String userName,String password) {
		
		if(userRDG == null) {
			userRDG = new UserRDG(userName,password);
		}
		
		int rol = userRDG.insert();
		
		if(rol>0) {
			return true;
		}else {
			return false;
		}
	}
}
