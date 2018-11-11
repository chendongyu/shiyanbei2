package org.soen387.app.TransactionScript;

import java.util.List;

import org.soen387.app.common.CommonUtil;
import org.soen387.app.rdg.DeckRDG;
import org.soen387.app.rdg.UserRDG;
import org.soen387.app.viewHelper.BoardHelper;
import org.soen387.app.viewHelper.CardHelper;
import org.soen387.app.viewHelper.ViewHelper;

public class ViewBoardTS {

	public static boolean exceute(BoardHelper viewHelper,String gameId) {
		
		if(CommonUtil.isEmpty(gameId)) {
			return false;
		}
		
		//TODO
	
//		UserRDG userRDG = UserRDG.find(userName);
//
//		//if the user's password is null then return false
//		if(userRDG==null || CommonUtil.isEmpty(userRDG.getPassWord())) { 
//			return false;
//		}else {
//			
//			CommonUtil.setPropToVH(userRDG, viewHelper);
			return true;
//		}
	}
		
		
}
