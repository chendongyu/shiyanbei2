package org.soen387.app.TransactionScript;

import org.soen387.app.rdg.ChallengeRDG;

public class playerChallengeTS {

	public static boolean exceute(String challenger, String challengee, String status) {
		
		ChallengeRDG challengeRDG = new ChallengeRDG();
		challengeRDG.setChallenger(challenger);
		challengeRDG.setChallengee(challengee);
		challengeRDG.setStatus(status);
		
		
		int rol = ChallengeRDG.insert(challengeRDG); 
		
		
		
		
		if(rol>0) {
			return true;
		}else {
			return false;
		}
	}
	
}
