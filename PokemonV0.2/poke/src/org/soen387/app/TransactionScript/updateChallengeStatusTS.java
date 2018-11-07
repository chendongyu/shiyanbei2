package org.soen387.app.TransactionScript;

import org.soen387.app.rdg.ChallengeRDG;

public class updateChallengeStatusTS {

	public static boolean exceute(String challengeId,String status) {
		
		ChallengeRDG challengeRDG = new ChallengeRDG();
		
		challengeRDG.setId(challengeId);
		challengeRDG.setStatus(status);
		int rol = ChallengeRDG.update(challengeRDG);
		
		if(rol>0) {
			return true;
		}else {
			return false;
		}
	}
	
}
